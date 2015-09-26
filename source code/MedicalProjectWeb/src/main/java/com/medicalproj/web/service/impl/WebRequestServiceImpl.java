package com.medicalproj.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.medicalproj.common.domain.MedicalCase;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IInstanceService;
import com.medicalproj.common.service.IMedicalCaseService;
import com.medicalproj.common.service.ISeriesService;
import com.medicalproj.common.service.IStudyService;
import com.medicalproj.common.service.IUploadService;
import com.medicalproj.common.util.FileUtil;
import com.medicalproj.web.dto.param.ListRequestParam;
import com.medicalproj.web.dto.view.InstanceView;
import com.medicalproj.web.dto.view.MedicalCaseListView;
import com.medicalproj.web.dto.view.MedicalCaseView;
import com.medicalproj.web.dto.view.RequestListView;
import com.medicalproj.web.dto.view.SeriesView;
import com.medicalproj.web.dto.view.StudyView;
import com.medicalproj.web.service.IWebRequestService;

@Service
public class WebRequestServiceImpl implements IWebRequestService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private IMedicalCaseService medicalCaseService;
	
	@Autowired
	private IStudyService studyService;
	
	@Autowired
	private ISeriesService seriesService;
	
	@Autowired
	private IInstanceService instanceService;
	
	@Autowired
	private IUploadService uploadService;
	
	@Override
	public View<Boolean> uploadDicom(Integer userId, String uploadNo,MultipartFile dicomFile) throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		try {
			if( dicomFile != null ){

				boolean isDicom = isDicomFile(dicomFile);
				if( !isDicom ){
					throw new ServiceException("检测到非Dicom格式文件，请检查上传的文件后重试");
				}
				
				uploadService.upload(dicomFile, userId,uploadNo);
				//medicalCaseService.addDicomToMedicalCase(medicalCaseId,dicomFile,userId);
				
				view.setData(true);
				return view;
			}else{
				throw new ServiceException("上传文件出错.");
			}
		} catch (Exception e) {
			logger.error(e);
			view.setData(null);
			view.setMsg(e.getMessage());
			return view;
		}
	}

	private boolean isAllDicomFile(MultipartFile[] dicomFiles) {
		boolean isAllDicomFile = true;
		for(MultipartFile file : dicomFiles){
			if( !FileUtil.isDicomFile(file.getContentType()) ){
				isAllDicomFile = false;
				break;
			}
		}
		return isAllDicomFile;
	}
	
	private boolean isDicomFile(MultipartFile dicomFile){
		if( FileUtil.isDicomFile(dicomFile.getContentType()) ){
			return true;
		}
		return false;
	}

	@Override
	public List<RequestListView> listRequest(ListRequestParam param)
			throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public View<MedicalCaseListView> listIncompleteRequest(Integer userId) throws ServiceException {
		View<MedicalCaseListView> view = new View<MedicalCaseListView>();
		try {
			MedicalCaseListView medicalCaseListView = new MedicalCaseListView();
			
			List<com.medicalproj.common.domain.MedicalCaseView> domainMedicalCaseViewList = medicalCaseService.listAllMedicalCaseViewByOwnerId(userId);
			List<MedicalCaseView> medicalCaseViewList = trans2MedicalCaseView(domainMedicalCaseViewList);
			medicalCaseListView.setMedicalCaseList(medicalCaseViewList);
			view.setData(medicalCaseListView);
			
			return view;
		} catch (Exception e) {
			logger.error(e);
			view.setMsg(e.getMessage());
			return view;
		}
	}

	private List<MedicalCaseView> trans2MedicalCaseView(
			List<com.medicalproj.common.domain.MedicalCaseView> domainMedicalCaseViewList) {
		if( domainMedicalCaseViewList == null ){
			return null;
		}
		
		List<MedicalCaseView> list = new ArrayList<MedicalCaseView>();
		MedicalCaseView view = null;
		
		for( com.medicalproj.common.domain.MedicalCaseView mcv : domainMedicalCaseViewList){
			view = trans2MedicalCaseView(mcv);
			if( view != null ){
				list.add(view);
			}
		}
		return list;
	}

	private MedicalCaseView trans2MedicalCaseView(com.medicalproj.common.domain.MedicalCaseView mcv) {
		if( mcv == null ){
			return null;
		}
		MedicalCaseView view = new MedicalCaseView();
		
		BeanUtils.copyProperties(mcv, view);
		
		List<com.medicalproj.common.domain.StudyView> domainStudyViewList = studyService.listAllStudyByMedicalCaseId(mcv.getMedicalCaseId());
		List<StudyView> studys = trans2StudyView(domainStudyViewList);
		
		view.setStudys(studys);
		return view;
	}

	private List<StudyView> trans2StudyView(List<com.medicalproj.common.domain.StudyView> domainStudyViewList) {
		if( domainStudyViewList == null ){
			return null;
		}
		
		List<StudyView> list = new ArrayList<StudyView>();
		StudyView view = null;
		for( com.medicalproj.common.domain.StudyView domainStudyView: domainStudyViewList){
			view = trans2StudyView(domainStudyView);
			if( view != null ){
				list.add(view);
			}
		}
		return list;
	}

	private StudyView trans2StudyView(com.medicalproj.common.domain.StudyView domainStudyView) {
		if( domainStudyView == null ){
			return null;
		}
		StudyView view = new StudyView();
		BeanUtils.copyProperties(domainStudyView, view);
		
		
		List<com.medicalproj.common.domain.SeriesView> domainSeriesViewList = seriesService.listAllSeriesByStudyId(domainStudyView.getId());
		List<SeriesView> seriesViewList = trans2SeriesViewList(domainSeriesViewList);
		view.setSeriesList(seriesViewList);
		
		return view;
	}

	private List<SeriesView> trans2SeriesViewList(List<com.medicalproj.common.domain.SeriesView> domainSeriesViewList) {
		if( domainSeriesViewList == null ){
			return null;
		}
		
		List<SeriesView> list = new ArrayList<SeriesView>();
		SeriesView view = null;
		for( com.medicalproj.common.domain.SeriesView domainSeriesView : domainSeriesViewList ){
			view = trans2SeriesView(domainSeriesView);
			if( view != null ){
				list.add(view);
			}
		}
		return list;
	}

	private SeriesView trans2SeriesView(com.medicalproj.common.domain.SeriesView domainSeriesView) {
		if( domainSeriesView == null ){
			return null;
		}
		SeriesView view = new SeriesView();
		BeanUtils.copyProperties(domainSeriesView, view);
		
		List<com.medicalproj.common.domain.InstanceView> domainInstanceViewList = instanceService.listAllInstanceViewBySeriesId(domainSeriesView.getId());
		List<InstanceView> instanceViewList = trans2InstanceViewList(domainInstanceViewList);
		
		view.setInstanceList(instanceViewList);
		return view;
	}

	private List<InstanceView> trans2InstanceViewList(
			List<com.medicalproj.common.domain.InstanceView> domainInstanceViewList) {
		List<InstanceView> list = new ArrayList<InstanceView>();
		InstanceView view = null;
		
		for( com.medicalproj.common.domain.InstanceView domainInstanceView : domainInstanceViewList ){
			view = trans2InstanceView(domainInstanceView);
			if( view != null ){
				list.add(view);
			}
		}
		return list;
	}

	private InstanceView trans2InstanceView(com.medicalproj.common.domain.InstanceView domainInstanceView) {
		InstanceView view = new InstanceView();
		
		BeanUtils.copyProperties(domainInstanceView, view);
		
		return view;
	}

	@Override
	public View<Integer> initNewMedicalCase(Integer creatorUserId) throws ServiceException {
		View<Integer> view = new View<Integer>();
		try {
			MedicalCase medicalCase = medicalCaseService.initNewMedicalCase(creatorUserId);
			
			view.setData(medicalCase.getId());
			return view;
		} catch (Exception e) {
			logger.error(e);
			view.setMsg(e.getMessage());
			return view;
		}
	}

	@Override
	public View<Boolean> doCompleteRequest(Integer medicalCaseId,
			Integer processUserId) throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		try {
			medicalCaseService.doComplete(medicalCaseId);
			view.setData(true);
			return view;
		} catch (Exception e) {
			logger.error(e);
			view.setData(false);
			view.setMsg(e.getMessage());
			return view;
		}
	}

	@Override
	public View<MedicalCaseView> loadMedicalCase(Integer medicalCaseId)
			throws ServiceException {
		View<MedicalCaseView> view = new View<MedicalCaseView>();
		try {
			com.medicalproj.common.domain.MedicalCaseView domainMedicalCase = this.medicalCaseService.getMedicalCaseViewById(medicalCaseId);
			
			MedicalCaseView medicalCaseView = trans2MedicalCaseView(domainMedicalCase);
			view.setData(medicalCaseView);
			
			return view;
		} catch (Exception e) {
			logger.error(e);
			view.setMsg(e.getMessage());
			return view;
		}
	}
	
	
}
