package com.medicalproj.common.service;

import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.param.RegisterParam;

public interface IAuthService {

	void login(String account, String password)throws ServiceException;

	void reg(RegisterParam param)throws ServiceException;

	void resetPassword(String mobile, String verifyCode, String newPassword)throws ServiceException;


}
