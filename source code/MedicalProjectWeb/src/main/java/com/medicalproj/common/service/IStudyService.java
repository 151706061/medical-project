package com.medicalproj.common.service;

import java.util.List;

import com.medicalproj.common.domain.Study;
import com.medicalproj.common.exception.ServiceException;

import eden.dicomparser.data.DicomData;

public interface IStudyService {

	List<com.medicalproj.common.domain.StudyView> listAllStudyByMedicalCaseId(
			Integer medicalCaseId)throws ServiceException;

	Study createStydyIfNotExists(Integer medicalCaseId, DicomData dicom)throws ServiceException;

}
