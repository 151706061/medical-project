package com.medicalproj.common.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.dao.NotificationMapper;
import com.medicalproj.common.dao.NotificationViewMapper;
import com.medicalproj.common.domain.Notification;
import com.medicalproj.common.domain.NotificationExample;
import com.medicalproj.common.domain.NotificationView;
import com.medicalproj.common.domain.NotificationViewExample;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.INotificationService;
import com.medicalproj.common.util.PagerHelper;
import com.medicalproj.web.util.Constants;

@Service
public class NotificationServiceImpl implements INotificationService {
	@Autowired
	private NotificationMapper mapper;
	
	@Autowired
	private NotificationViewMapper notificationViewMapper;
	
	@Override
	public Integer getUnreadNotificationCountByUser(Integer userId) throws ServiceException {
		NotificationExample example = new NotificationExample();
		NotificationExample.Criteria c = example.createCriteria();
		c.andOwnerUserIdEqualTo(userId);
		c.andIsReadEqualTo(Constants.NOTIFICATION_IS_READ_FALSE);
		
		return mapper.countByExample(example);
	}

	@Override
	public List<NotificationView> listNotificationByUser(Integer userId, Integer page, Integer pageSize)
			throws ServiceException {
		try {
			NotificationViewExample example = buildNotificationViewExample(userId);

			int start = PagerHelper.getStart(page,pageSize);
			int limit = pageSize;
			RowBounds bounds = new RowBounds(start,limit);
			return notificationViewMapper.selectByExampleWithRowbounds(example, bounds);
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(),e);
		}
	}

	@Override
	public Integer countNotificationByUser(Integer userId) throws ServiceException {
		try {
			NotificationViewExample example = buildNotificationViewExample(userId);

			return notificationViewMapper.countByExample(example);
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(),e);
		}
	}
	
	private NotificationViewExample buildNotificationViewExample(Integer userId) {
		NotificationViewExample example = new NotificationViewExample();
		NotificationViewExample.Criteria c = example.createCriteria();
		c.andOwnerUserIdEqualTo(userId);
		return example;
	}

	@Override
	public void setNotificationRead(Integer notificationId) throws ServiceException {
		try {
			Notification notification = this.getById(notificationId);
			if( notification != null ){
				notification.setIsRead(Constants.NOTIFICATION_IS_READ_TRUE);
				this.saveOrUpdate(notification);
			}
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(),e);
		}
		
	}

	private void saveOrUpdate(Notification notification) {
		if( notification != null ){
			if( notification.getId() == null ){
				mapper.insertSelective(notification);
			}else{
				mapper.updateByPrimaryKeySelective(notification);
			}
		}
		
	}

	@Override
	public Notification getById(Integer notificationId) throws ServiceException {
		return mapper.selectByPrimaryKey(notificationId);
	}

	
}
