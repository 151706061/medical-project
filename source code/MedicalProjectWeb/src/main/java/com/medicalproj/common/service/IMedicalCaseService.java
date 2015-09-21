package com.medicalproj.common.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.medicalproj.common.domain.MedicalCase;
import com.medicalproj.common.exception.ServiceException;

import eden.dicomparser.data.DicomData;

public interface IMedicalCaseService {

	MedicalCase initNewMedicalCase(Integer creatorUserId)throws ServiceException;

	List<com.medicalproj.common.domain.MedicalCaseView> listAllMedicalCaseViewByOwnerId(Integer ownerId)throws ServiceException;

	void doComplete(Integer medicalCaseId)throws ServiceException;

	void addDicomToMedicalCase(Integer medicalCaseId, MultipartFile dicomFile,
			Integer userId)throws ServiceException;

}
