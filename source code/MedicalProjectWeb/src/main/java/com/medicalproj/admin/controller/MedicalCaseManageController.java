package com.medicalproj.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicalproj.admin.dto.param.ListStudyParam;
import com.medicalproj.admin.dto.param.ListUserParam;
import com.medicalproj.admin.dto.view.StudyListView;
import com.medicalproj.admin.dto.view.UserListView;
import com.medicalproj.admin.service.IAdminMedicalCaseManageService;
import com.medicalproj.admin.service.IAdminUserManageService;
import com.medicalproj.common.dto.view.View;

@RequestMapping("/admin/medicalCaseManage")
@Controller("adminMedicalCaseManageController")
public class MedicalCaseManageController {
	@Autowired
	private IAdminMedicalCaseManageService adminMedicalCaseManageService;
	
	@RequestMapping("/listStudy")
	@ResponseBody
	public View<StudyListView> listStudy( @ModelAttribute("param")ListStudyParam param){
		View<StudyListView> view = adminMedicalCaseManageService.listStudy(param);
		return view;
	}
	
}
