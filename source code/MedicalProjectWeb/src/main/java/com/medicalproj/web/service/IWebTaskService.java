package com.medicalproj.web.service;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.param.ListTaskParam;
import com.medicalproj.web.dto.view.TaskListView;

public interface IWebTaskService {
	View<TaskListView> listTask(ListTaskParam param)throws ServiceException;

	View<TaskListView> sendAudit(Integer taskId, Integer userId)throws ServiceException;

	/**
	 * 分配诊断任务
	 * @param taskId
	 * @param assignToUserId
	 * @return
	 * @throws ServiceException
	 */
	View<Boolean> assignTask(Integer taskId, Integer assignToUserId,Integer processUserId)throws ServiceException;

	View<Boolean> hasNewTask(Integer userId)throws ServiceException;

}
