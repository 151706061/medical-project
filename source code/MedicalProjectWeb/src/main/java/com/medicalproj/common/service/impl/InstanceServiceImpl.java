package com.medicalproj.common.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.dao.InstanceMapper;
import com.medicalproj.common.dao.InstanceViewMapper;
import com.medicalproj.common.domain.Instance;
import com.medicalproj.common.domain.InstanceExample;
import com.medicalproj.common.domain.InstanceView;
import com.medicalproj.common.domain.InstanceViewExample;
import com.medicalproj.common.domain.Series;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IInstanceService;

import eden.dicomparser.data.DicomData;

@Service
public class InstanceServiceImpl implements IInstanceService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private InstanceViewMapper instanceViewMapper;

	@Autowired
	private InstanceMapper instanceMapper;

	@Override
	public List<InstanceView> listAllInstanceViewBySeriesId(Integer seriesId)
			throws ServiceException {
		try {
			InstanceViewExample example = new InstanceViewExample();
			InstanceViewExample.Criteria c = example.createCriteria();
			
			c.andSeriesIdEqualTo(seriesId);
			return instanceViewMapper.selectByExample(example);
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e);
		}
	}

	@Override
	public Instance createInstanceIfNotExists(Integer seriesDomainId,
			DicomData dicom,Integer uploadDicomFileId) throws ServiceException {
		try {
			if( seriesDomainId == null || dicom == null || uploadDicomFileId == null){
				throw new ServiceException("参数错误");
			}
			
			String instanceNumber = dicom.getInstanceNumber();
			Instance instance = this.getByCond(seriesDomainId,instanceNumber);
			if( instance != null ){
				logger.info("Instance 已存在,使用新Instance数据覆盖旧数据");
			}else{
				instance = new Instance();
			}
			
			instance.setCreateTime(new Date());
			instance.setDicomFileId(uploadDicomFileId);
			instance.setInstanceNumber(instanceNumber);
			instance.setSeriesId(seriesDomainId);
			this.saveOrUpdate(instance);
			
			return instance;
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e.getMessage(),e);
		}
	}

	private void saveOrUpdate(Instance instance) {
		if( instance != null ){
			if( instance.getId() == null ){
				instanceMapper.insertSelective(instance);
			}else{
				instanceMapper.updateByPrimaryKeySelective(instance);
			}
		}
		
	}

	private Instance getByCond(Integer seriesDomainId, String instanceNumber) {
		InstanceExample example = new InstanceExample();
		InstanceExample.Criteria c = example.createCriteria();
		c.andSeriesIdEqualTo(seriesDomainId);
		c.andInstanceNumberEqualTo(instanceNumber);
		
		List<Instance> list = instanceMapper.selectByExample(example);
		if( list != null && list.size() > 0 ){
			return list.get(0);
		}
		return null;
	}
	
	
	
}
