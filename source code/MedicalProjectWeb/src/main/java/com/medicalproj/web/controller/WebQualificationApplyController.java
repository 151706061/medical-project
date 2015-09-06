package com.medicalproj.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.medicalproj.web.service.IWebQualificationApplyService;

@RequestMapping("/web/qualificationApply")
public class WebQualificationApplyController {
	@Autowired
	private IWebQualificationApplyService qualificationApplyService;
	
}
