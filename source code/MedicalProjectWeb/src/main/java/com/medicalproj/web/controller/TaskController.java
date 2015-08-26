package com.medicalproj.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.medicalproj.web.service.ITaskService;

@RequestMapping("/web/task")
public class TaskController {
	@Autowired
	private ITaskService taskService;
	
}
