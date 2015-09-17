package com.medicalproj.web.service;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;

public interface IWebTaskService {
	View<TaskListView> listTask(ListTaskParam param)throws ServiceException;

}
