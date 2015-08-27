package com.medicalproj.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.medicalproj.common.controller.BaseController;
import com.medicalproj.web.service.IAuthService;

@RequestMapping("/web/auth")
public class AuthController extends BaseController{
	
	@Autowired
	private IAuthService authService;
	
	
}
