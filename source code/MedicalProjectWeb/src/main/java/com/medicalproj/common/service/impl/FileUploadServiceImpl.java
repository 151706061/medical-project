package com.medicalproj.common.service.impl;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.dao.UploadFileMapper;
import com.medicalproj.common.domain.UploadFile;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IFileUploadService;

@Service
public class FileUploadServiceImpl implements IFileUploadService {
	private Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	private UploadFileMapper uploadFileMapper;
	
	@Override
	public Integer save(String fileName,String filePath, long fileSize, int fileType,
			Integer uploadUserId) throws ServiceException {
		try {
			UploadFile uploadFile = new UploadFile();
			uploadFile.setName(fileName);
			uploadFile.setPath(filePath);
			uploadFile.setSize((int)fileSize);
			uploadFile.setType(fileType);
			uploadFile.setUploadTime(new Date());
			uploadFile.setUploadUserId(uploadUserId);
			
			this.saveOrUpdate(uploadFile);
			return uploadFile.getId();
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e);
		}
	}

	private void saveOrUpdate(UploadFile uploadFile)throws ServiceException {
		if( uploadFile == null ){
			throw new ServiceException("文件数据为空");
		}
		
		if( uploadFile.getId()  == null ){
			uploadFileMapper.insertSelective(uploadFile);
		}else{
			uploadFileMapper.updateByPrimaryKeySelective(uploadFile);
		}
	}
	
	
}
