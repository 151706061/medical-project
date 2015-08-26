package com.medicalproj.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.medicalproj.web.service.IRequestService;

@RequestMapping("/web/request")
public class RequestController {
	@Autowired
	private IRequestService requestService;
	
}
