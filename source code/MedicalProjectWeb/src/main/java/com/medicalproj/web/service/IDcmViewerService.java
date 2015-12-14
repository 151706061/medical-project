package com.medicalproj.web.service;

import com.medicalproj.common.domain.StudyView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.view.DcmViewerOptionPermission;
import com.medicalproj.web.dto.view.StudyViewerView;

public interface IDcmViewerService {

	View<StudyViewerView> loadStudy(Integer studyId)throws ServiceException;

	View<StudyView> loadStudyView(Integer studyId)throws ServiceException;

	View<Boolean> submitDignose(Integer userId, Integer taskId, String performance, String result)throws ServiceException;

	View<Boolean> submitAudit(Integer userId, Integer taskId, String performance, String result)throws ServiceException;

	View<DcmViewerOptionPermission> getDcmViewerOptionPermission(
			Integer studyId, Integer userId)throws ServiceException;

	View<Boolean> submitFirstReview(Integer userId, Integer taskId, String performance, String result)throws ServiceException;

	View<Boolean> submitFinalReview(Integer userId, Integer taskId, String performance, String result,int remark)throws ServiceException;


}
