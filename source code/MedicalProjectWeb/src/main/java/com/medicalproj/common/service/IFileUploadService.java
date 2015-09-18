package com.medicalproj.common.service;

import com.medicalproj.common.exception.ServiceException;

public interface IFileUploadService {

	Integer save(String fileName,String filePath, long fileSize, int fileType,
			Integer uploadUserId)throws ServiceException;

}
