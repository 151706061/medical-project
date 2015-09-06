package com.medicalproj.web.service;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;

public interface IWebCommonService {

	View<Boolean> getMobileVerifyCode(String mobile)throws ServiceException;


}
