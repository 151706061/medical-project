package com.medicalproj.common.service;

import java.util.List;

import com.medicalproj.admin.dto.param.ListQualificationApplicationParam;
import com.medicalproj.common.domain.QualificationApplicationView;
import com.medicalproj.common.exception.ServiceException;

public interface IQualificationApplicationService {

	void submitApplication(Integer yszgzId, Integer auditUserId,
			Integer applyUserId)throws ServiceException;

	List<QualificationApplicationView> listQualificationApplicationViewByCond(
			ListQualificationApplicationParam param)throws ServiceException;

	int countQualificationApplicationViewByCond(
			ListQualificationApplicationParam param)throws ServiceException;

	void delQualificationApplicationById(Integer applicationId)throws ServiceException;

	void apprvoe(Integer applicationId, Integer processUserId)throws ServiceException;

	void reject(Integer applicationId, Integer processUserId)throws ServiceException;

}
