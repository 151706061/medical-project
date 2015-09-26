package com.medicalproj.web.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.param.ListRequestParam;
import com.medicalproj.web.dto.view.MedicalCaseListView;
import com.medicalproj.web.dto.view.MedicalCaseView;
import com.medicalproj.web.dto.view.RequestListView;

public interface IWebRequestService {

	View<Boolean> uploadDicom(Integer userId, String uploadNo, MultipartFile dicomFile)throws ServiceException;

	List<RequestListView> listRequest(ListRequestParam param)throws ServiceException;

	View<MedicalCaseListView> listIncompleteRequest(Integer userId)throws ServiceException;

	View<Integer> initNewMedicalCase(Integer creatorUserId)throws ServiceException;

	View<Boolean> doCompleteRequest(Integer medicalCaseId, Integer processUserId)throws ServiceException;

	View<MedicalCaseView> loadMedicalCase(Integer medicalCaseId)throws ServiceException;


}
