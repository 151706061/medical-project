package com.medicalproj.admin.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.admin.dto.param.ListStudyParam;
import com.medicalproj.admin.dto.view.StudyListView;
import com.medicalproj.admin.service.IAdminMedicalCaseManageService;
import com.medicalproj.common.domain.DetailedStudyView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IStudyService;
import com.medicalproj.common.util.PagerHelper;
import com.medicalproj.web.dto.view.PagerView;

@Service
public class AdminMedicalCaseManageServiceImpl implements
		IAdminMedicalCaseManageService {
	private Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private IStudyService studyService;

	@Override
	public View<StudyListView> listStudy(ListStudyParam param)
			throws ServiceException {
		View<StudyListView> view = new View<StudyListView>();
		try {
			StudyListView studyListView = new StudyListView();
			
			List<DetailedStudyView> detailedStudyViewList = studyService.listDetailedStudyViewByCond(param);
			studyListView.setStudies(detailedStudyViewList);
			
			int totalCount = studyService.countDetailedStudyViewByCond(param);
			PagerView pager = PagerHelper.getPager(param.getPage(), param.getPageSize(), totalCount);
			studyListView.setPager(pager);
			
			view.setData(studyListView);
			return view;
		} catch (Exception e) {
			logger.error("listStudy",e);
			view.setSuccess(false);
			view.setMsg(e.getMessage());
			return view;
		}
	}
	
}
