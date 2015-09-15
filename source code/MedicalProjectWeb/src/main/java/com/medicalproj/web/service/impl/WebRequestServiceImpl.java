package com.medicalproj.web.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.service.IWebRequestService;

@Service
public class WebRequestServiceImpl implements IWebRequestService {
	
	@Override
	public View<Boolean> submitRequest(Integer userId, MultipartFile dicomFile) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
