package com.medicalproj.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.INotificationService;
import com.medicalproj.web.dto.view.NotificationListView;
import com.medicalproj.web.service.IWebNotificationService;

@Service
public class WebNotificationServiceImpl implements IWebNotificationService {
	@Autowired
	private INotificationService notificationService;
	
	@Override
	public View<NotificationListView> listNotification(Integer loginUserId,Integer page,Integer pageSize)
			throws ServiceException {
		
		return null;
	}

}
