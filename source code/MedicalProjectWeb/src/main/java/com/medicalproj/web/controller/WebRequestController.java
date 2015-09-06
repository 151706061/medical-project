package com.medicalproj.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.medicalproj.web.service.IWebRequestService;

@RequestMapping("/web/request")
public class WebRequestController {
	@Autowired
	private IWebRequestService requestService;
	
}
