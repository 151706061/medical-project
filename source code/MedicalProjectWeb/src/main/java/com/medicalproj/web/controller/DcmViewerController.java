package com.medicalproj.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicalproj.common.domain.StudyView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.web.dto.session.User;
import com.medicalproj.web.dto.view.StudyViewerView;
import com.medicalproj.web.service.IDcmViewerService;

@RequestMapping("/web/dcmviewer")
@Controller
public class DcmViewerController extends WebBaseController{
	@Autowired
	private IDcmViewerService dcmViewerService;
	
	@RequestMapping("/getUserType")
	@ResponseBody
	public View<Integer> view(HttpSession session){
		User user = super.getLoginUser(session);
		
		View<Integer> view = new View<Integer>();
		view.setData(user.getUserType());
		return view;
	}	
	
	@RequestMapping("/loadStudy")
	@ResponseBody
	public StudyViewerView loadStudy(Integer studyId,HttpSession session){
		View<StudyViewerView> view = dcmViewerService.loadStudy(studyId);
		
		return view.getData();
	}	
	
	@RequestMapping("/loadStudyView")
	@ResponseBody
	public View<StudyView> loadStudyView(Integer studyId,HttpSession session){
		View<StudyView> view = dcmViewerService.loadStudyView(studyId);
		
		return view;
	}
	
	@RequestMapping("/submitDignose")
	@ResponseBody
	public View<Boolean> submitDignose(Integer studyId ,String performance,String result ,HttpSession session){
		User user = super.getLoginUser(session);
		
		View<Boolean> view = dcmViewerService.submitDignose(user.getId(),studyId,performance,result);
		
		return view;
	}
	
	@RequestMapping("/submitAudit")
	@ResponseBody
	public View<Boolean> submitAudit(Integer studyId ,String performance,String result ,HttpSession session){
		User user = super.getLoginUser(session);
		View<Boolean> view = dcmViewerService.submitAudit(user.getId(),studyId,performance,result);
		
		return view;
	}
}
