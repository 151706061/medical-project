package com.medicalproj.common.service.impl;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.dao.QualificationApplicationMapper;
import com.medicalproj.common.domain.QualificationApplication;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IQualificationApplicationService;
import com.medicalproj.web.util.Constants;

@Service
public class QualificationApplicationServiceImpl implements
		IQualificationApplicationService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private QualificationApplicationMapper qualificationApplicationMapper;
	
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
	
}
