package com.medicalproj.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.medicalproj.web.service.IUserSettingService;

@RequestMapping("/web/setting")
public class UserSettingController {
	@Autowired
	private IUserSettingService userSettingService;
	
}
