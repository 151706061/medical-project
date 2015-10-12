package com.medicalproj.common.service;

import java.util.List;

import com.medicalproj.common.domain.TaskView;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.param.ListTaskParam;

public interface ITaskService {

	List<TaskView> listTaskByCond(ListTaskParam param)throws ServiceException;

	Integer countTaskByCond(ListTaskParam param)throws ServiceException;

	void assignDiagnoseTask(List<Integer> medicalCaseIdList)throws ServiceException;

}
