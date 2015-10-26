package com.medicalproj.common.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.admin.dto.param.ListUserParam;
import com.medicalproj.common.dao.UserMapper;
import com.medicalproj.common.dao.UserViewMapper;
import com.medicalproj.common.domain.User;
import com.medicalproj.common.domain.UserExample;
import com.medicalproj.common.domain.UserView;
import com.medicalproj.common.domain.UserViewExample;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IUserService;
import com.medicalproj.common.util.AssertUtil;
import com.medicalproj.common.util.PagerHelper;
import com.medicalproj.web.util.Constants;

@Service
public class UserServiceImpl implements IUserService {
	private Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserViewMapper userViewMapper;

	@Override
	public User getByMobile(String mobile) throws ServiceException {
		try {
			UserExample example = new UserExample();
			UserExample.Criteria c = example.createCriteria();
			c.andMobileEqualTo(mobile);
			
			List<User> ulist = userMapper.selectByExample(example);
			if ( ulist != null && ulist.size() > 0){
				return ulist.get(0);
			}
			return null;
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(),e);
		}
	}

	@Override
	public User getByEmail(String email) throws ServiceException {
		try {
			UserExample example = new UserExample();
			UserExample.Criteria c = example.createCriteria();
			c.andEmailEqualTo(email);
			
			List<User> ulist = userMapper.selectByExample(example);
			if ( ulist != null && ulist.size() > 0){
				return ulist.get(0);
			}
			return null;
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(),e);
		}	
	}

	@Override
	public User initUserByMobile(String mobile) throws ServiceException {
		try {
			if( mobile == null ){
				throw new ServiceException("手机号不能为空");
			}
			
			User user = this.getByMobile(mobile);
			if( user != null ){
				return user;
			}
			
			user = new User();
			user.setBalance(0);
			user.setMobile(mobile);
			/*user.setId(null);
			user.setEmail(null);
			user.setName(null);
			user.setPassword(null);
			user.setRegTime(null);
			user.setUserType(null);
			user.setVerifyCode(null);
			user.setVerifyCodeUpdateTime(null);*/
			this.saveOrUpdate(user);
			return user;
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(),e);
		}
	}

	@Override
	public void saveOrUpdate(User user) throws ServiceException {
		try {
			if( user == null ){
				throw new ServiceException("参数错误");
			}
			
			if( user.getId() == null ){
				userMapper.insertSelective(user);
			}else{
				userMapper.updateByPrimaryKeySelective(user);
			}
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(),e);
		}
		
	}

	@Override
	public User getByMobileOrEmail(String account) throws ServiceException {
		try {
			if( account == null ){
				throw new ServiceException("帐号不能为空");
			}
			String mobile = account;
			User user = this.getByMobile(mobile);
			if( user != null ){
				return user;
			}
			
			String email = account;
			user = this.getByEmail(email);
			if( user != null ){
				return user;
			}
			
			return null;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new ServiceException(e.getMessage(),e);
		}
	}

	@Override
	public User getById(Integer userId) throws ServiceException {
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public List<UserView> listAllJuniorDoctor() throws ServiceException {
		try {
			UserViewExample example = new UserViewExample();
			UserViewExample.Criteria c = example.createCriteria();
			c.andUserTypeCodeEqualTo(Constants.USER_TYPE_JUNIOR_DOCTOR);
			
			return userViewMapper.selectByExample(example);
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}
	
	@Override
	public List<UserView> listAllSeniorDoctor() throws ServiceException {
		try {
			UserViewExample example = new UserViewExample();
			UserViewExample.Criteria c = example.createCriteria();
			c.andUserTypeCodeEqualTo(Constants.USER_TYPE_SENIOR_DOCTOR);
			
			return userViewMapper.selectByExample(example);
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public List<UserView> listUserViewByCond(ListUserParam param) throws ServiceException {
		UserViewExample example = trans2UserViewExample(param);
		example.setOrderByClause("REG_TIME DESC");
		
		RowBounds rowBounds = new RowBounds(PagerHelper.getStart(param.getPage(), param.getPageSize()), param.getPageSize());
		return userViewMapper.selectByExampleWithRowbounds(example, rowBounds);
	}

	

	@Override
	public int countUserViewByCond(ListUserParam param) throws ServiceException {
		UserViewExample example = trans2UserViewExample(param);
		return userViewMapper.countByExample(example);
	}
	
	private UserViewExample trans2UserViewExample(ListUserParam param) {
		if( param == null ){
			return new UserViewExample();
		}
		
		UserViewExample example = new UserViewExample();
		UserViewExample.Criteria c = example.createCriteria();
		
		if( AssertUtil.isNotEmpty(param.getEmail()) ){
			c.andEmailLike("%" +  param.getEmail() + "%");
		}
		if( AssertUtil.isNotEmpty(param.getMobile()) ){
			c.andMobileLike("%" +  param.getMobile() + "%");
		}
		if( AssertUtil.isNotEmpty(param.getName()) ){
			c.andNameLike("%" +  param.getName() + "%");
		}
		if( AssertUtil.isNotEmpty(param.getUserType()) ){
			c.andUserTypeEqualTo( param.getUserType());
		}
		return example;
	}

	@Override
	public void delUserById(Integer userId) throws ServiceException {
		userMapper.deleteByPrimaryKey(userId);
	}
	
}
