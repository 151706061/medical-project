package com.medicalproj.web.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.admin.dto.param.ListQualificationApplicationParam;
import com.medicalproj.admin.dto.view.QualificationApplicationListView;
import com.medicalproj.common.domain.QualificationApplicationView;
import com.medicalproj.common.domain.UserView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IQualificationApplicationService;
import com.medicalproj.common.service.IUserService;
import com.medicalproj.common.util.PagerHelper;
import com.medicalproj.web.dto.view.PagerView;
import com.medicalproj.web.service.IWebQualificationApplyService;

@Service
public class WebQualificationApplyServiceImpl implements
		IWebQualificationApplyService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private IQualificationApplicationService qualificationApplicationService;
	@Autowired
	private IUserService userService;
	
	@Override
	public View<Boolean> submitApplication(Integer yszgzId,
			Integer auditUserId, Integer applyUserId) throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		try {
			qualificationApplicationService.submitApplication(yszgzId,auditUserId,applyUserId);
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
	public View<List<UserView>> listAllSeniorDoctor() throws ServiceException {
		View<List<UserView>> view = new View<List<UserView>>();
		try {
			List<UserView> users = userService.listAllSeniorDoctor();
			view.setData(users);
			return view;
		} catch (Exception e) {
			view.setMsg(e.getMessage());
			return view;
		}
	}

	@Override
	public View<QualificationApplicationListView> listQualificationApplication(
			ListQualificationApplicationParam param) throws ServiceException {
		View<QualificationApplicationListView> view = new View<QualificationApplicationListView>();
		QualificationApplicationListView qualificationApplicationListView = new QualificationApplicationListView();
		
		List<QualificationApplicationView> applications = qualificationApplicationService.listQualificationApplicationViewByCond(param);
		qualificationApplicationListView.setApplications(applications);
		
		int total = qualificationApplicationService.countQualificationApplicationViewByCond(param);
		PagerView pager = PagerHelper.getPager(param.getPage(), param.getPageSize(), total);
		qualificationApplicationListView.setPager(pager);
		
		view.setData(qualificationApplicationListView);
		return view;
	}

	@Override
	public View<Boolean> approve(Integer applicationId, Integer processUserId)
			throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		
		try {
			qualificationApplicationService.apprvoe(applicationId,processUserId);
			view.setData(true);
			return view;
		} catch (Exception e) {
			logger.error(e);
			view.setMsg(e.getMessage());
			view.setSuccess(false);
			return view;
		}
	}

	@Override
	public View<Boolean> reject(Integer applicationId, Integer processUserId)
			throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		
		try {
			qualificationApplicationService.reject(applicationId,processUserId);
			view.setData(true);
			return view;
		} catch (Exception e) {
			logger.error(e);
			view.setMsg(e.getMessage());
			view.setSuccess(false);
			return view;
		}
	}

}
