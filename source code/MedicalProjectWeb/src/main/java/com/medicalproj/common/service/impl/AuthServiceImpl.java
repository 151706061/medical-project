package com.medicalproj.common.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.domain.User;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IAuthService;
import com.medicalproj.common.service.IUserService;
import com.medicalproj.web.dto.param.RegisterParam;
import com.medicalproj.web.util.Constants;

@Service
public class AuthServiceImpl implements IAuthService {
	@Autowired
	private IUserService userService;
	
	@Override
	public void login(String account, String password) throws ServiceException {
		try {
			if( account == null ){
				throw new ServiceException("请输入帐号");
			}
			
			if( password == null ){
				throw new ServiceException("请输入密码");
			}
			
			User user = null;
			user = userService.getByMobile(account);
			if( user == null ){
				
				user = userService.getByEmail(account);
				
				if( user == null ){
					throw new ServiceException("帐号不存在");
				}
			}
			
			if( user.getPassword() != null && user.getPassword().equals(password) ){
				//登录成功
				return;
			}else{
				throw new ServiceException("帐号或密码不正确");
			}
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(),e);
		}
	}

	@Override
	public void reg(RegisterParam param) throws ServiceException {
		try {
			if( param == null ){
				throw new ServiceException("参数错误");
			}else if( param.getEmail() == null ){
				throw new ServiceException("请输入邮箱");
			}else if( param.getMobile() == null ){
				throw new ServiceException("请输入手机号");
			}else if( param.getPassword() == null ){
				throw new ServiceException("请输入密码");
			}else if( param.getVerifyCode() == null ){
				throw new ServiceException("请输入验证码");
			}
			User user = userService.getByEmail(param.getEmail());
			if( user != null ){
				throw new ServiceException("邮箱已注册");
			}
			
			user = userService.getByMobile(param.getMobile());
			if( user == null ){
				//获取验证码时会初始化用户数据
				throw new ServiceException("请先进行验证码验证");
			}else{
				if( user.getRegTime() != null ){
					throw new ServiceException("手机号已经注册");
				}
			}
			
			user.setUserType(Constants.USER_TYPE_USER);
			user.setBalance(0);
			user.setEmail(param.getEmail());
			user.setMobile(param.getMobile());
			user.setPassword(param.getPassword());
			user.setRegTime(new Date());
			userService.saveOrUpdate(user);
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(),e);
		}
	}

	@Override
	public void resetPassword(String mobile, String verifyCode,
			String newPassword) throws ServiceException {
		try {
			if( mobile == null ){
				throw new ServiceException("手机号不能为空");
			}else if( verifyCode == null ){
				throw new ServiceException("验证码不能为空");
			}else if( newPassword == null ){
				throw new ServiceException("新密码不能为空");
			}
			
			User user = userService.getByMobile(mobile);
			if( user != null ){
				if( user.getVerifyCode() == null ){
					throw new ServiceException("验证码数据异常");
				}
				
				if( !user.getVerifyCode().equals(verifyCode) ){
					throw new ServiceException("验证码不正确");
				}
				//更新password
				user.setPassword(newPassword);
				userService.saveOrUpdate(user);
			}
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(),e);
		}
		
	}

	
}
