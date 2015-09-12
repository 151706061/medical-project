package com.medicalproj.web.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.domain.NotificationView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.INotificationService;
import com.medicalproj.common.util.PagerHelper;
import com.medicalproj.web.dto.view.NotificationListView;
import com.medicalproj.web.dto.view.PagerView;
import com.medicalproj.web.service.IWebNotificationService;

@Service
public class WebNotificationServiceImpl implements IWebNotificationService {
	private Logger logger = Logger.getLogger(this.getClass());
			
	@Autowired
	private INotificationService notificationService;
	
	@Override
	public View<NotificationListView> listNotification(Integer loginUserId,Integer page,Integer pageSize)
			throws ServiceException {
		View<NotificationListView> view = new View<NotificationListView>();
		try {
			NotificationListView notificationListView = new NotificationListView();
			view.setData(notificationListView);
			
			List<NotificationView> notificationViewList = notificationService.listNotificationByUser(loginUserId,page,pageSize);
			notificationListView.setNotifications(notificationViewList);
			
			Integer totalCount = notificationService.countNotificationByUser(loginUserId);
			PagerView pager = PagerHelper.getPager(page,pageSize,totalCount);
			notificationListView.setPager(pager);
			
			return view;
		} catch (Exception e) {
			view.setMsg(e.getMessage());
			return view;
		}
	}

	@Override
	public View<Boolean> doReadNotification(Integer notificationId) throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		try {
			notificationService.setNotificationRead(notificationId);
			view.setData(true);
			return view;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			view.setData(false);
			view.setMsg(e.getMessage());
			return view;
		}
	}

}
