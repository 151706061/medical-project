package com.medicalproj.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.web.dto.session.User;
import com.medicalproj.web.service.IWebCommonService;
import com.medicalproj.web.util.Constants;

@RequestMapping("/web/common")
@Controller
public class WebCommonController extends WebBaseController{
	@Autowired
	private IWebCommonService commonService;
	
	@RequestMapping("/getMobileVerifyCode")
	@ResponseBody
	public View<Boolean> getMobileVerifyCode(String mobile){
		return commonService.getMobileVerifyCode(mobile);
	}
	
	/**
	 * 跳转到登陆用户角色对应的首页
	 * @param mobile
	 * @return
	 */
	@RequestMapping("/home")
	public ModelAndView home(HttpSession session){
		ModelAndView mav = null;
		User user = super.getLoginUser(session);
		if( user == null ){
			return new ModelAndView("redirect:/modules/web/login.jsp");
		}else if( user.getUserType().equals( Constants.USER_TYPE_USER) ){
			return new ModelAndView("redirect:/modules/web/user/index.jsp");
		}else if( user.getUserType().equals( Constants.USER_TYPE_ENTERPRISE_USER) ){
			return new ModelAndView("redirect:/modules/web/user/index.jsp");
		}else if( user.getUserType().equals( Constants.USER_TYPE_JUNIOR_DOCTOR) ){
			return new ModelAndView("redirect:/modules/web/user/index.jsp");
		}else if( user.getUserType().equals( Constants.USER_TYPE_SENIOR_DOCTOR) ){
			return new ModelAndView("redirect:/modules/web/user/index.jsp");
		}else{
			return null;
		}
	}
}
