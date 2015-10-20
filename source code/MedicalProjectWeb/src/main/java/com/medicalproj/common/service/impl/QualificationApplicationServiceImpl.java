package com.medicalproj.common.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.admin.dto.param.ListQualificationApplicationParam;
import com.medicalproj.common.dao.QualificationApplicationMapper;
import com.medicalproj.common.dao.QualificationApplicationViewMapper;
import com.medicalproj.common.domain.QualificationApplication;
import com.medicalproj.common.domain.QualificationApplicationView;
import com.medicalproj.common.domain.QualificationApplicationViewExample;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IQualificationApplicationService;
import com.medicalproj.common.util.AssertUtil;
import com.medicalproj.common.util.PagerHelper;
import com.medicalproj.web.util.Constants;

@Service
public class QualificationApplicationServiceImpl implements
		IQualificationApplicationService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private QualificationApplicationMapper qualificationApplicationMapper;
	
	@Autowired
	private QualificationApplicationViewMapper qualificationApplicationViewMapper;
	
	@Override
	public void submitApplication(Integer yszgzId, Integer auditUserId,
			Integer applyUserId) throws ServiceException {
		try {
			QualificationApplication application = new QualificationApplication();

			Date now = new Date();
			
			application.setApplyTime(now);
			application.setApplyUserId(applyUserId);
			application.setReviewUserId(auditUserId);
			application.setStatus(Constants.QUALIFICATION_APPLICATION_STATUS_WAIT_FOR_REVIEW);
			application.setYszgzImgId(yszgzId);
			
			this.saveOrUpdateQualificationApplication(application);
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e.getMessage(),e);
		}
	}

	private void saveOrUpdateQualificationApplication(
			QualificationApplication application) {
		if( application != null ){
			if( application.getId() == null ){
				qualificationApplicationMapper.insertSelective(application);
			}else{
				qualificationApplicationMapper.updateByPrimaryKeySelective(application);
			}
		}
		
	}

	@Override
	public List<QualificationApplicationView> listQualificationApplicationViewByCond(
			ListQualificationApplicationParam param) throws ServiceException {
		QualificationApplicationViewExample example = trans2QualificationApplicationViewExample(param);
		example.setOrderByClause("APPLY_TIME DESC");
		
		RowBounds rowBounds = new RowBounds(PagerHelper.getStart(param.getPage(), param.getPageSize()), param.getPageSize());
		return qualificationApplicationViewMapper.selectByExampleWithRowbounds(example, rowBounds);

	}

	@Override
	public int countQualificationApplicationViewByCond(
			ListQualificationApplicationParam param) throws ServiceException {
		QualificationApplicationViewExample example = trans2QualificationApplicationViewExample(param);
		return qualificationApplicationViewMapper.countByExample(example);
	}

	private QualificationApplicationViewExample trans2QualificationApplicationViewExample(
			ListQualificationApplicationParam param) {
		if( param == null ){
			return new QualificationApplicationViewExample();
		}
		
		QualificationApplicationViewExample example = new QualificationApplicationViewExample();
		QualificationApplicationViewExample.Criteria c = example.createCriteria();
		
		if( AssertUtil.isNotEmpty(param.getApplyTime()) ){
			c.andApplyTimeLike( param.getApplyTime() + "%");
		}
		if( AssertUtil.isNotEmpty(param.getApplyUserName()) ){
			c.andApplyUserNameLike("%" +  param.getApplyUserName() + "%");
		}
		if( AssertUtil.isNotEmpty(param.getStatus()) ){
			c.andStatusEqualTo(param.getStatus() );
		}
		return example;
	}

	@Override
	public void delQualificationApplicationById(Integer applicationId)
			throws ServiceException {
		qualificationApplicationMapper.deleteByPrimaryKey(applicationId);
	}
	
}
