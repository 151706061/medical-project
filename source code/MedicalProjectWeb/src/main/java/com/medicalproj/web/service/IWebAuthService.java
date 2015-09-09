package com.medicalproj.web.service;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.param.RegisterParam;
import com.medicalproj.web.dto.session.User;

public interface IWebAuthService {

	View<Boolean> login(String account, String password)throws ServiceException;

	View<Boolean> reg(RegisterParam param)throws ServiceException;

	void resetPwd(String mobile, String verifyCode, String newPassword)throws ServiceException;

	User getSessionUserByAccount(String account)throws ServiceException;

}
