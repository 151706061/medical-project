package com.medicalproj.common.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.dao.UserMapper;
import com.medicalproj.common.domain.User;
import com.medicalproj.common.domain.UserExample;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	private Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private UserMapper mapper;

	@Override
	public User getByMobile(String mobile) throws ServiceException {
		try {
			UserExample example = new UserExample();
			UserExample.Criteria c = example.createCriteria();
			c.andMobileEqualTo(mobile);
			
			List<User> ulist = mapper.selectByExample(example);
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
			
			List<User> ulist = mapper.selectByExample(example);
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
				mapper.insertSelective(user);
			}else{
				mapper.updateByPrimaryKeySelective(user);
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
		return mapper.selectByPrimaryKey(userId);
	}
	
	
	
}
