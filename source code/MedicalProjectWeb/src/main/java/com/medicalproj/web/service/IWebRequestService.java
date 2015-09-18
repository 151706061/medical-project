package com.medicalproj.web.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.param.ListRequestParam;
import com.medicalproj.web.dto.view.RequestListView;

public interface IWebRequestService {

	View<Boolean> submitRequest(Integer userId, MultipartFile[] dicomFile)throws ServiceException;

	List<RequestListView> listRequest(ListRequestParam param)throws ServiceException;

}
