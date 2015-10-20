package com.medicalproj.admin.service;

import com.medicalproj.admin.dto.param.ListQualificationApplicationParam;
import com.medicalproj.admin.dto.view.QualificationApplicationListView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;

public interface IAdminQualificationApplicationManageService {

	View<QualificationApplicationListView> listApplication(
			ListQualificationApplicationParam param)throws ServiceException;

	View<Boolean> delUser(Integer applicationId)throws ServiceException;

}
