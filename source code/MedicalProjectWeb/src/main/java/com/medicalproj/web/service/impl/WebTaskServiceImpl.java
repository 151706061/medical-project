package com.medicalproj.web.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.domain.MedicalCase;
import com.medicalproj.common.domain.Study;
import com.medicalproj.common.domain.Task;
import com.medicalproj.common.domain.TaskView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IMedicalCaseService;
import com.medicalproj.common.service.IStudyService;
import com.medicalproj.common.service.ITaskService;
import com.medicalproj.common.util.PagerHelper;
import com.medicalproj.web.dto.param.ListTaskParam;
import com.medicalproj.web.dto.view.PagerView;
import com.medicalproj.web.dto.view.TaskListView;
import com.medicalproj.web.service.IWebTaskService;
import com.medicalproj.web.util.Constants;

@Service
public class WebTaskServiceImpl implements IWebTaskService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private ITaskService taskService;
	
	
	@Autowired
	private IStudyService studyService;
	
	@Autowired
	private IMedicalCaseService medicalCaseService;
	
	@Override
	public View<TaskListView> listTask(ListTaskParam param)
			throws ServiceException {
		View<TaskListView> view = new View<TaskListView>();
		try {
			TaskListView taskListView = new TaskListView();
			view.setData(taskListView);
			
			List<TaskView> TaskViewList = taskService.listTaskByCond(param);
			taskListView.setTasks(TaskViewList);
			
			Integer totalCount = taskService.countTaskByCond(param);
			PagerView pager = PagerHelper.getPager(param.getPage(),param.getPageSize(),totalCount);
			taskListView.setPager(pager);
			
			return view;
		} catch (Exception e) {
			view.setMsg(e.getMessage());
			return view;
		}
	}

	@Override
	public View<TaskListView> sendAudit(Integer taskId, Integer userId) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public View<Boolean> assignTask(Integer taskId, Integer assignToUserId)
			throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		try {
			Task task = taskService.getById(taskId);
			taskService.saveOrUpdate(task);
			
			Integer studyId = task.getResourceId();
			Study study = studyService.getById(studyId);
			
			Integer medicalCaseId = study.getMedicalCaseId();
			MedicalCase mc = medicalCaseService.getById(medicalCaseId);
			mc.setStatus(Constants.MEDICAL_CASE_STATUS_ASSIGN_COMPLETE);
			medicalCaseService.saveOrUpdate(mc);
			
			taskService.createDiagnoseTask(task.getResourceId(),assignToUserId);
			view.setData(true);
			return view;
		} catch (Exception e) {
			logger.error(e);
			view.setMsg(e.getMessage());
			view.setSuccess(false);
			return view;
		}
	}

}
