package com.medicalproj.common.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.dao.AuthorizeUserViewMapper;
import com.medicalproj.common.dao.PayAuthorizeMapper;
import com.medicalproj.common.domain.AuthorizeUserView;
import com.medicalproj.common.domain.AuthorizeUserViewExample;
import com.medicalproj.common.domain.PayAuthorize;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IPayAuthorizeService;
import com.medicalproj.common.util.AssertUtil;
import com.medicalproj.common.util.PagerHelper;
import com.medicalproj.web.util.Constants;

@Service
public class PayAuthorizeServiceImpl implements IPayAuthorizeService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private AuthorizeUserViewMapper authorizeUserViewMapper;
	
	@Autowired
	private PayAuthorizeMapper payAuthorizeMapper;
	
	@Override
	public List<AuthorizeUserView> listAuthorizeUserByEnterprise(
			Integer enterpriseUserId, Integer page, Integer pageSize)
			throws ServiceException {
		try {
			AuthorizeUserViewExample example = buildAuthorizeUserViewExample(enterpriseUserId);

			int start = PagerHelper.getStart(page,pageSize);
			int limit = pageSize;
			RowBounds bounds = new RowBounds(start,limit);
			return authorizeUserViewMapper.selectByExampleWithRowbounds(example, bounds);
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e.getMessage(),e);
		}
	}

	@Override
	public Integer countAuthorizeUserByEnterprise(Integer enterpriseUserId)
			throws ServiceException {
		try {
			AuthorizeUserViewExample example = buildAuthorizeUserViewExample(enterpriseUserId);

			return authorizeUserViewMapper.countByExample(example);
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e.getMessage(),e);
		}
	}

	private AuthorizeUserViewExample buildAuthorizeUserViewExample(
			Integer enterpriseUserId) {
		if( enterpriseUserId == null ){
			return new AuthorizeUserViewExample();
		}
		AuthorizeUserViewExample example = new AuthorizeUserViewExample();
		AuthorizeUserViewExample.Criteria c = example.createCriteria();
		if( AssertUtil.isNotEmpty(enterpriseUserId) ){
			c.andEnterpriseUserIdEqualTo(enterpriseUserId);
		}
		
		return example;
	}

	@Override
	public void authorize(Integer payAuthorizeId) throws ServiceException {
		try {
			PayAuthorize payAuthorize = this.getPayAuthorizeById(payAuthorizeId);
			if( payAuthorize == null ){
				throw new ServiceException("授权数据不存在");
			}
			payAuthorize.setProcessTime(new Date());
			payAuthorize.setStatus(Constants.PAY_AUTHORIZE_STATUS_AUTHORIZED);
			
			this.saveOrUpdatePayAuthorize(payAuthorize);
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e.getMessage(),e);
		}
	}

	private void saveOrUpdatePayAuthorize(PayAuthorize payAuthorize) {
		if( payAuthorize != null ){
			if( payAuthorize.getId() == null ){
				payAuthorizeMapper.insertSelective(payAuthorize);
			}else{
				payAuthorizeMapper.updateByPrimaryKeySelective(payAuthorize);
			}
		}
		
	}

	private PayAuthorize getPayAuthorizeById(Integer payAuthorizeId) {
		return payAuthorizeMapper.selectByPrimaryKey(payAuthorizeId);
	}

	@Override
	public void unauthorize(Integer payAuthorizeId) throws ServiceException {
		try {
			PayAuthorize payAuthorize = this.getPayAuthorizeById(payAuthorizeId);
			if( payAuthorize == null ){
				throw new ServiceException("授权数据不存在");
			}
			payAuthorize.setProcessTime(new Date());
			payAuthorize.setStatus(Constants.PAY_AUTHORIZE_STATUS_NOT_AUTHORIZED);
			
			this.saveOrUpdatePayAuthorize(payAuthorize);
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e.getMessage(),e);
		}
	}

}
