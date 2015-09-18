package com.medicalproj.web.service;

import java.util.List;

import com.medicalproj.common.domain.UserView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;

public interface IWebQualificationApplyService {

	View<Boolean> submitApplication(Integer yszgzId, Integer auditUserId,
			Integer applyUserId)throws ServiceException;

	View<List<UserView>> listAllSeniorDoctor()throws ServiceException;


}
