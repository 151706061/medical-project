package com.medicalproj.common.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.dao.TaskMapper;
import com.medicalproj.common.dao.TaskViewMapper;
import com.medicalproj.common.domain.MedicalCase;
import com.medicalproj.common.domain.Study;
import com.medicalproj.common.domain.StudyView;
import com.medicalproj.common.domain.Task;
import com.medicalproj.common.domain.TaskExample;
import com.medicalproj.common.domain.TaskView;
import com.medicalproj.common.domain.TaskViewExample;
import com.medicalproj.common.domain.User;
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

			
			example.setOrderByClause("TASK_CREATE_TIME DESC");
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
		
		if( AssertUtil.isNotEmpty(param.getStatus()) ){
			c.andMedicalCaseStatusCodeEqualTo(param.getStatus());
		}
		
		return example;
	}

	@Override
	public void createAssignTask(List<Integer> medicalCaseIdList) throws ServiceException {
		List<UserView> secretaryList = userService.listAllSecretary();
		if( secretaryList != null && secretaryList.size() > 0 ){
			// ### 新建的病例，待分配状态，之后由专家分配 ### 
			// 2015.12 修改为分配给秘书
			UserView secretary = secretaryList.get(0);
			
			if( medicalCaseIdList != null ){
				for( Integer mcId :medicalCaseIdList ){
					List<StudyView> studyList = studyService.listAllStudyViewByMedicalCaseId(mcId);
					
					if( studyList != null ){
						for( StudyView studyView : studyList ){
							Task task = new Task();
							task.setCreateTime(new Date());
							task.setOwnerUserId(secretary.getId());
							task.setResourceId(studyView.getId());
							task.setType(Constants.TASK_TYPE_MEDICAL_CASE_ASSIGN);

							this.saveOrUpdate(task);
							
							// 更新病例 状态为 待分配
							Integer medicalCaseId = studyView.getMedicalCaseId();
							MedicalCase mc = medicalCaseService.getById(medicalCaseId);
							
							mc.setStatus(Constants.MEDICAL_CASE_STATUS_WAIT_FOR_ASSIGNED);
							medicalCaseService.saveOrUpdate(mc);
						}
					}
				}
			}
		}
	}


	@Override
	public void saveOrUpdate(Task task) throws ServiceException {
		if( task != null ){
			if( task.getId() == null ){
				Task existsTask = this.getByCond(task.getOwnerUserId(), task.getResourceId());
				if( existsTask == null ){
					taskMapper.insertSelective(task);
				}
			}
			else{
				taskMapper.updateByPrimaryKey(task);
			}
		}
	}

	private Task getByCond(Integer userId, Integer studyId) {
		TaskExample example = new TaskExample();
		TaskExample.Criteria c = example.createCriteria();
		
		c.andOwnerUserIdEqualTo(userId);
		c.andResourceIdEqualTo(studyId);
		
		List<Task> taskList = taskMapper.selectByExample(example);
		if( taskList != null && taskList.size() > 0 ){
			return taskList.get(0);
		}
		return null;		
	}

	@Override
	public Task getMyDiagnoseTask(Integer studyId, Integer userId)
			throws ServiceException {
		Task task = this.getByCond( userId, studyId);
		return task;
	}

	@Override
	public Task getMyAuditTask(Integer studyId, Integer userId)
			throws ServiceException {
		Task task = this.getByCond( userId, studyId);
		return task;
	}

	private Task getByCond(Integer userId, Integer studyId,
			int taskType) {
		TaskExample example = new TaskExample();
		TaskExample.Criteria c = example.createCriteria();
		
		c.andOwnerUserIdEqualTo(userId);
		c.andTypeEqualTo(taskType);
		c.andResourceIdEqualTo(studyId);
		
		List<Task> taskList = taskMapper.selectByExample(example);
		if( taskList != null && taskList.size() > 0 ){
			return taskList.get(0);
		}
		return null;
	}

	@Override
	public void createDiagnoseTask(Integer studyId, Integer assignToUserId)
			throws ServiceException {
		try {
			Task task = new Task();
			task.setType(Constants.TASK_TYPE_MEDICAL_CASE_DIAGNOSE);
			task.setResourceId(studyId);
			task.setOwnerUserId(assignToUserId);
			task.setCreateTime(new Date());
			
			this.saveOrUpdate(task);
			
			
			Study study = studyService.getById(studyId);
			Integer medicalCaseId = study.getMedicalCaseId();
			MedicalCase mc = medicalCaseService.getById(medicalCaseId);
			mc.setStatus(Constants.MEDICAL_CASE_STATUS_ASSIGNED_WAIT_FOR_DIAGNOSE);
			
			medicalCaseService.saveOrUpdate(mc);
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e.getMessage());
		}		
	}


	@Override
	public void createAuditTask(Integer studyId) throws ServiceException {
		List<UserView> seniorList = userService.listAllSeniorDoctor();
		if( seniorList != null && seniorList.size() > 0 ){
			UserView senor = seniorList.get(0);
			
			Task task = new Task();
			task.setType(Constants.TASK_TYPE_MEDICAL_CASE_AUDIT);
			task.setResourceId(studyId);
			task.setOwnerUserId(senor.getId());
			task.setCreateTime(new Date());
			
			this.saveOrUpdate(task);
			
			
			Study study = studyService.getById(studyId);
			Integer medicalCaseId = study.getMedicalCaseId();
			MedicalCase mc = medicalCaseService.getById(medicalCaseId);
			mc.setStatus(Constants.MEDICAL_CASE_STATUS_WAIT_FOR_AUDIT);
			
			medicalCaseService.saveOrUpdate(mc);
		}
		
	}

	@Override
	public Task getById(Integer taskId) throws ServiceException {
		return taskMapper.selectByPrimaryKey(taskId);
	}

	@Override
	public boolean hasNewTask(Integer userId) throws ServiceException {
		User user = userService.getById(userId);
		if( user == null ){
			throw new ServiceException("用户帐号不存在");
		}
		
		if( user.getUserType().equals(Constants.USER_TYPE_JUNIOR_DOCTOR) ){
			ListTaskParam param = new ListTaskParam();
			param.setOwnerId(userId);
			param.setStatus(Constants.MEDICAL_CASE_STATUS_ASSIGNED_WAIT_FOR_DIAGNOSE);
			param.setPage(1);
			param.setPageSize(1);
			
			List<TaskView> taskViewList = this.listTaskByCond(param);
			if( taskViewList != null && taskViewList.size() > 0 ){
				return true;
			}
			else{
				return false;
			}
		}else if( user.getUserType().equals(Constants.USER_TYPE_SENIOR_DOCTOR) ){
			ListTaskParam param = new ListTaskParam();
			param.setOwnerId(userId);
			param.setStatus(Constants.MEDICAL_CASE_STATUS_WAIT_FOR_ASSIGNED);
			param.setPage(1);
			param.setPageSize(1);
			
			List<TaskView> taskViewList = this.listTaskByCond(param);
			if( taskViewList != null && taskViewList.size() > 0 ){
				return true;
			}
			else{
				param = new ListTaskParam();
				param.setOwnerId(userId);
				param.setStatus(Constants.MEDICAL_CASE_STATUS_WAIT_FOR_AUDIT);
				param.setPage(1);
				param.setPageSize(1);
				
				taskViewList = this.listTaskByCond(param);
				if( taskViewList != null && taskViewList.size() > 0 ){
					return true;
				}else{
					return false;
				}
			}
		}
		return false;
	}

	@Override
	public void activeSecretaryMedicalCaseAssignTask(Integer studyId)
			throws ServiceException {
		List<UserView> secretaryList = userService.listAllSecretary();
		if( secretaryList != null && secretaryList.size() > 0 ){
			UserView secretary = secretaryList.get(0);
			
			Task task = this.getByCond(secretary.getId(), studyId, Constants.TASK_TYPE_MEDICAL_CASE_ASSIGN);
			task.setProcessTime(null);
			this.saveOrUpdate(task);
			
			// 更新病例 状态为 待分配
			Study study = studyService.getById(task.getResourceId());
			
			if( study != null ){
				Integer medicalCaseId = study.getMedicalCaseId();
				MedicalCase mc = medicalCaseService.getById(medicalCaseId);
				
				mc.setStatus(Constants.MEDICAL_CASE_STATUS_WAIT_FOR_ASSIGNED);
				medicalCaseService.saveOrUpdate(mc);
			}
		}
	}

	@Override
	public void createFirstReviewTask(Integer studyId) throws ServiceException {
		List<UserView> seniorList = userService.listAllChiefCensorDoctor();
		if( seniorList != null && seniorList.size() > 0 ){
			UserView chiefCensor = seniorList.get(0);
			
			Task task = new Task();
			task.setType(Constants.TASK_TYPE_MEDICAL_CASE_FIRST_REVIEW);
			task.setResourceId(studyId);
			task.setOwnerUserId(chiefCensor.getId());
			task.setCreateTime(new Date());
			
			this.saveOrUpdate(task);
			
			
			Study study = studyService.getById(studyId);
			Integer medicalCaseId = study.getMedicalCaseId();
			MedicalCase mc = medicalCaseService.getById(medicalCaseId);
			mc.setStatus(Constants.MEDICAL_CASE_STATUS_WAIT_FOR_FIRST_REVIEW);
			
			medicalCaseService.saveOrUpdate(mc);
		}
		
	}

	@Override
	public Task getMyFirstReviewTask(Integer studyId, Integer userId) throws ServiceException {
		Task task = this.getByCond( userId, studyId);
		return task;
	}

	@Override
	public Task getMyFinalReviewTask(Integer studyId, Integer userId) throws ServiceException {
		Task task = this.getByCond( userId, studyId);
		return task;
	}

	@Override
	public void createFinalReviewTask(Integer studyId) throws ServiceException {
		List<UserView> chiefPhsicianList = userService.listAllChiefPhsicianDoctor(); 
		if( chiefPhsicianList != null && chiefPhsicianList.size() > 0 ){
			UserView chiefCensor = chiefPhsicianList.get(0);
			
			Task task = new Task();
			task.setType(Constants.TASK_TYPE_MEDICAL_CASE_FINAL_REVIEW);
			task.setResourceId(studyId);
			task.setOwnerUserId(chiefCensor.getId());
			task.setCreateTime(new Date());
			
			this.saveOrUpdate(task);
			
			
			Study study = studyService.getById(studyId);
			Integer medicalCaseId = study.getMedicalCaseId();
			MedicalCase mc = medicalCaseService.getById(medicalCaseId);
			mc.setStatus(Constants.MEDICAL_CASE_STATUS_WAIT_FOR_FINAL_REVIEW);
			
			medicalCaseService.saveOrUpdate(mc);
		}
		
	}


}
