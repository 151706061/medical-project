package com.medicalproj.admin.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.admin.dto.param.AddUserParam;
import com.medicalproj.admin.dto.param.ListUserParam;
import com.medicalproj.admin.dto.view.UserListView;
import com.medicalproj.admin.service.IAdminUserManageService;
import com.medicalproj.common.domain.UserView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IUserService;
import com.medicalproj.common.util.PagerHelper;
import com.medicalproj.web.dto.view.PagerView;

@Service
public class AdminUserManageServiceImpl implements IAdminUserManageService{
	private Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private IUserService userService;

	@Override
	public View<UserListView> listUser(ListUserParam param) throws ServiceException {
		View<UserListView> view = new View<UserListView>();
		try {
			UserListView userListView = new UserListView();
			
			List<UserView> userViewList = userService.listUserViewByCond(param);
			userListView.setUsers(userViewList);
			
			int totalCount = userService.countUserViewByCond(param);
			PagerView pager = PagerHelper.getPager(param.getPage(), param.getPageSize(), totalCount);
			userListView.setPager(pager);
			
			view.setData(userListView);
			return view;
		} catch (Exception e) {
			logger.error("listUser",e);
			view.setSuccess(false);
			view.setMsg(e.getMessage());
			return view;
		}
	}

	@Override
	public View<Boolean> delUser(Integer userId) throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		
		try {
			userService.delUserById(userId);
			view.setData(true);
			return view;
		} catch (Exception e) {
			view.setSuccess(false);
			view.setMsg(e.getMessage());
			return view;
		}
	}

	@Override
	public View<Boolean> addUser(AddUserParam param) throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		
		userService.addUser(param);
		
		view.setData(true);
		return view;
	}
	
}
