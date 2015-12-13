package com.medicalproj.common.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.dao.SeriesMapper;
import com.medicalproj.common.dao.SeriesViewMapper;
import com.medicalproj.common.domain.Series;
import com.medicalproj.common.domain.SeriesExample;
import com.medicalproj.common.domain.SeriesView;
import com.medicalproj.common.domain.SeriesViewExample;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.ISeriesService;

import eden.dicomparser.data.DicomData;

@Service
public class SeriesServiceImpl implements ISeriesService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private SeriesViewMapper seriesViewMapper;

	@Autowired
	private SeriesMapper seriesMapper;

	@Override
	public List<SeriesView> listAllSeriesViewByStudyId(Integer studyId)
			throws ServiceException {
		try {
			SeriesViewExample example = new SeriesViewExample();
			SeriesViewExample.Criteria c = example.createCriteria();
			
			c.andStudyIdEqualTo(studyId);
			return seriesViewMapper.selectByExample(example);
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e);
		}
	}

	@Override
	public Series createSeriesIfNotExists(Integer studyDomainId, DicomData dicom)
			throws ServiceException {
		try {
			if( studyDomainId == null || dicom == null ){
				throw new ServiceException("参数错误");
			}
			
			String seriesNumber = dicom.getSeriesNumber();
			Series series = this.getByCond(studyDomainId,seriesNumber);
			if( series != null ){
				logger.info("Series 已存在,使用新Series数据覆盖旧数据");
			}else{
				series = new Series();
			}
			
			series.setCreateTime(new Date());
			series.setSeriesNumber(seriesNumber);
			series.setStudyId(studyDomainId);
			this.saveOrUpdate(series);
			
			return series;
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e.getMessage(),e);
		}
	}

	private Series getByCond(Integer studyDomainId, String seriesNumber) {
		SeriesExample example = new SeriesExample();
		SeriesExample.Criteria c = example.createCriteria();
		
		c.andStudyIdEqualTo(studyDomainId);
		c.andSeriesNumberEqualTo(seriesNumber);
		
		List<Series> list = seriesMapper.selectByExample(example);
		if( list != null && list.size() > 0 ){
			return list.get(0);
		}
		return null;
	}

	private void saveOrUpdate(Series series) {
		if( series != null ){
			if( series.getId() == null ){
				seriesMapper.insertSelective(series);
			}else{
				seriesMapper.updateByPrimaryKeySelective(series);
			}
		}
		
	}

	@Override
	public List<Series> listAllSeriesByStudyId(Integer studyId) throws ServiceException {
		SeriesExample example = new SeriesExample();
		SeriesExample.Criteria c = example.createCriteria();
		
		c.andStudyIdEqualTo(studyId);
		
		return seriesMapper.selectByExample(example);
	}

	@Override
	public void delete(List<Series> seriesList) throws ServiceException {
		for(Series series: seriesList ) {
			this.deleteById(series.getId());
		}
	}

	private void deleteById(Integer seriesId) {
		seriesMapper.deleteByPrimaryKey(seriesId);
	}
	
	
}
