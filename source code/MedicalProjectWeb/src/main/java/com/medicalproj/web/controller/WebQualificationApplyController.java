package com.medicalproj.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.web.dto.session.User;
import com.medicalproj.web.service.IWebQualificationApplyService;

@RequestMapping("/web/qualificationApply")
@Controller
public class WebQualificationApplyController extends WebBaseController{
	@Autowired
	private IWebQualificationApplyService webQualificationApplyService;

	@RequestMapping("/submitApplication")
	@ResponseBody
	public View<Boolean> submitApplication(Integer yszgzId,Integer auditUserId,HttpSession session){
		User user = super.getLoginUser(session);
		
		View<Boolean> view = webQualificationApplyService.submitApplication(yszgzId,auditUserId,user.getId());
		return view;
	}
}
