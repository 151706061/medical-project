package com.medicalproj.common.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.dao.TaskMapper;
import com.medicalproj.common.dao.TaskViewMapper;
import com.medicalproj.common.domain.StudyView;
import com.medicalproj.common.domain.Task;
import com.medicalproj.common.domain.TaskView;
import com.medicalproj.common.domain.TaskViewExample;
import com.medicalproj.common.domain.UserView;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IMedicalCaseService;
import com.medicalproj.common.service.IStudyService;
import com.medicalproj.common.service.ITaskService;
import com.medicalproj.common.service.IUserService;
import com.medicalproj.common.util.AssertUtil;
import com.medicalproj.common.util.PagerHelper;
import com.medicalproj.web.dto.param.ListTaskParam;
import com.medicalproj.web.util.Constants;

@Service
public class TaskServiceImpl implements ITaskService {
	private Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	private TaskMapper taskMapper;
	@Autowired
	private TaskViewMapper taskViewMapper;
	@Autowired
	private IUserService userService;
	@Autowired
	private IMedicalCaseService medicalCaseService;
	@Autowired
	private IStudyService studyService;
	
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

	@Override
	public void assignDiagnoseTask(List<Integer> medicalCaseIdList) throws ServiceException {
		List<UserView> seniorList = userService.listAllSeniorDoctor();
		if( seniorList != null && seniorList.size() > 0 ){
			UserView senor = seniorList.get(0);
			
			if( medicalCaseIdList != null ){
				for( Integer mcId :medicalCaseIdList ){
					List<StudyView> studyList = studyService.listAllStudyByMedicalCaseId(mcId);
					
					if( studyList != null ){
						for( StudyView studyView : studyList ){
							Task task = new Task();
							task.setCreateTime(new Date());
							task.setOwnerUserId(senor.getId());
							task.setResourceId(studyView.getId());
							task.setStatus(Constants.TASK_STATUS_MEDICAL_CASE_ASSIGNED_WAIT_FOR_DIAGNOSE);
							task.setType(Constants.TASK_TYPE_MEDICAL_CASE_DIAGNOSE);
							
							this.saveOrUpdate(task);
						}
					}
				}
			}
		}
	}

	private void saveOrUpdate(Task task) {
		if( task != null ){
			if( task.getId() == null ){
				taskMapper.insertSelective(task);
			}
			else{
				taskMapper.updateByPrimaryKey(task);
			}
		}
		
	}

}
