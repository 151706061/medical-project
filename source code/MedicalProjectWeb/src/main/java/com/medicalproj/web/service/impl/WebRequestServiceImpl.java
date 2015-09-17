package com.medicalproj.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IMedicalCaseService;
import com.medicalproj.web.service.IWebRequestService;

import eden.dicomparser.DicomParser;
import eden.dicomparser.data.DicomData;

@Service
public class WebRequestServiceImpl implements IWebRequestService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private IMedicalCaseService medicalCaseService;
	
	@Override
	public View<Boolean> submitRequest(Integer userId, MultipartFile[] dicomFiles) throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		try {
			
			if( dicomFiles != null && dicomFiles.length > 0){
				List<DicomData> dicomList = new ArrayList<DicomData>();
				
				for( MultipartFile multipartFile : dicomFiles ){
					DicomData dicom = DicomParser.getInstance().read(multipartFile.getInputStream());
					dicomList.add(dicom);
				}
				
				medicalCaseService.createMedicalCase(dicomList);
				view.setData(true);
				return view;
			}else{
				throw new ServiceException("上传文件出错.");
			}
		} catch (Exception e) {
			logger.error(e);
			view.setData(false);
			view.setMsg(e.getMessage());
			return view;
		}
	}

}
