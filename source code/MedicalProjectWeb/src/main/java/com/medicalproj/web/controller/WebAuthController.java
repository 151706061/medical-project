package com.medicalproj.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.web.dto.param.RegisterParam;
import com.medicalproj.web.dto.session.User;
import com.medicalproj.web.service.IWebAuthService;
import com.medicalproj.web.util.Constants;

@RequestMapping("/web/auth")
@Controller
public class WebAuthController{
	
	@Autowired
	private IWebAuthService webAuthService;
	
	@RequestMapping("/login")
	@ResponseBody
	public View<Boolean> login( String account,String password, HttpSession session){
		View<Boolean> view = webAuthService.login(account,password);
		if( view != null && view.isSuccess() == true ){
			User user = webAuthService.getSessionUserByAccount(account);
			session.setAttribute(Constants.SESSION_KEY_LOGIN_USER, user);
			session.setAttribute(Constants.SESSION_KEY_FILE_BASE_PATH, Constants.FTP_HTTP_BASE_URL);
			return view;
		}else{
			return view;
		}
	}
	
	@RequestMapping("/reg")
	@ResponseBody
	public View<Boolean> reg(@ModelAttribute("param")RegisterParam param){
		return webAuthService.reg(param);
	}
	
	@RequestMapping("/resetPwd")
	public ModelAndView resetPwd(String mobile,String verifyCode,String newPassword){
		ModelAndView mav = new ModelAndView();
		
		webAuthService.resetPwd(mobile,verifyCode,newPassword);

		mav.setViewName("/login");
		return mav;
	}
	
}
