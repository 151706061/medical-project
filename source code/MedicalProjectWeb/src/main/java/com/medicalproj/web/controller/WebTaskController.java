package com.medicalproj.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.medicalproj.web.service.IWebTaskService;

@RequestMapping("/web/task")
public class WebTaskController {
	@Autowired
	private IWebTaskService webTaskService;
	
}
