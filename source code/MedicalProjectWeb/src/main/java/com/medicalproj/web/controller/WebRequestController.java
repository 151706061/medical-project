package com.medicalproj.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.web.dto.session.User;
import com.medicalproj.web.service.IWebRequestService;

@RequestMapping("/web/request")
public class WebRequestController extends WebBaseController{
	@Autowired
	private IWebRequestService webRequestService;
	
	@RequestMapping(value="/submitRequest", method = RequestMethod.POST)
	@ResponseBody
	public View<Boolean> submitRequest(@RequestParam("file") MultipartFile file,HttpSession session){
		User user = super.getLoginUser(session);
		
		View<Boolean> view = webRequestService.submitRequest(user.getId() , file);
		
		return view;
	}
}
