package com.medicalproj.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicalproj.common.domain.User;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.web.service.IWebCommonService;

@RequestMapping("/web/common")
public class WebCommonController extends WebBaseController{
	@Autowired
	private IWebCommonService commonService;
	
	@RequestMapping("/getMobileVerifyCode")
	@ResponseBody
	public View<Boolean> getMobileVerifyCode(String mobile){
		return commonService.getMobileVerifyCode(mobile);
	}
	
}
