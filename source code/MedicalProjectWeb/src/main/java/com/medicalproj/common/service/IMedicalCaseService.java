package com.medicalproj.common.service;

import java.io.InputStream;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.medicalproj.common.domain.MedicalCase;
import com.medicalproj.common.domain.UploadFile;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.view.ListMedicalCaseParam;

public interface IMedicalCaseService {

	MedicalCase initNewMedicalCase(Integer creatorUserId)throws ServiceException;

	List<com.medicalproj.common.domain.MedicalCaseView> listAllMedicalCaseViewByOwnerId(Integer ownerId)throws ServiceException;

	void addDicomToMedicalCase(Integer medicalCaseId, MultipartFile dicomFile,
			Integer userId)throws ServiceException;

	com.medicalproj.common.domain.MedicalCaseView getMedicalCaseViewById(
			Integer medicalCaseId)throws ServiceException;

	Integer createMedicalCaseForPatient(List<UploadFile> uploadFileList, Integer processUserId)throws ServiceException;

	List<com.medicalproj.common.domain.MedicalCaseView> listMedicalCaseViewByCond(ListMedicalCaseParam param)throws ServiceException;

	int countMedicalCaseViewByCond(ListMedicalCaseParam param)throws ServiceException;

}
