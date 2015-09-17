package com.medicalproj.web.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.domain.AuthorizeUserView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.IPayAuthorizeService;
import com.medicalproj.common.util.PagerHelper;
import com.medicalproj.web.dto.view.PagerView;
import com.medicalproj.web.dto.view.UserAuthorizeListView;
import com.medicalproj.web.service.IWebEnterpriseUserManageService;

@Service
public class WebEnterpriseUserManageServiceImpl implements IWebEnterpriseUserManageService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private IPayAuthorizeService authorizeUserService;
	
	@Override
	public View<UserAuthorizeListView> listAuthorizeUser(Integer enterpriseUserId, Integer page, Integer pageSize)
			throws ServiceException {
		View<UserAuthorizeListView> view = new View<UserAuthorizeListView>();
		try {
			UserAuthorizeListView userAuthorizeListView = new UserAuthorizeListView();
			view.setData(userAuthorizeListView);
			
			List<AuthorizeUserView> authorizeUserViewList = authorizeUserService.listAuthorizeUserByEnterprise(enterpriseUserId,page,pageSize);
			userAuthorizeListView.setUsers(authorizeUserViewList);
			
			Integer totalCount = authorizeUserService.countAuthorizeUserByEnterprise(enterpriseUserId);
			PagerView pager = PagerHelper.getPager(page,pageSize,totalCount);
			userAuthorizeListView.setPager(pager);
			
			return view;
		} catch (Exception e) {
			logger.error(e);
			view.setMsg(e.getMessage());
			return view;
		}
	}

	@Override
	public View<Boolean> authorize(Integer payAuthorizeId)
			throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		
		try {
			authorizeUserService.authorize(payAuthorizeId);
			view.setData(true);
			return view;
		} catch (Exception e) {
			logger.error(e);
			view.setMsg(e.getMessage());
			view.setData(false);
			return view;
		}
	}

	@Override
	public View<Boolean> unauthorize(Integer payAuthorizeId)
			throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		
		try {
			authorizeUserService.unauthorize(payAuthorizeId);
			view.setData(true);
			return view;
		} catch (Exception e) {
			logger.error(e);
			view.setMsg(e.getMessage());
			view.setData(false);
			return view;
		}
	}
	
}
