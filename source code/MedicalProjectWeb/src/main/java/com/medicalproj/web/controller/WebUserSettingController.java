package com.medicalproj.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.web.dto.param.SettingSaveParam;
import com.medicalproj.web.dto.session.User;
import com.medicalproj.web.dto.view.SettingView;
import com.medicalproj.web.service.IWebUserSettingService;

@RequestMapping("/web/setting")
public class WebUserSettingController extends WebCommonController{
	@Autowired
	private IWebUserSettingService webUserSettingService;
	
	@RequestMapping("/getMySetting")
	@ResponseBody
	public View<SettingView> getMySetting(HttpSession session){
		User user = this.getLoginUser(session);
		
		return webUserSettingService.getSettingByUserId(user.getId());
	}
	
	@RequestMapping("/saveMySetting")
	@ResponseBody
	public View<Boolean> saveMySetting(@ModelAttribute("param")SettingSaveParam param,HttpSession session){
		User user = this.getLoginUser(session);
		
		return webUserSettingService.saveSettingByUserId(user.getId(),param);
	}
}
