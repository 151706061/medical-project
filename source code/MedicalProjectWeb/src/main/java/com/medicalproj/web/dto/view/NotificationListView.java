package com.medicalproj.web.dto.view;

import java.util.List;

public class NotificationListView extends ListView{
	private List<NotificationListItemView> notifications;

	public List<NotificationListItemView> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<NotificationListItemView> notifications) {
		this.notifications = notifications;
	}
	
}
