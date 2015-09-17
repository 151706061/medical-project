package com.medicalproj.common.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.dao.TaskViewMapper;
import com.medicalproj.common.domain.TaskView;
import com.medicalproj.common.domain.TaskViewExample;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.ITaskService;
import com.medicalproj.common.util.AssertUtil;
import com.medicalproj.common.util.PagerHelper;
import com.medicalproj.web.dto.param.ListTaskParam;

@Service
public class TaskServiceImpl implements ITaskService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private TaskViewMapper taskViewMapper;
	
	@Override
	public List<TaskView> listTaskByCond(ListTaskParam param)
			throws ServiceException {
		try {
			TaskViewExample example = buildTaskViewExample(param);

			int start = PagerHelper.getStart(param.getPage(),param.getPageSize());
			int limit = param.getPageSize();
			RowBounds bounds = new RowBounds(start,limit);
			return taskViewMapper.selectByExampleWithRowbounds(example, bounds);
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e.getMessage(),e);
		}
	}

	@Override
	public Integer countTaskByCond(ListTaskParam param) throws ServiceException {
		try {
			TaskViewExample example = buildTaskViewExample(param);

			return taskViewMapper.countByExample(example);
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e.getMessage(),e);
		}
	}

	private TaskViewExample buildTaskViewExample(ListTaskParam param) {
		if( param == null ){
			return new TaskViewExample();
		}
		TaskViewExample example = new TaskViewExample();
		TaskViewExample.Criteria c = example.createCriteria();
		if( AssertUtil.isNotEmpty(param.getOwnerId()) ){
			c.andTaskOwnerUserIdEqualTo(param.getOwnerId());
		}
		return example;
	}

}
