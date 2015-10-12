package com.medicalproj.web.service;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.view.StudyViewerView;

public interface IDcmViewerService {

	View<StudyViewerView> loadStudy(Integer studyId)throws ServiceException;

}
