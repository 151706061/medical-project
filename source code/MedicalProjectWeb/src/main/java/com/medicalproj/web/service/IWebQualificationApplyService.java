package com.medicalproj.web.service;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;

public interface IWebQualificationApplyService {

	View<Boolean> submitApplication(Integer yszgzId, Integer auditUserId,
			Integer applyUserId)throws ServiceException;


}
