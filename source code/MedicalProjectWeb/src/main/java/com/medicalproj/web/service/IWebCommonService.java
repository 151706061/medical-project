package com.medicalproj.web.service;

import java.util.List;

import com.medicalproj.common.domain.UserView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;

public interface IWebCommonService {

	View<Boolean> getMobileVerifyCode(String mobile)throws ServiceException;

	View<Integer> getUnreadNotificaitonCount(Integer userId)throws ServiceException;

	View<Boolean> logout()throws ServiceException;

	View<List<UserView>> listAllJuniorDoctor()throws ServiceException;

	View<UserView> getLoginUserInfo(Integer userId)throws ServiceException;

}
