package com.medicalproj.web.service;

import com.medicalproj.common.domain.StudyView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.view.StudyViewerView;

public interface IDcmViewerService {

	View<StudyViewerView> loadStudy(Integer studyId)throws ServiceException;

	View<StudyView> loadStudyView(Integer studyId)throws ServiceException;

	View<Boolean> submitDignose(Integer userId, Integer studyId, String performance, String result)throws ServiceException;

	View<Boolean> submitAudit(Integer userId, Integer studyId, String performance, String result)throws ServiceException;


}
