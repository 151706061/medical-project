package com.medicalproj.web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.medicalproj.common.domain.UserView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.web.dto.session.User;
import com.medicalproj.web.service.IWebCommonService;
import com.medicalproj.web.util.Constants;

@RequestMapping("/web/common")
@Controller
public class WebCommonController extends WebBaseController{
	@Autowired
	private IWebCommonService webCommonService;
	
	@RequestMapping("/getMobileVerifyCode")
	@ResponseBody
	public View<Boolean> getMobileVerifyCode(String mobile){
		return webCommonService.getMobileVerifyCode(mobile);
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
			return new ModelAndView("redirect:/modules/web/user/main.jsp#requests");
		}else if( user.getUserType().equals( Constants.USER_TYPE_ENTERPRISE_USER) ){
			return new ModelAndView("redirect:/modules/web/enterprise/main.jsp");
		}else if( user.getUserType().equals( Constants.USER_TYPE_JUNIOR_DOCTOR) ){
			return new ModelAndView("redirect:/modules/web/juniordoctor/main.jsp#requests");
		}else if( user.getUserType().equals( Constants.USER_TYPE_SENIOR_DOCTOR) ){
			return new ModelAndView("redirect:/modules/web/seniordoctor/main.jsp#requests");
		}
		else if( user.getUserType().equals( Constants.USER_TYPE_SECRETARY) ){
			return new ModelAndView("redirect:/modules/web/secretary/main.jsp#requests");
		}
		else{
			return null;
		}
	}
	
	@RequestMapping("/getLoginUserInfo")
	@ResponseBody
	public View<UserView> getLoginUserInfo(HttpSession session){
		User user = super.getLoginUser(session);
		
		View<UserView> view = webCommonService.getLoginUserInfo(user.getId());
		return view;
	}
	
	@RequestMapping("/getUnreadNotificationCount")
	@ResponseBody
	public View<Integer> getUnreadNotificationCount(HttpSession session){
		User user = super.getLoginUser(session);
		View<Integer> view = webCommonService.getUnreadNotificaitonCount(user.getId());
		return view;
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session){
		ModelAndView mav = new ModelAndView("redirect:/modules/web/login.jsp");
		User user = super.getLoginUser(session);
		webCommonService.logout();
		return mav;
	}
	
	
	@RequestMapping("/listAllJuniorDoctor")
	@ResponseBody
	public View<List<UserView>> listAllJuniorDoctor(HttpSession session){
		View<List<UserView>> view = webCommonService.listAllJuniorDoctor();
		return view;
	}
}
