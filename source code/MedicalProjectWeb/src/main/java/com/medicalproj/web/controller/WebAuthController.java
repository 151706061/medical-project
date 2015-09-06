package com.medicalproj.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicalproj.common.controller.BaseController;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.web.dto.param.RegisterParam;
import com.medicalproj.web.service.IWebAuthService;
import com.sun.istack.internal.NotNull;

@RequestMapping("/web/auth")
@Controller
public class WebAuthController extends BaseController{
	
	@Autowired
	private IWebAuthService authService;
	
	@RequestMapping("/login")
	@ResponseBody
	public View<Boolean> login( String account,String password){
		return authService.login(account,password);
	}
	
	@RequestMapping("/reg")
	@ResponseBody
	public View<Boolean> reg(@ModelAttribute("param")RegisterParam param){
		return authService.reg(param);
	}
	
}
