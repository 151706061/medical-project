package com.medicalproj.common.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.dao.MedicalCaseViewMapper;
import com.medicalproj.common.domain.MedicalCaseView;
import com.medicalproj.common.domain.MedicalCaseViewExample;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IMedicalCaseViewService;

@Service
public class MedicalCaseViewServiceImpl implements IMedicalCaseViewService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private MedicalCaseViewMapper medicalCaseViewMapper;
	
	@Override
	public List<MedicalCaseView> listAllByOwnerId(Integer ownerId)
			throws ServiceException {
		MedicalCaseViewExample example = new MedicalCaseViewExample();
		MedicalCaseViewExample.Criteria c = example.createCriteria();
		c.andCreatorUserIdEqualTo(ownerId);
				
		return medicalCaseViewMapper.selectByExample(example);
	}

	@Override
	public MedicalCaseView getById(Integer medicalCaseId)
			throws ServiceException {
		MedicalCaseViewExample example = new MedicalCaseViewExample();
		MedicalCaseViewExample.Criteria c = example.createCriteria();
		c.andMedicalCaseIdEqualTo(medicalCaseId);
		
		List<MedicalCaseView> list = medicalCaseViewMapper.selectByExample(example);
		if( list != null && list.size() > 0 ){
			return list.get(0);
		}
		return null;
	}

}
