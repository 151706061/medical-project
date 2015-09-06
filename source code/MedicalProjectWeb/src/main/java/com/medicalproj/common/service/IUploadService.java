package com.medicalproj.common.service;

import org.springframework.web.multipart.MultipartFile;

import com.medicalproj.common.dto.view.FileView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;

public interface IUploadService {

	View<FileView> upload(MultipartFile file)throws ServiceException;

}
