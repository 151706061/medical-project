package com.medicalproj.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IAuthService;
import com.medicalproj.common.service.IUserService;
import com.medicalproj.web.dto.param.RegisterParam;
import com.medicalproj.web.service.IWebAuthService;

@Service
public class WebAuthServiceImpl extends WebBaseServiceImpl implements IWebAuthService {
	@Autowired
	private IUserService userService;
	@Autowired
	private IAuthService authService;
	
	@Override
	public View<Boolean> login(String account, String password) throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		
		try {
			authService.login(account,password);
			view.setData(true);
			
			return view;
		} catch (Exception e) {
			view.setMsg(e.getMessage());
			view.setData(false);
			return view;
		}
	}

	@Override
	public View<Boolean> reg(RegisterParam param) throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		
		try {
			authService.reg(param);
			view.setData(true);
			
			return view;
		} catch (Exception e) {
			view.setMsg(e.getMessage());
			view.setData(false);
			return view;
		}
	}

	@Override
	public void resetPwd(String mobile, String verifyCode, String newPassword)
			throws ServiceException {
		
		authService.resetPassword(mobile,verifyCode,newPassword);
	}

	
}
