package com.medicalproj.common.service;

import java.util.List;

import com.medicalproj.common.domain.MedicalCase;
import com.medicalproj.common.exception.ServiceException;

public interface IMedicalCaseService {

	MedicalCase initNewMedicalCase(Integer creatorUserId)throws ServiceException;

	List<com.medicalproj.common.domain.MedicalCaseView> listAllMedicalCaseViewByOwnerId(Integer ownerId)throws ServiceException;

}
