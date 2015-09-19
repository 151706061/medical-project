package com.medicalproj.common.service.impl;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.dao.MedicalCaseMapper;
import com.medicalproj.common.domain.MedicalCase;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IMedicalCaseService;
import com.medicalproj.web.util.Constants;

@Service
public class MedicalCaseServiceImpl implements IMedicalCaseService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private MedicalCaseMapper medicalCaseMapper;
	
	@Override
	public MedicalCase initNewMedicalCase(Integer creatorUserId) throws ServiceException {
		try {
			MedicalCase medicalCase = new MedicalCase();
			medicalCase.setCreateTime(new Date());
			medicalCase.setCreatorUserId(creatorUserId);
			medicalCase.setIsUploadComplete(Constants.MEDICAL_CASE_IS_UPLOAD_COMPLETE_FALSE);
			medicalCase.setStatus(Constants.MEDICAL_CASE_STATUS_OPEN);
			
			saveOrUpdate(medicalCase);
			return medicalCase;
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e);
		}
	}

	private void saveOrUpdate(MedicalCase domain) {
		if( domain != null ){
			if( domain.getId() == null ){
				medicalCaseMapper.insertSelective(domain);
			}else{
				medicalCaseMapper.updateByPrimaryKeySelective(domain);
			}
		}
		
	}
	
	

}
