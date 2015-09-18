package com.medicalproj.common.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IMedicalCaseService;

import eden.dicomparser.data.DicomData;

@Service
public class MedicalCaseServiceImpl implements IMedicalCaseService {

	@Override
	public void createMedicalCase(List<DicomData> dicomList)
			throws ServiceException {
		// TODO Auto-generated method stub
		
	}

}
