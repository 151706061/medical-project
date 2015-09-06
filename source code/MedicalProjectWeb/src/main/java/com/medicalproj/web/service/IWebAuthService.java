package com.medicalproj.web.service;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.param.RegisterParam;

public interface IWebAuthService {

	View<Boolean> login(String account, String password)throws ServiceException;

	View<Boolean> reg(RegisterParam param)throws ServiceException;

}
