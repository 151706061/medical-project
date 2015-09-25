package com.medicalproj.common.service;

import java.util.List;

import com.medicalproj.common.domain.Instance;
import com.medicalproj.common.exception.ServiceException;

import eden.dicomparser.data.DicomData;

public interface IInstanceService {

	List<com.medicalproj.common.domain.InstanceView> listAllInstanceViewBySeriesId(
			Integer seriesId)throws ServiceException;

	Instance createInstanceIfNotExists(Integer seriesDomainId, DicomData dicom,Integer uploadDicomFileId,Integer uploadJpgFileId)throws ServiceException;

}
