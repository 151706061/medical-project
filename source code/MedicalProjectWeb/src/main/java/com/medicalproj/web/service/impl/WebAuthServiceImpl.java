package com.medicalproj.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IAuthService;
import com.medicalproj.common.service.INotificationService;
import com.medicalproj.common.service.IUserService;
import com.medicalproj.common.util.MappingHelper;
import com.medicalproj.web.dto.param.RegisterParam;
import com.medicalproj.web.dto.session.User;
import com.medicalproj.web.service.IWebAuthService;

@Service
public class WebAuthServiceImpl extends WebBaseServiceImpl implements IWebAuthService {
	@Autowired
	private IUserService userService;
	
	@Autowired
	private INotificationService notificationService;
	
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
	public User getSessionUserByAccount(String account) throws ServiceException {
		try {
			com.medicalproj.common.domain.User user = userService.getByMobileOrEmail(account);
			if( user == null ){
				throw new ServiceException("帐号不存在");
			}
			
			return trans2SessionUser(user);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new ServiceException(e.getMessage(),e);
		}
	}


	private User trans2SessionUser(com.medicalproj.common.domain.User user) {
		if( user != null ){
			User sessionUser = new User();
			sessionUser.setBalance(user.getBalance());
			sessionUser.setEmail(user.getEmail());
			sessionUser.setId(user.getId());
			sessionUser.setMobile(user.getMobile());
			sessionUser.setName(user.getName());
			sessionUser.setRegTime(user.getRegTime());
			sessionUser.setUserType(user.getUserType());
			sessionUser.setUserTypeStr(MappingHelper.getUserTypeValueByCode(user.getUserType()));
			
			return sessionUser;
		}
		return null;
	}


	@Override
	public View<Boolean> reg(RegisterParam param) throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		
		try {
			authService.reg(param);
			view.setData(true);
			
			return view;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
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
