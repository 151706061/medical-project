package com.medicalproj.web.dto.view;

import java.util.List;

import com.medicalproj.common.domain.NotificationView;

public class NotificationListView extends ListView{
	private List<NotificationView> notifications;
	private PagerView pager;
	
	public List<NotificationView> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<NotificationView> notifications) {
		this.notifications = notifications;
	}

	public PagerView getPager() {
		return pager;
	}

	public void setPager(PagerView pager) {
		this.pager = pager;
	}
	
}
