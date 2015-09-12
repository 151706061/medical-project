package com.medicalproj.web.service;

import com.medicalproj.common.dto.view.UserSettingView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.param.SettingSaveParam;

public interface IWebUserSettingService {

	UserSettingView getSetting(Integer userId)throws ServiceException;


	View<Boolean> saveSettingByUserId(Integer userId, SettingSaveParam param)throws ServiceException;

}
