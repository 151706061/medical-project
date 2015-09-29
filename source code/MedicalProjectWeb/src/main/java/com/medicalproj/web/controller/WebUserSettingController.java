package com.medicalproj.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.medicalproj.common.dto.view.UserSettingView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.web.dto.param.SettingSaveParam;
import com.medicalproj.web.dto.session.User;
import com.medicalproj.web.service.IWebUserSettingService;

@RequestMapping("/web/setting")
@Controller
public class WebUserSettingController extends WebBaseController{
	@Autowired
	private IWebUserSettingService webUserSettingService;
	
	/*@RequestMapping("/settings")
	public ModelAndView settings(HttpSession session){
		ModelAndView mav = new ModelAndView("/web/user/settings");
		User user = super.getLoginUser(session);
		
		UserSettingView userSettingView = webUserSettingService.getSetting(user.getId());
		mav.addObject("settings", userSettingView);
		
		return mav;
	}*/
	
	@RequestMapping("/loadMySetting")
	@ResponseBody
	public View<UserSettingView> loadMySetting(HttpSession session){
		User user = super.getLoginUser(session);
		
		View<UserSettingView> userSettingView = webUserSettingService.getSetting(user.getId());
		
		return userSettingView;
	}
	
	@RequestMapping("/saveSetting")
	@ResponseBody
	public View<Boolean> saveSetting(@ModelAttribute("param")SettingSaveParam param,String receiveNotification ,HttpSession session){
		if( receiveNotification!= null ){
			if( receiveNotification.equals("on") ){
				param.setReceiveNotification(true);
			}else{
				param.setReceiveNotification(false);
			}
		}else{
			param.setReceiveNotification(false);
		}
		User user = this.getLoginUser(session);
		
		return webUserSettingService.saveSettingByUserId(user.getId(),param);
	}
	
	
	@RequestMapping("/loadEnterpriseUserSetting")
	@ResponseBody
	public View<UserSettingView> loadEnterpriseUserSetting(HttpSession session){
		User user = super.getLoginUser(session);
		
		View<UserSettingView> userSettingView = webUserSettingService.getSetting(user.getId());
		
		return userSettingView;
	}
	
	@RequestMapping("/saveEnterpriseUserSetting")
	@ResponseBody
	public View<Boolean> saveEnterpriseUserSetting(@ModelAttribute("param")SettingSaveParam param,String receiveNotification ,HttpSession session){
		if( receiveNotification!= null ){
			if( receiveNotification.equals("on") ){
				param.setReceiveNotification(true);
			}else{
				param.setReceiveNotification(false);
			}
		}else{
			param.setReceiveNotification(false);
		}
		User user = this.getLoginUser(session);
		
		return webUserSettingService.saveSettingByUserId(user.getId(),param);
	}
	
}
