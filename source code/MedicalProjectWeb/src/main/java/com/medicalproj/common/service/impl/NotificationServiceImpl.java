package com.medicalproj.common.service.impl;

import java.util.Date;
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
import com.medicalproj.common.domain.Study;
import com.medicalproj.common.domain.User;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.INotificationService;
import com.medicalproj.common.service.IStudyService;
import com.medicalproj.common.service.ITaskService;
import com.medicalproj.common.service.IUserService;
import com.medicalproj.common.util.PagerHelper;
import com.medicalproj.web.util.Constants;

@Service
public class NotificationServiceImpl implements INotificationService {
	@Autowired
	private NotificationMapper mapper;
	
	@Autowired
	private NotificationViewMapper notificationViewMapper;
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private ITaskService taskService;
	
	@Autowired
	private IStudyService studyService;
	
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

	@Override
	public void createDiagnoseInviteNotification(Integer processUserId, Integer studyId, Integer toUserId)
			throws ServiceException {
		User processUser = userService.getById(processUserId);
		
		Notification notification = new Notification();
		notification.setContent("收到" + processUser.getName() + "发来的诊断邀请.");
		notification.setCreateTime(new Date());
		notification.setFromId(processUserId);
		notification.setFromType(Constants.NOTIFICATION_FROM_TYPE_USER);
		notification.setIsRead(Constants.NOTIFICATION_IS_READ_FALSE);
		notification.setOwnerUserId(toUserId);
		notification.setSourceId(studyId);
		notification.setStatus(Constants.NOTIFICATION_STATUS_WAIT_FOR_REVIEW);
		notification.setTitle("诊断邀请通知");
		notification.setType(Constants.NOTIFICATION_TYPE_DIAGNOSE_INVITATION);
		
		this.saveOrUpdate(notification);
	}

	@Override
	public void approve(Integer notificationId, Integer processUserId) throws ServiceException {
		Notification notification = this.getById(notificationId);
		if( notification.getOwnerUserId() == null || !notification.getOwnerUserId().equals(processUserId)){
			throw new ServiceException("无权操作");
		}
		
		if( notification.getType() != null){
			if( notification.getType().equals(Constants.NOTIFICATION_TYPE_DIAGNOSE_INVITATION) ){
				
				Integer toUserId = notification.getOwnerUserId();
				Integer studyId = notification.getSourceId();
				taskService.createDiagnoseTask(studyId, toUserId);
				
				notification.setStatus(Constants.NOTIFICATION_STATUS_APPROVE);
				this.saveOrUpdate(notification);
			}
		}
	}

	@Override
	public void reject(Integer notificationId, Integer processUserId) throws ServiceException {
		Notification notification = this.getById(notificationId);
		if( notification.getOwnerUserId() == null || !notification.getOwnerUserId().equals(processUserId)){
			throw new ServiceException("无权操作");
		}
		
		if( notification.getType() != null){
			if( notification.getType().equals(Constants.NOTIFICATION_TYPE_DIAGNOSE_INVITATION) ){
				notification.setStatus(Constants.NOTIFICATION_STATUS_REJECT);
				this.saveOrUpdate(notification);
				
				Integer studyId = notification.getSourceId();
				//重新激活分配任务,由秘书重新分配
				taskService.activeSecretaryMedicalCaseAssignTask(studyId);
				
			}
		}
		
	}

}
