package com.medicalproj.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.web.dto.session.User;
import com.medicalproj.web.dto.view.MedicalCaseListView;
import com.medicalproj.web.service.IWebRequestService;

@RequestMapping("/web/request")
@Controller
public class WebRequestController extends WebBaseController{
	@Autowired
	private IWebRequestService webRequestService;
	
	@RequestMapping(value="/uploadDicom", method = RequestMethod.POST)
	@ResponseBody
	public View<Boolean> uploadDicom(@RequestParam("file") MultipartFile file,Integer medicalCaseId,HttpSession session){
		User user = super.getLoginUser(session);
		
		View<Boolean> view = webRequestService.uploadDicom(user.getId() , medicalCaseId,file);
		
		return view;
	}
	
	@RequestMapping(value="/listIncompleteRequest", method = RequestMethod.GET)
	@ResponseBody
	public View<MedicalCaseListView> listIncompleteRequest(HttpSession session){
		User user = super.getLoginUser(session);
		
		View<MedicalCaseListView> view = webRequestService.listIncompleteRequest(user.getId() );
		
		return view;
	}
	
	@RequestMapping("/initNewMedicalCase")
	@ResponseBody
	public View<Integer> initNewMedicalCase(HttpSession session){
		User user = super.getLoginUser(session);
		
		View<Integer> view = webRequestService.initNewMedicalCase(user.getId() );
		
		return view;
	}
	
	@RequestMapping("/completeRequest")
	@ResponseBody
	public View<Boolean> doCompleteRequest(Integer medicalCaseId,HttpSession session){
		User user = super.getLoginUser(session);
		
		View<Boolean> view = webRequestService.doCompleteRequest( medicalCaseId ,user.getId());
		
		return view;
	}
}
