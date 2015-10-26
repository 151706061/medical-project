package com.medicalproj.web.service;

import java.util.List;

import com.medicalproj.admin.dto.param.ListQualificationApplicationParam;
import com.medicalproj.admin.dto.view.QualificationApplicationListView;
import com.medicalproj.common.domain.UserView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;

public interface IWebQualificationApplyService {

	View<Boolean> submitApplication(Integer yszgzId, Integer auditUserId,
			Integer applyUserId)throws ServiceException;

	View<List<UserView>> listAllSeniorDoctor()throws ServiceException;

	View<QualificationApplicationListView> listQualificationApplication(
			ListQualificationApplicationParam param)throws ServiceException;

	View<Boolean> approve(Integer applicationId, Integer processUserId)throws ServiceException;

	View<Boolean> reject(Integer applicationId, Integer processUserId)throws ServiceException;


}
