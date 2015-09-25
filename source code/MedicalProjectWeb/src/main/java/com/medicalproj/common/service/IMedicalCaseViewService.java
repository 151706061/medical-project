package com.medicalproj.common.service;

import java.util.List;

import com.medicalproj.common.domain.MedicalCaseView;
import com.medicalproj.common.exception.ServiceException;

public interface IMedicalCaseViewService {

	List<MedicalCaseView> listAllByOwnerId(Integer ownerId)throws ServiceException;

	MedicalCaseView getById(Integer medicalCaseId)throws ServiceException;

}
