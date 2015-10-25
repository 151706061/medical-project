package com.medicalproj.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.domain.InstanceView;
import com.medicalproj.common.domain.MedicalCaseView;
import com.medicalproj.common.domain.SeriesView;
import com.medicalproj.common.domain.Study;
import com.medicalproj.common.domain.StudyView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IInstanceService;
import com.medicalproj.common.service.IMedicalCaseService;
import com.medicalproj.common.service.ISeriesService;
import com.medicalproj.common.service.IStudyService;
import com.medicalproj.common.util.DateUtil;
import com.medicalproj.web.dto.view.InstanceViewerView;
import com.medicalproj.web.dto.view.SeriesViewerView;
import com.medicalproj.web.dto.view.StudyViewerView;
import com.medicalproj.web.service.IDcmViewerService;
import com.medicalproj.web.util.Constants;

@Service
public class DcmViewerServiceImpl implements IDcmViewerService {
	@Autowired
	private IStudyService studyService;
	
	@Autowired
	private ISeriesService seriesService;
	
	@Autowired
	private IInstanceService instanceService;

	@Autowired
	private IMedicalCaseService medicalCaseService;
	
	@Override
	public View<StudyViewerView> loadStudy(Integer studyId) throws ServiceException {
		View<StudyViewerView> view = new View<StudyViewerView>();
		StudyView studyView = studyService.getStudyViewById(studyId);
		
		MedicalCaseView medicalCaseView = medicalCaseService.getMedicalCaseViewById(studyView.getMedicalCaseId());
		
		StudyViewerView studyViewerView = trans2StudyViewerView(medicalCaseView,studyView);
		
		view.setData(studyViewerView);
		return view;
	}

	private StudyViewerView trans2StudyViewerView(MedicalCaseView medicalCaseView, StudyView studyView) {
		StudyViewerView view = new StudyViewerView();
		
		view.setModality(studyView.getModality());
		view.setPatientId(medicalCaseView.getPatientId());
		view.setPatientName(medicalCaseView.getPatientName());
		try {
			view.setStudyDate(DateUtil.format("yyyyMMdd", DateUtil.parse("yyyy-MM-dd", studyView.getStudyDate())));
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		view.setStudyDescription(studyView.getStudyDescription());
		view.setStudyId(studyView.getStudyId());
		view.setNumImages("");
		
		List<SeriesView> seriesViewList = seriesService.listAllSeriesByStudyId(studyView.getId());
		view.setSeriesList(trans2SeriesViewerViewList(seriesViewList));
		return view;
	}

	private List<SeriesViewerView> trans2SeriesViewerViewList(List<SeriesView> seriesViewList) {
		if( seriesViewList == null || seriesViewList.size() == 0 ){
			return null;
		}
		List<SeriesViewerView> seriesViewerViewList = new ArrayList<SeriesViewerView>();
		
		for( SeriesView seriesView : seriesViewList){
			SeriesViewerView seriesViewerView = trans2SeriesViewerView(seriesView);
			if( seriesViewerView != null ){
				seriesViewerViewList.add(seriesViewerView);
			}
		}
		return seriesViewerViewList;
	}

	private SeriesViewerView trans2SeriesViewerView(SeriesView seriesView) {
		if( seriesView == null ){
			return null;
		}
		
		SeriesViewerView seriesViewerView = new SeriesViewerView();
		seriesViewerView.setSeriesDescription("");
		seriesViewerView.setSeriesNumber(seriesView.getSeriesNumber());

		List<InstanceView> instanceViewList = instanceService.listAllInstanceViewBySeriesId(seriesView.getId());
		seriesViewerView.setInstanceList( trans2InstanceViewerViewList(instanceViewList) );
		return seriesViewerView;
	}

	private List<InstanceViewerView> trans2InstanceViewerViewList(List<InstanceView> instanceViewList) {
		if( instanceViewList == null || instanceViewList.size() == 0 ){
			return null;
		}
		List<InstanceViewerView> instanceViewerViewList = new ArrayList<InstanceViewerView>();
		
		for( InstanceView instanceView : instanceViewList){
			InstanceViewerView instanceViewerView = trans2InstanceViewerView(instanceView);
			if( instanceViewerView != null ){
				instanceViewerViewList.add(instanceViewerView);
			}
		}
		return instanceViewerViewList;
	}

	private InstanceViewerView trans2InstanceViewerView(InstanceView instanceView) {
		if( instanceView == null ){
			return null;
		}
		
		InstanceViewerView instanceViewerView = new InstanceViewerView();
		instanceViewerView.setImageId(Constants.FTP_HTTP_BASE_URL + instanceView.getJpgFilePath());

		return instanceViewerView;
	}

	@Override
	public View<StudyView> loadStudyView(Integer studyId) throws ServiceException {
		View<StudyView> view = new View<StudyView>();
		
		StudyView studyView = studyService.getStudyViewById(studyId);
		view.setData(studyView);
		return view;
	}

	@Override
	public View<Boolean> submitDignose(Integer userId, Integer studyId, String performance, String result)
			throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		studyService.dignose(userId,studyId,performance,result);
		
		view.setData(true);
		return view;
	}

	@Override
	public View<Boolean> submitAudit(Integer userId, Integer studyId, String performance, String result)
			throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		studyService.audit(userId,studyId,performance,result);
		
		view.setData(true);
		return view;
	}

	
}
