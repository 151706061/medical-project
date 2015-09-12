package com.medicalproj.common.service;

import java.util.List;

import com.medicalproj.common.domain.TransactionView;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.param.ListTransactionParam;

public interface ITransactionService {

	List<TransactionView> listTransactionByUser( ListTransactionParam param)throws ServiceException;

	Integer countTransactionByUser(ListTransactionParam param)throws ServiceException;

}
