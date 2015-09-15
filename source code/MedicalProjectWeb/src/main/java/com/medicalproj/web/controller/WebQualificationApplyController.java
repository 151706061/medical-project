package com.medicalproj.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.web.service.IWebQualificationApplyService;

@RequestMapping("/web/qualificationApply")
@Controller
public class WebQualificationApplyController {
	@Autowired
	private IWebQualificationApplyService qualificationApplyService;

	@RequestMapping("/submitApplication")
	@ResponseBody
	public View<Boolean> submitApplication(){
		View<Boolean> view = new View<Boolean>();
		view.setData(true);
		return view;
	}
}
