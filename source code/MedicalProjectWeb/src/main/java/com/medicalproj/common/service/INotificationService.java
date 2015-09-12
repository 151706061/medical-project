package com.medicalproj.common.service;

import com.medicalproj.common.exception.ServiceException;

public interface INotificationService {

	Integer getUnreadNotificationCountByUser(Integer userId)throws ServiceException;

}
