package com.medicalproj.admin.service;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;

public interface IAdminAuthService {

	View<Integer> login(String account, String password)throws ServiceException;


}
