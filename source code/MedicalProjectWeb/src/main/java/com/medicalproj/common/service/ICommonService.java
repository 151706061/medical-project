package com.medicalproj.common.service;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;

public interface ICommonService {

	View<Boolean> getVerifyCode(String mobile)throws ServiceException;

}
