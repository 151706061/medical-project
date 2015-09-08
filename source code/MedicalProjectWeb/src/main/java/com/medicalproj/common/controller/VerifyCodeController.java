package com.medicalproj.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.service.ICommonService;

@RequestMapping("/common")
@Controller
public class VerifyCodeController {
	@Autowired
	private ICommonService commonService;
	
	@RequestMapping("/getVerifyCode")
	@ResponseBody
	public View<Boolean> getVerifyCode(String mobile){
		View<Boolean> view = commonService.getVerifyCode(mobile);
		return view;
	}
}
