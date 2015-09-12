package com.medicalproj.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.web.dto.session.User;
import com.medicalproj.web.dto.view.NotificationListView;
import com.medicalproj.web.service.IWebNotificationService;

@RequestMapping("/web/notification")
@Controller
public class WebNotificationController extends WebBaseController {
	@Autowired
	private IWebNotificationService webNotificationService;
	
	@RequestMapping("/listNotification")
	@ResponseBody
	public View<NotificationListView> listNotification(Integer page,Integer pageSize,HttpSession session){
		User user = super.getLoginUser(session);
		View<NotificationListView> view = webNotificationService.listNotification(user.getId(),page,pageSize);
		
		return view;
	}
	
	@RequestMapping("/doReadNotification")
	@ResponseBody
	public View<Boolean> doReadNotification(Integer notificationId){
		View<Boolean> view = webNotificationService.doReadNotification(notificationId);
		
		return view;
	}
	
	
}
