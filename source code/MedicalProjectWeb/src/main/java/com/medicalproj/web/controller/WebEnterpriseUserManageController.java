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
	
	
}
