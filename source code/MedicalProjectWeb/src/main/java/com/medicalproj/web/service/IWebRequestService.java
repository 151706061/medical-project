package com.medicalproj.web.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.param.ListRequestParam;
import com.medicalproj.web.dto.view.IncompleteRequestResView;
import com.medicalproj.web.dto.view.ListMedicalCaseParam;
import com.medicalproj.web.dto.view.MedicalCaseListView;
import com.medicalproj.web.dto.view.MedicalCaseView;
import com.medicalproj.web.dto.view.RequestListView;

public interface IWebRequestService {

	View<Boolean> uploadDicom(Integer userId, String uploadNo, MultipartFile dicomFile)throws ServiceException;

	List<RequestListView> listRequest(ListRequestParam param)throws ServiceException;

	View<IncompleteRequestResView> checkIncompleteRequest(Integer userId)throws ServiceException;

	View<Integer> initNewMedicalCase(Integer creatorUserId)throws ServiceException;

	View<List<Integer>> doCompleteRequest(Integer processUserId)throws ServiceException;

	View<MedicalCaseView> loadMedicalCase(Integer medicalCaseId)throws ServiceException;

	View<Boolean> clearOldUpload(Integer userId)throws ServiceException;

	View<MedicalCaseListView> listMedicalCase(ListMedicalCaseParam param)throws ServiceException;


}
