package com.medicalproj.common.service;

import java.util.List;

import com.medicalproj.common.domain.Series;
import com.medicalproj.common.exception.ServiceException;

import eden.dicomparser.data.DicomData;

public interface ISeriesService {

	List<com.medicalproj.common.domain.SeriesView> listAllSeriesViewByStudyId(
			Integer studyId)throws ServiceException;

	Series createSeriesIfNotExists(Integer studyDomainId, DicomData dicom)throws ServiceException;

	List<Series> listAllSeriesByStudyId(Integer studyId)throws ServiceException;

	void delete(List<Series> seriesList)throws ServiceException;

	Series createSeriesForJpgIfNotExists(Integer studyDomainId, String seriesNumber)throws ServiceException;

}
