package com.medicalproj.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.web.dto.session.User;
import com.medicalproj.web.dto.view.UserAuthorizeListView;
import com.medicalproj.web.service.IWebEnterpriseUserManageService;

@RequestMapping("/web/enterprise/userManage")
@Controller
public class WebEnterpriseUserManageController extends WebBaseController {
	@Autowired
	private IWebEnterpriseUserManageService webEnterpriseUserManageService;
	
	@RequestMapping("/listAuthorizeUser")
	@ResponseBody
	public View<UserAuthorizeListView> listAuthorizeUser(Integer page,Integer pageSize,HttpSession session){
		User user = super.getLoginUser(session);
		View<UserAuthorizeListView> view = webEnterpriseUserManageService.listAuthorizeUser(user.getId(),page,pageSize);
		
		return view;
	}
	
	
	@RequestMapping("/authorize")
	@ResponseBody
	public View<Boolean> authorize(Integer authId,HttpSession session){
		User user = super.getLoginUser(session);
		View<Boolean> view = webEnterpriseUserManageService.authorize(authId);
		
		return view;
	}
	
	@RequestMapping("/unauthorize")
	@ResponseBody
	public View<Boolean> unauthorize(Integer authId,HttpSession session){
		User user = super.getLoginUser(session);
		View<Boolean> view = webEnterpriseUserManageService.unauthorize(authId);
		
		return view;
	}
	
}
