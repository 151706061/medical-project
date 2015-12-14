package com.medicalproj.common.service;

import java.util.List;

import com.medicalproj.admin.dto.param.ListStudyParam;
import com.medicalproj.common.domain.DetailedStudyView;
import com.medicalproj.common.domain.Study;
import com.medicalproj.common.domain.StudyView;
import com.medicalproj.common.exception.ServiceException;

import eden.dicomparser.data.DicomData;

public interface IStudyService {

	List<com.medicalproj.common.domain.StudyView> listAllStudyViewByMedicalCaseId(
			Integer medicalCaseId)throws ServiceException;

	Study createStydyIfNotExists(Integer medicalCaseId, DicomData dicom)throws ServiceException;

	StudyView getStudyViewById(Integer studyId)throws ServiceException;

	List<DetailedStudyView> listDetailedStudyViewByCond(ListStudyParam param)throws ServiceException;

	int countDetailedStudyViewByCond(ListStudyParam param)throws ServiceException;

	void dignose(Integer userId, Integer taskId, String performance, String result)throws ServiceException;

	void audit(Integer userId, Integer taskId, String performance, String result)throws ServiceException;

	Study getById(Integer studyId)throws ServiceException;

	Study getByMedicalCaseId(Integer medicalCaseId)throws ServiceException;

	List<Study> listAllStudyByMedicalCaseId(Integer medicalCaseId)throws ServiceException;

	void delete(List<Study> studyList)throws ServiceException;

	void doFirstReview(Integer userId, Integer taskId, String performance, String result)throws ServiceException;

	void doFinalReview(Integer userId, Integer taskId, String performance, String result,int remark)throws ServiceException;

}
