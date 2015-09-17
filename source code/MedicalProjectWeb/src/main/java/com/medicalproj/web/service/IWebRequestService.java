package com.medicalproj.web.service;

import org.springframework.web.multipart.MultipartFile;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;

public interface IWebRequestService {

	View<Boolean> submitRequest(Integer userId, MultipartFile[] dicomFile)throws ServiceException;

	List<RequestListView> listRequest(ListRequestParam param)throws ServiceException;

}
