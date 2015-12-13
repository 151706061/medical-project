package com.medicalproj.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicalproj.admin.dto.param.AddUserParam;
import com.medicalproj.admin.dto.param.ListUserParam;
import com.medicalproj.admin.dto.view.UserListView;
import com.medicalproj.admin.service.IAdminUserManageService;
import com.medicalproj.common.dto.view.View;

@RequestMapping("/admin/userManage")
@Controller("adminUserManageController")
public class UserManageController {
	@Autowired
	private IAdminUserManageService adminUserManageService;
	
	@RequestMapping("/listUser")
	@ResponseBody
	public View<UserListView> listUser( @ModelAttribute("param")ListUserParam param){
		View<UserListView> view = adminUserManageService.listUser(param);
		return view;
	}
	
	@RequestMapping("/delUser")
	@ResponseBody
	public View<Boolean> delUser( Integer userId ){
		View<Boolean> view = adminUserManageService.delUser(userId);
		return view;
	}
	
	@RequestMapping("/addUser")
	@ResponseBody
	public View<Boolean> addUser( AddUserParam param ){
		View<Boolean> view = adminUserManageService.addUser(param);
		return view;
	}
}
