package com.medicalproj.admin.service;

import com.medicalproj.admin.dto.param.ListUserParam;
import com.medicalproj.admin.dto.view.UserListView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;

public interface IAdminUserManageService {

	View<UserListView> listUser(ListUserParam param)throws ServiceException;

	View<Boolean> delUser(Integer userId)throws ServiceException;

}
