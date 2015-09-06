package com.medicalproj.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.web.dto.session.User;
import com.medicalproj.web.dto.view.NotificationListView;
import com.medicalproj.web.service.IWebNotificationService;

@RequestMapping("/web/notification")
public class WebNotificationController extends WebBaseController {
	@Autowired
	private IWebNotificationService notificationService;
	
	@RequestMapping("/listNotification")
	@ResponseBody
	public View<NotificationListView> listNotification(HttpSession session){
		User user = super.getLoginUserId(session);
		return notificationService.listNotification(user.getId());
	}
}
