package com.medicalproj.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.medicalproj.web.service.INotificationService;

@RequestMapping("/web/notification")
public class NotificationController {
	@Autowired
	private INotificationService notificationService;
}
