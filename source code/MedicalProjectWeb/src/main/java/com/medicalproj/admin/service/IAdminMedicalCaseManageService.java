package com.medicalproj.admin.service;

import com.medicalproj.admin.dto.param.ListStudyParam;
import com.medicalproj.admin.dto.view.StudyListView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;

public interface IAdminMedicalCaseManageService {
	
	View<StudyListView> listStudy(ListStudyParam param)throws ServiceException;

	View<Boolean> delMedicalCase(Integer medicalCaseId)throws ServiceException;

}
