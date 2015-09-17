package com.medicalproj.common.service;

import java.util.List;

import com.medicalproj.common.domain.AuthorizeUserView;
import com.medicalproj.common.exception.ServiceException;

public interface IPayAuthorizeService {

	List<AuthorizeUserView> listAuthorizeUserByEnterprise(
			Integer enterpriseUserId, Integer page, Integer pageSize)throws ServiceException;

	Integer countAuthorizeUserByEnterprise(Integer enterpriseUserId)throws ServiceException;

	void authorize(Integer payAuthorizeId)throws ServiceException;

	void unauthorize(Integer payAuthorizeId)throws ServiceException;

}
