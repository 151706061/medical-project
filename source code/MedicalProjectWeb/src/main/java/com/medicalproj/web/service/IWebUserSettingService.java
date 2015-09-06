package com.medicalproj.web.service;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.param.SettingSaveParam;
import com.medicalproj.web.dto.view.SettingView;

public interface IWebUserSettingService {

	View<SettingView> getSettingByUserId(Integer userId)throws ServiceException;

	View<Boolean> saveSettingByUserId(Integer userId, SettingSaveParam param)throws ServiceException;

}
