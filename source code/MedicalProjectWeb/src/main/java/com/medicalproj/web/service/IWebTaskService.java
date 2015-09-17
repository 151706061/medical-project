package com.medicalproj.web.service;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.param.ListTaskParam;
import com.medicalproj.web.dto.view.TaskListView;

public interface IWebTaskService {
	View<TaskListView> listTask(ListTaskParam param)throws ServiceException;

}
