package com.medicalproj.admin.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.admin.dto.param.ListQualificationApplicationParam;
import com.medicalproj.admin.dto.view.QualificationApplicationListView;
import com.medicalproj.admin.service.IAdminQualificationApplicationManageService;
import com.medicalproj.common.domain.QualificationApplicationView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IQualificationApplicationService;
import com.medicalproj.common.util.PagerHelper;
import com.medicalproj.web.dto.view.PagerView;

@Service
public class AdminQualificationApplicationManageServiceImpl implements
		IAdminQualificationApplicationManageService {
	private Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private IQualificationApplicationService qualificationApplicationService;
	
	@Override
	public View<QualificationApplicationListView> listApplication(
			ListQualificationApplicationParam param) throws ServiceException {
		View<QualificationApplicationListView> view = new View<QualificationApplicationListView>();
		try {
			QualificationApplicationListView qualificationApplicationListView = new QualificationApplicationListView();
			
			List<QualificationApplicationView> qualificationApplicationViewList = qualificationApplicationService.listQualificationApplicationViewByCond(param);
			qualificationApplicationListView.setApplications(qualificationApplicationViewList);
			
			int totalCount = qualificationApplicationService.countQualificationApplicationViewByCond(param);
			PagerView pager = PagerHelper.getPager(param.getPage(), param.getPageSize(), totalCount);
			qualificationApplicationListView.setPager(pager);
			
			view.setData(qualificationApplicationListView);
			return view;
		} catch (Exception e) {
			logger.error("listUser",e);
			view.setSuccess(false);
			view.setMsg(e.getMessage());
			return view;
		}
	}
	@Override
	public View<Boolean> delUser(Integer applicationId) throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		
		try {
			qualificationApplicationService.delQualificationApplicationById(applicationId);
			view.setData(true);
			return view;
		} catch (Exception e) {
			view.setSuccess(false);
			view.setMsg(e.getMessage());
			return view;
		}
	}
	
}
