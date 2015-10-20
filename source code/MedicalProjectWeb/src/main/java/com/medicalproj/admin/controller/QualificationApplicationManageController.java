package com.medicalproj.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicalproj.admin.dto.param.ListQualificationApplicationParam;
import com.medicalproj.admin.dto.view.QualificationApplicationListView;
import com.medicalproj.admin.service.IAdminQualificationApplicationManageService;
import com.medicalproj.common.dto.view.View;

@RequestMapping("/admin/qualificationApplicationManage")
@Controller("adminQualificationApplicationManageController")
public class QualificationApplicationManageController {
	@Autowired
	private IAdminQualificationApplicationManageService adminQualificationApplicationManageService;
	
	@RequestMapping("/listApplication")
	@ResponseBody
	public View<QualificationApplicationListView> listApplication( @ModelAttribute("param")ListQualificationApplicationParam param){
		View<QualificationApplicationListView> view = adminQualificationApplicationManageService.listApplication(param);
		return view;
	}
	
	@RequestMapping("/delApplication")
	@ResponseBody
	public View<Boolean> delUser( Integer applicationId ){
		View<Boolean> view = adminQualificationApplicationManageService.delUser(applicationId);
		return view;
	}
	
}
