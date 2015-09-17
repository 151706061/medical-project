package com.medicalproj.common.service;

import com.medicalproj.common.exception.ServiceException;

public interface IQualificationApplicationService {

	void submitApplication(Integer yszgzId, Integer auditUserId,
			Integer applyUserId)throws ServiceException;

}
