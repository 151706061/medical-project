package com.medicalproj.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.web.dto.session.User;
import com.medicalproj.web.dto.view.NotificationListView;
import com.medicalproj.web.service.IWebNotificationService;

@RequestMapping("/web/notification")
public class WebNotificationController extends WebBaseController {
	@Autowired
	private IWebNotificationService webNotificationService;
	
	@RequestMapping("/listNotification")
	public ModelAndView listNotification(Integer page,Integer pageSize,HttpSession session){
		ModelAndView mav = new ModelAndView();
		User user = super.getLoginUser(session);
		View<NotificationListView> view = webNotificationService.listNotification(user.getId(),page,pageSize);
		
		return mav;
	}
}
