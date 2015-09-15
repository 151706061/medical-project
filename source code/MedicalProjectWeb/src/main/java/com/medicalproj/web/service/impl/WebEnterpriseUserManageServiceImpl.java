package com.medicalproj.web.service.impl;

import org.springframework.stereotype.Service;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.view.UserAuthorizeListView;
import com.medicalproj.web.service.IWebEnterpriseUserManageService;

@Service
public class WebEnterpriseUserManageServiceImpl implements IWebEnterpriseUserManageService {
	
	@Override
	public View<UserAuthorizeListView> listAuthorizeUser(Integer enterpriseUserId, Integer page, Integer pageSize)
			throws ServiceException {
		
		return null;
	}
	
}
