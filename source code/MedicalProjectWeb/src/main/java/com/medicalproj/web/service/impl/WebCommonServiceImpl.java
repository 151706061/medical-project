package com.medicalproj.web.service.impl;

import org.springframework.stereotype.Service;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.service.IWebCommonService;

@Service
public class WebCommonServiceImpl implements IWebCommonService {

	@Override
	public View<Boolean> getMobileVerifyCode(String mobile) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
