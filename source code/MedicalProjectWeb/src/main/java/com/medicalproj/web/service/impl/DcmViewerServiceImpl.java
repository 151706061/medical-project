package com.medicalproj.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.domain.InstanceView;
import com.medicalproj.common.domain.MedicalCase;
import com.medicalproj.common.domain.MedicalCaseView;
import com.medicalproj.common.domain.SeriesView;
import com.medicalproj.common.domain.Study;
import com.medicalproj.common.domain.StudyView;
import com.medicalproj.common.domain.Task;
import com.medicalproj.common.domain.User;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IInstanceService;
import com.medicalproj.common.service.IMedicalCaseService;
import com.medicalproj.common.service.ISeriesService;
import com.medicalproj.common.service.IStudyService;
import com.medicalproj.common.service.ITaskService;
import com.medicalproj.common.service.IUserService;
import com.medicalproj.common.util.DateUtil;
import com.medicalproj.web.dto.view.DcmViewerOptionPermission;
import com.medicalproj.web.dto.view.InstanceViewerView;
import com.medicalproj.web.dto.view.SeriesViewerView;
import com.medicalproj.web.dto.view.StudyViewerView;
import com.medicalproj.web.service.IDcmViewerService;
import com.medicalproj.web.util.Constants;

@Service
public class DcmViewerServiceImpl implements IDcmViewerService {
	private Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private IStudyService studyService;
	
	@Autowired
	private ISeriesService seriesService;
	
	@Autowired
	private IInstanceService instanceService;

	@Autowired
	private IMedicalCaseService medicalCaseService;
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private ITaskService taskService;
	
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
		
		List<SeriesView> seriesViewList = seriesService.listAllSeriesViewByStudyId(studyView.getId());
		view.setNumImages(String.valueOf(seriesViewList.size()));
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
	public View<Boolean> submitDignose(Integer userId, Integer taskId, String performance, String result)
			throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		
		studyService.dignose(userId,taskId,performance,result);
		
		view.setData(true);
		return view;
	}

	@Override
	public View<Boolean> submitAudit(Integer userId, Integer taskId, String performance, String result)
			throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		studyService.audit(userId,taskId,performance,result);
		
		view.setData(true);
		return view;
	}

	@Override
	public View<DcmViewerOptionPermission> getDcmViewerOptionPermission(
			Integer studyId, Integer userId) throws ServiceException {
		View<DcmViewerOptionPermission>  view = new View<DcmViewerOptionPermission> ();
		try {
			DcmViewerOptionPermission permission = new DcmViewerOptionPermission(false,false,false,false);
			
			User user = userService.getById(userId);
			if( user == null || user.getUserType() == null){
				throw new ServiceException("帐号异常");
			}
			
			Study study = studyService.getById(studyId);
			if( study == null ){
				throw new ServiceException("Study 不存在");
			}
			
			if( user.getUserType().equals(Constants.USER_TYPE_USER) ){
				if( study.getDiagnoseTime() == null ){
					
				}else{
					permission.setCanViewReport(true);
				}
			}else if( user.getUserType().equals(Constants.USER_TYPE_JUNIOR_DOCTOR) ){
				Task task = taskService.getMyDiagnoseTask(studyId, userId);
				if( task != null){
					permission.setCanViewReport(true);
					
					MedicalCase mc = medicalCaseService.getById(study.getMedicalCaseId());
					
					if( mc.getStatus().equals(Constants.MEDICAL_CASE_STATUS_ASSIGNED_WAIT_FOR_DIAGNOSE) ){
						permission.setCanDiagnose(true);
					}
				}
				
			}else if( user.getUserType().equals(Constants.USER_TYPE_SENIOR_DOCTOR) ){
				Task task = taskService.getMyAuditTask(studyId, userId);
				
				if( task != null ){
					permission.setCanViewDiagnoseAndAuditReport(true);
					
					MedicalCase mc = medicalCaseService.getById(study.getMedicalCaseId());
					if( mc.getStatus().equals(Constants.MEDICAL_CASE_STATUS_WAIT_FOR_AUDIT) ){
						permission.setCanAudit(true);
					}
				}
			}else if( user.getUserType().equals(Constants.USER_TYPE_ENTERPRISE_USER) ){
				
			}else{
				throw new ServiceException("非法的用户角色");
			}
			
			view.setData(permission);
			return view;
		} catch (Exception e) {
			logger.error(e);
			view.setMsg(e.getMessage());
			view.setSuccess(false);
			return view;
		}
	}

	
}
