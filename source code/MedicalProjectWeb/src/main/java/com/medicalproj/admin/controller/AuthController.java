package com.medicalproj.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicalproj.admin.service.IAdminAuthService;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.web.dto.session.User;
import com.medicalproj.web.service.IWebAuthService;
import com.medicalproj.web.util.Constants;

@RequestMapping("/admin/auth")
@Controller("adminAuthController")
public class AuthController {
	@Autowired
	private IAdminAuthService adminAuthService;
	
	@RequestMapping("/login")
	@ResponseBody
	public View<Integer> login( String account,String password, HttpSession session){
		View<Integer> view = adminAuthService.login(account,password);
		if( view.getData() != null ){
			session.setAttribute(Constants.SESSION_KEY_LOGIN_ADMIN_ID, view.getData());
		}
		return view;
	}
}
