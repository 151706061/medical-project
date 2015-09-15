package com.medicalproj.web.service;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.view.UserAuthorizeListView;

public interface IWebEnterpriseUserManageService {

	View<UserAuthorizeListView> listAuthorizeUser(Integer enterpriseUserId, Integer page, Integer pageSize)throws ServiceException;

}
