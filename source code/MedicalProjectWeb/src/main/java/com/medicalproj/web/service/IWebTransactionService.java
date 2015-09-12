package com.medicalproj.web.service;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.web.dto.param.ListTransactionParam;
import com.medicalproj.web.dto.view.TransactionListView;

public interface IWebTransactionService {

	View<TransactionListView> listTransaction(ListTransactionParam param)throws ServiceException;

}
