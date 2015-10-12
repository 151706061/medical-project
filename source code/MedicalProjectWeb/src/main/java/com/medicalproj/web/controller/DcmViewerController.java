package com.medicalproj.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.web.dto.session.User;
import com.medicalproj.web.dto.view.StudyViewerView;
import com.medicalproj.web.service.IDcmViewerService;

@RequestMapping("/web/dcmviewer")
@Controller
public class DcmViewerController {
	@Autowired
	private IDcmViewerService dcmViewerService;
	
	@RequestMapping("/loadStudy")
	@ResponseBody
	public StudyViewerView loadStudy(Integer studyId,HttpSession session){
		View<StudyViewerView> view = dcmViewerService.loadStudy(studyId);
		
		return view.getData();
	}	
}
