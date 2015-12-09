package com.medicalproj.common.service;

import java.util.List;

import com.medicalproj.admin.dto.param.ListUserParam;
import com.medicalproj.common.domain.User;
import com.medicalproj.common.domain.UserView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;

public interface IUserService {

	User getByMobile(String mobile)throws ServiceException;

	User getByEmail(String email)throws ServiceException;

	User initUserByMobile(String mobile)throws ServiceException;

	void saveOrUpdate(User user)throws ServiceException;

	User getByMobileOrEmail(String account)throws ServiceException;

	User getById(Integer userId)throws ServiceException;

	List<UserView> listAllJuniorDoctor()throws ServiceException;
	
	List<UserView> listAllSeniorDoctor()throws ServiceException;

	List<UserView> listUserViewByCond(ListUserParam param)throws ServiceException;

	int countUserViewByCond(ListUserParam param)throws ServiceException;

	void delUserById(Integer userId)throws ServiceException;

	List<UserView> listAllSecretary()throws ServiceException;

}
