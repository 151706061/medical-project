package com.medicalproj.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.domain.User;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IUserService;
import com.medicalproj.web.dto.param.RegisterParam;
import com.medicalproj.web.service.IWebAuthService;

@Service
public class WebAuthServiceImpl extends WebBaseServiceImpl implements IWebAuthService {
	@Autowired
	private IUserService userService;
	
	@Override
	public View<Boolean> login(String account, String password) throws ServiceException {
		if( account == null ){
			throw new ServiceException("«Î ‰»Î’ ∫≈");
		}
		
		if( password == null ){
			throw new ServiceException("«Î ‰»Î√‹¬Î");
		}
		
		User user = null;
		user = userService.getByMobile(account);
		if( user == null ){
			
			user = userService.getByEmail(account);
			
			if( user == null ){
				throw new ServiceException("’ ∫≈≤ª¥Ê‘⁄");
			}
		}
		
		//≈–∂œ√‹¬Î «∑Ò’˝»∑
	
		
		return null;
	}

	@Override
	public View<Boolean> reg(RegisterParam param) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
