package com.medicalproj.web.service.impl;

import org.springframework.stereotype.Service;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.param.SettingSaveParam;
import com.medicalproj.web.dto.view.SettingView;
import com.medicalproj.web.service.IWebUserSettingService;

@Service
public class WebUserSettingServiceImpl implements IWebUserSettingService {

	@Override
	public View<SettingView> getSettingByUserId(Integer userId)
			throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public View<Boolean> saveSettingByUserId(Integer userId,
			SettingSaveParam param) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
