package com.medicalproj.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.util.DateUtil;
import com.medicalproj.web.dto.param.ListTaskParam;
import com.medicalproj.web.dto.session.User;
import com.medicalproj.web.dto.view.TaskListView;
import com.medicalproj.web.service.IWebTaskService;

@Controller
@RequestMapping("/web/task")
public class WebTaskController extends WebBaseController{
	@Autowired
	private IWebTaskService webTaskService;
	
	@RequestMapping("/listTask")
	@ResponseBody
	public View<TaskListView> listTask(String taskTimeStr,@ModelAttribute("param")ListTaskParam param,HttpSession session){
		User user = getLoginUser(session);
		
		param.setOwnerId(user.getId());
		if( taskTimeStr != null ){
			param.setTaskTime(DateUtil.parse("yyyy-MM-dd", taskTimeStr));
		}
		
		View<TaskListView> view = webTaskService.listTask(param);
		
		return view;
	}
	
	/**
	 * 
	 * @param taskId 
	 * @param session
	 * @return
	 */
	@RequestMapping("/sendAudit")
	@ResponseBody
	public View<TaskListView> sendAudit(Integer taskId,HttpSession session){
		User user = getLoginUser(session);
		
		View<TaskListView> view = webTaskService.sendAudit(taskId,user.getId());
		
		return view;
	}
	
	
	@RequestMapping("/assignTask")
	@ResponseBody
	public View<Boolean> assignTask(Integer taskId,Integer assignToUserId,HttpSession session){
		View<Boolean> view = webTaskService.assignTask(taskId,assignToUserId);
		
		return view;
	}
	
	@RequestMapping("/hasNewTask")
	@ResponseBody
	public View<Boolean> hasNewTask(HttpSession session){
		User user = getLoginUser(session);
		
		View<Boolean> view = webTaskService.hasNewTask(user.getId());
		
		return view;
	}
	
}
