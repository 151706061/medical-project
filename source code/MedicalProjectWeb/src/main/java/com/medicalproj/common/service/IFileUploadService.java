package com.medicalproj.common.service;

import java.util.List;

import com.medicalproj.common.domain.UploadFile;
import com.medicalproj.common.exception.ServiceException;

public interface IFileUploadService {

	Integer save(String fileName,String filePath, long fileSize, int fileType,
			Integer uploadUserId)throws ServiceException;

	Integer save(String fileName, String imageRelativePath, long fileSize, int fileType, Integer uploadUserId,
			String uploadNo,String md5)throws ServiceException;

	List<UploadFile> listIncompleteUpload(Integer userId)throws ServiceException;

	void clearOldUpload(Integer userId)throws ServiceException;

	/**
	 * 拆分上传文件，相同的病人并入一个病历
	 */
	List<Integer> generateMedicalCaseUsingUploadDicom(Integer processUserId);

}
