package com.medicalproj.common.service;

import java.util.List;

import com.medicalproj.common.domain.Task;
import com.medicalproj.common.domain.TaskView;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.param.ListTaskParam;

public interface ITaskService {

	List<TaskView> listTaskByCond(ListTaskParam param)throws ServiceException;

	Integer countTaskByCond(ListTaskParam param)throws ServiceException;

	void createAssignTask(List<Integer> medicalCaseIdList)throws ServiceException;

	Task getMyDiagnoseTask(Integer studyId,Integer userId)throws ServiceException;
	
	Task getMyAuditTask(Integer studyId,Integer userId)throws ServiceException;

	void createDiagnoseTask(Integer studyId, Integer assignToUserId)throws ServiceException;

	void createAuditTask(Integer studyId)throws ServiceException;

	Task getById(Integer taskId)throws ServiceException;

	void saveOrUpdate(Task task)throws ServiceException;
}
