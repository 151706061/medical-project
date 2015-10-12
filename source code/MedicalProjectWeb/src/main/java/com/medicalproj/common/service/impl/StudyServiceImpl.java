package com.medicalproj.common.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.dao.StudyMapper;
import com.medicalproj.common.dao.StudyViewMapper;
import com.medicalproj.common.domain.Study;
import com.medicalproj.common.domain.StudyExample;
import com.medicalproj.common.domain.StudyView;
import com.medicalproj.common.domain.StudyViewExample;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IStudyService;
import com.medicalproj.web.util.Constants;

import eden.dicomparser.data.DicomData;
@Service
public class StudyServiceImpl implements IStudyService {
	private Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	private StudyMapper studyMapper;
	
	@Autowired
	private StudyViewMapper studyViewMapper;
	
	@Override
	public List<StudyView> listAllStudyByMedicalCaseId(Integer medicalCaseId)
			throws ServiceException {
		try {
			StudyViewExample example = new StudyViewExample();
			StudyViewExample.Criteria c= example.createCriteria();
			
			c.andMedicalCaseIdEqualTo(medicalCaseId);
			
			return studyViewMapper.selectByExample(example);
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e);
		}
	}

	@Override
	public Study createStydyIfNotExists(Integer medicalCaseId ,DicomData dicom)
			throws ServiceException {
		if( dicom == null ){
			throw new ServiceException("参数错误");
		}
		
		String studyId = dicom.getStudyId();
		Study study = this.getByCond(medicalCaseId,studyId);
		if( study != null ){
			logger.info("study 已经存在,使用新的替换旧的Study数据");
		}else{
			logger.info("新建Study数据");
			study = new Study();
		}
		
		study.setBodyPartExamined(dicom.getBodyPartExamined());
		study.setCreateTime(new Date());
		study.setMedicalCaseId(medicalCaseId);
		study.setModality(dicom.getModality());
		study.setStatus(Constants.STUDY_STATUS_WAIT_FOR_DIAGNOSE);
		study.setStudyDate(dicom.getStudyDate());
		study.setStudyId(dicom.getStudyId());
		study.setStudyDescription(dicom.getStudyDescription());
		this.saveOrUpdate(study);
		
		return study;
	}

	private Study getByCond(Integer medicalCaseId, String studyId) {
		try {
			StudyExample example = new StudyExample();
			StudyExample.Criteria c = example.createCriteria();
			c.andMedicalCaseIdEqualTo(medicalCaseId);
			c.andStudyIdEqualTo(studyId);

			List<Study> list = studyMapper.selectByExample(example);
			if( list != null && list.size() > 0 ){
				return list.get(0);
			}
			return null;
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e);
		}
	}

	private void saveOrUpdate(Study study) {
		if( study != null ){
			if( study.getId() == null ){
				studyMapper.insertSelective(study);
			}else{
				studyMapper.updateByPrimaryKeySelective(study);
			}
		}
	}

	@Override
	public StudyView getStudyViewById(Integer studyId) throws ServiceException {
		StudyViewExample example = new StudyViewExample();
		StudyViewExample.Criteria c = example.createCriteria();
		
		c.andIdEqualTo(studyId);
		
		List<StudyView> list = studyViewMapper.selectByExample(example);
		if( list != null && list.size() > 0 ){
			return list.get(0);
		}
		return null;
	}
	
}
