package com.medicalproj.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.domain.User;
import com.medicalproj.common.dto.view.UserSettingView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IUserService;
import com.medicalproj.web.dto.param.SettingSaveParam;
import com.medicalproj.web.service.IWebUserSettingService;
import com.medicalproj.web.util.Constants;

@Service
public class WebUserSettingServiceImpl implements IWebUserSettingService {
	@Autowired
	private IUserService userService;
	
	@Override
	public View<Boolean> saveSettingByUserId(Integer userId,
			SettingSaveParam param) throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		
		try {
			User user = userService.getById(userId);
			if( user == null ){
				throw new ServiceException("帐号异常，请联系管理员");
			}

			String mobile = param.getMobile();
			String email = param.getEmail();
			String userName = param.getUserName();
			String contactUserName = param.getContactUserName();
			boolean isReceiveNotification = param.isReceiveNotification();
			
			if( user.getUserType().equals(Constants.USER_TYPE_USER )){
				if( !user.getMobile().equals(mobile) ){
					User tmpUser = userService.getByMobile(mobile);
					if( tmpUser != null ){
						throw new ServiceException("手机号已被注册");
					}
				}
				
				if( !user.getEmail().equals(email) ){
					User tmpUser = userService.getByEmail(email);
					if( tmpUser != null ){
						throw new ServiceException("邮箱已被注册");
					}
				}
				
				
				user.setName(userName);
				user.setEmail(email);
				user.setMobile(mobile);
				user.setIsReceiveNotification(isReceiveNotification == true ? Constants.NOTIFICATION_IS_READ_TRUE :Constants.NOTIFICATION_IS_READ_FALSE );
				userService.saveOrUpdate(user);
			}else if( user.getUserType().equals(Constants.USER_TYPE_ENTERPRISE_USER ) ){
				if( !user.getMobile().equals(mobile) ){
					User tmpUser = userService.getByMobile(mobile);
					if( tmpUser != null ){
						throw new ServiceException("手机号已被注册");
					}
				}
				
				user.setName(userName);
				user.setEmail(email);
				user.setMobile(mobile);
				user.setCompanyContactUserName(contactUserName);
				user.setIsReceiveNotification(isReceiveNotification == true ? Constants.NOTIFICATION_IS_READ_TRUE :Constants.NOTIFICATION_IS_READ_FALSE );
				userService.saveOrUpdate(user);
			}
			
			view.setData(true);
			
			return view;
		} catch (Exception e) {
			view.setData(false);
			view.setMsg(e.getMessage());
			return view;
		}
	}
	
	@Override
	public View<UserSettingView> getSetting(Integer userId) throws ServiceException {
		View<UserSettingView> view = new View<UserSettingView>();
		try {
			User user = userService.getById(userId);
			if( user == null ){
				throw new ServiceException("帐号异常，请联系管理员");
			}
			
			UserSettingView setting = new UserSettingView();
			setting.setEmail(user.getEmail());
			setting.setMobile(user.getMobile());
			setting.setIsReceiveNotification(user.getIsReceiveNotification());
			setting.setUserId(userId);
			setting.setUserName(user.getName());
			setting.setContactUserName(user.getCompanyContactUserName());
			
			view.setData(setting);
			return view;
		} catch (Exception e) {
			view.setMsg(e.getMessage());
			return view;
		}
	}
	
}
