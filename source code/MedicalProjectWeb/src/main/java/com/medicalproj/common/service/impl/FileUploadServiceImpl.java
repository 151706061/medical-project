package com.medicalproj.common.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.dao.UploadFileMapper;
import com.medicalproj.common.domain.UploadFile;
import com.medicalproj.common.domain.UploadFileExample;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IFileUploadService;
import com.medicalproj.common.service.IMedicalCaseService;
import com.medicalproj.common.util.FtpUtil;

import eden.dicomparser.DicomParser;
import eden.dicomparser.data.DicomData;

@Service
public class FileUploadServiceImpl implements IFileUploadService {
	private Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	private UploadFileMapper uploadFileMapper;
	
	@Autowired
	private IMedicalCaseService medicalCaseService;
	
	@Override
	public Integer save(String fileName,String filePath, long fileSize, int fileType,
			Integer uploadUserId) throws ServiceException {
		try {
			UploadFile uploadFile = new UploadFile();
			uploadFile.setFileName(fileName);
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

	@Override
	public Integer save(String fileName, String filePath, long fileSize, int fileType, Integer uploadUserId,
			String uploadNo,String md5) throws ServiceException {
		try {
			UploadFile uploadFile = new UploadFile();
			uploadFile.setFileName(fileName);
			uploadFile.setPath(filePath);
			uploadFile.setSize((int)fileSize);
			uploadFile.setType(fileType);
			uploadFile.setUploadTime(new Date());
			uploadFile.setUploadUserId(uploadUserId);
			uploadFile.setUploadNo(uploadNo);
			uploadFile.setFileMd5(md5);
			
			this.saveOrUpdate(uploadFile);
			return uploadFile.getId();
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e);
		}
	}

	@Override
	public List<UploadFile> listIncompleteUpload(Integer userId) throws ServiceException {
		UploadFileExample example = new UploadFileExample();
		UploadFileExample.Criteria c = example.createCriteria();
		c.andUploadUserIdEqualTo(userId);
		c.andUploadNoIsNotNull();
		example.setOrderByClause("UPLOAD_TIME asc");
		
		return uploadFileMapper.selectByExample(example);
	}

	@Override
	public void clearOldUpload(Integer userId) throws ServiceException {
		UploadFileExample example = new UploadFileExample();
		UploadFileExample.Criteria c = example.createCriteria();
		c.andUploadUserIdEqualTo(userId);
		c.andUploadNoIsNotNull();
		
		uploadFileMapper.deleteByExample(example);
	}

	@Override
	public List<Integer> generateMedicalCaseUsingUploadDicom(Integer processUserId) {
		Map<String,List<InputStream>> map = null;
		Map<String,List<UploadFile>> uploadFileMap = null;
		try {
			List<UploadFile> uploadDicomList = this.listUserUploadDicom(processUserId);
			List<Integer> medicalCaseIdList = null;
			if( uploadDicomList != null ){
				map = new HashMap<String,List<InputStream>>();
				uploadFileMap = new HashMap<String,List<UploadFile>>();
				for( UploadFile file : uploadDicomList ){
					InputStream in = null;
					
					try {
						String filePath = file.getPath().substring(0, file.getPath().lastIndexOf("/"));
						String fileName = file.getPath().substring(file.getPath().lastIndexOf("/")+1);
						in = FtpUtil.readFile(filePath, fileName);
						
						DicomData dicomData = DicomParser.getInstance().read(in);
						String patientId = dicomData.getPatientId();
						// add input stream
						List<InputStream> dicomFileInputStreamList = map.get(patientId);
						if( dicomFileInputStreamList == null ){
							dicomFileInputStreamList = new ArrayList<InputStream>();
							map.put(patientId, dicomFileInputStreamList);
						}
						dicomFileInputStreamList.add(in);
						
						// add upload file
						List<UploadFile> uploadFileList = uploadFileMap.get(patientId);
						if( uploadFileList == null ){
							uploadFileList = new ArrayList<UploadFile>();
							uploadFileMap.put(patientId, uploadFileList);
						}
						uploadFileList.add(file);
					} catch (Exception e) {
						logger.error(e);
						e.printStackTrace();
					}finally{
					}
				}
				
				//生成病例
				medicalCaseIdList = new ArrayList<Integer>();
				for(Iterator<Entry<String,List<UploadFile>>> it = uploadFileMap.entrySet().iterator();it.hasNext();){
					Entry<String,List<UploadFile>> entry = it.next();
					String patientId = entry.getKey();
					List<UploadFile> uploadFileList = entry.getValue();
					
					Integer medicalCaseId = medicalCaseService.createMedicalCaseForPatient(uploadFileList, processUserId);
					medicalCaseIdList.add(medicalCaseId);
				}
				
				//清除upload No.
				this.clearOldUploadNo(processUserId);
			}
			return medicalCaseIdList;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
			throw new ServiceException(e);
		} finally{
			for(Iterator<Entry<String,List<InputStream>>> it = map.entrySet().iterator();it.hasNext();){
				Entry<String,List<InputStream>> entry = it.next();
				List<InputStream> dicomInList = entry.getValue();
				
				for(InputStream inputStream: dicomInList){
					if( inputStream != null ){
						try {
							inputStream.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

	private void clearOldUploadNo(Integer userId) {
		UploadFileExample example = new UploadFileExample();
		UploadFileExample.Criteria c = example.createCriteria();
		c.andUploadUserIdEqualTo(userId);
		c.andUploadNoIsNotNull();
		
		List<UploadFile> uploadFileList = uploadFileMapper.selectByExample(example);
		
		for(UploadFile upload: uploadFileList){
			upload.setUploadNo(null);
			uploadFileMapper.updateByPrimaryKey(upload);
		}
	}

	private List<UploadFile> listUserUploadDicom(Integer userId) {
		UploadFileExample example = new UploadFileExample();
		UploadFileExample.Criteria c = example.createCriteria();
		c.andUploadUserIdEqualTo(userId);
		c.andUploadNoIsNotNull();
		
		return uploadFileMapper.selectByExample(example);
	}
	
}
