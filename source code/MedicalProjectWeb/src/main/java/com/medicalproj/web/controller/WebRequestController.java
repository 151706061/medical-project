package com.medicalproj.web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.web.dto.session.User;
import com.medicalproj.web.dto.view.IncompleteRequestResView;
import com.medicalproj.web.dto.view.ListMedicalCaseParam;
import com.medicalproj.web.dto.view.MedicalCaseListView;
import com.medicalproj.web.dto.view.MedicalCaseView;
import com.medicalproj.web.service.IWebRequestService;

@RequestMapping("/web/request")
@Controller
public class WebRequestController extends WebBaseController{
	@Autowired
	private IWebRequestService webRequestService;
	
	@RequestMapping(value="/uploadDicom", method = RequestMethod.POST)
	@ResponseBody
	public View<Boolean> uploadDicom(@RequestParam("file") MultipartFile file,String uploadNo,HttpSession session){
		User user = super.getLoginUser(session);
		
		View<Boolean> view = webRequestService.uploadDicom(user.getId() , uploadNo,file);
		
		return view;
	}
	
	/**
	 * 查询未完成的请求，若没有未完成的，返回null
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/checkIncompleteRequest", method = RequestMethod.GET)
	@ResponseBody
	public View<IncompleteRequestResView> checkIncompleteRequest(HttpSession session){
		User user = super.getLoginUser(session);
		
		View<IncompleteRequestResView> view = webRequestService.checkIncompleteRequest(user.getId() );
		
		return view;
	}
	
	@RequestMapping(value="/clearOldUpload", method = RequestMethod.POST)
	@ResponseBody
	public View<Boolean> clearOldUpload(HttpSession session){
		User user = super.getLoginUser(session);
		
		View<Boolean> view = webRequestService.clearOldUpload(user.getId() );
		
		return view;
	}
	
	@RequestMapping(value="/initNewMedicalCase", method = RequestMethod.POST)
	@ResponseBody
	public View<Integer> initNewMedicalCase(HttpSession session){
		User user = super.getLoginUser(session);
		
		View<Integer> view = webRequestService.initNewMedicalCase(user.getId() );
		
		return view;
	}
	
	@RequestMapping(value="/loadMedicalCase", method = RequestMethod.GET)
	@ResponseBody
	public View<MedicalCaseView> loadMedicalCase(Integer medicalCaseId,HttpSession session){
		User user = super.getLoginUser(session);
		
		View<MedicalCaseView> view = webRequestService.loadMedicalCase(medicalCaseId);
		
		return view;
	}
	
	/**
	 * 完成请求，将上传的dicom生成medical case,返回生成的病例ID列表
	 * @param session
	 * @return
	 */
	@RequestMapping("/completeRequest")
	@ResponseBody
	public View<List<Integer>> doCompleteRequest(HttpSession session){
		User user = super.getLoginUser(session);
		
		View<List<Integer>> view = webRequestService.doCompleteRequest( user.getId());
		
		return view;
	}
	
	@RequestMapping(value="/listRequest", method = RequestMethod.GET)
	@ResponseBody
	public View<MedicalCaseListView> listRequest(@ModelAttribute("param")ListMedicalCaseParam param,HttpSession session){
		User user = super.getLoginUser(session);
		if( user != null ){
			param.setOwnerUserId(user.getId());
		}
		View<MedicalCaseListView> view = webRequestService.listMedicalCase(param);
		
		return view;
	}
	
}
