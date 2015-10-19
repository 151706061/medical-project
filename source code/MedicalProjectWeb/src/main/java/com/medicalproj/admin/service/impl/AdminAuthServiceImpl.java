package com.medicalproj.admin.service.impl;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.admin.service.IAdminAuthService;
import com.medicalproj.common.domain.User;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IUserService;

@Service
public class AdminAuthServiceImpl implements IAdminAuthService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private IUserService userService;
	
	@Override
	public View<Integer> login(String account, String password) throws ServiceException {
		View<Integer> view = new View<Integer>();
		
		try {
			if( account == null || password == null ){
				throw new ServiceException("账号或密码不可为空");
			}
			
			User user = userService.getByMobile(account);
			if( user == null ){
				user = userService.getByEmail(account);
				if( user == null ){
					throw new ServiceException("账号或密码不正确");
				}
			}
			
			if( !user.getPassword().equals(password) ){
				throw new ServiceException("账号或密码不正确");
			}else{
				Subject subject = SecurityUtils.getSubject();
				AuthenticationToken token = new UsernamePasswordToken(account, password);
				subject.login(token);
				
				view.setData(user.getId());
				return view;
			}
		} catch (Exception e) {
			logger.error("login",e);
			view.setMsg(e.getMessage());
			return view;
		}
	}

}
