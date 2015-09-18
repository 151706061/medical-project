package com.medicalproj.web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicalproj.common.domain.UserView;
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
		if( auditUserId == 0 ){
			auditUserId = null;
		}
		User user = super.getLoginUser(session);
		
		View<Boolean> view = webQualificationApplyService.submitApplication(yszgzId,auditUserId,user.getId());
		return view;
	}
	
	@RequestMapping("/listAllSeniorDoctor")
	@ResponseBody
	public View<List<UserView>> listAllSeniorDoctor(){
		View<List<UserView>> view = webQualificationApplyService.listAllSeniorDoctor();
		return view;
	}
}
