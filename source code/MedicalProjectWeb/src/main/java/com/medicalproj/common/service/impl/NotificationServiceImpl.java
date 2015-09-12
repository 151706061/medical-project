package com.medicalproj.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.dao.NotificationMapper;
import com.medicalproj.common.domain.NotificationExample;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.INotificationService;
import com.medicalproj.web.util.Constants;

@Service
public class NotificationServiceImpl implements INotificationService {
	@Autowired
	private NotificationMapper mapper;
	
	@Override
	public Integer getUnreadNotificationCountByUser(Integer userId) throws ServiceException {
		NotificationExample example = new NotificationExample();
		NotificationExample.Criteria c = example.createCriteria();
		c.andOwnerUserIdEqualTo(userId);
		c.andIsReadEqualTo(Constants.NOTIFICATION_IS_READ_FALSE);
		
		return mapper.countByExample(example);
	}

}
