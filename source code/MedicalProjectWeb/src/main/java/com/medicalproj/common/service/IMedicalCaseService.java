package com.medicalproj.common.service;

import java.util.List;

import com.medicalproj.common.exception.ServiceException;

import eden.dicomparser.data.DicomData;

public interface IMedicalCaseService {

	void createMedicalCase(List<DicomData> dicomList)throws ServiceException;

}
