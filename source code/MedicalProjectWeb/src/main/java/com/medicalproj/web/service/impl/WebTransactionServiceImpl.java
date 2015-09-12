package com.medicalproj.web.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.domain.TransactionView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.ITransactionService;
import com.medicalproj.common.util.PagerHelper;
import com.medicalproj.web.dto.param.ListTransactionParam;
import com.medicalproj.web.dto.view.PagerView;
import com.medicalproj.web.dto.view.TransactionListView;
import com.medicalproj.web.service.IWebTransactionService;

@Service
public class WebTransactionServiceImpl implements IWebTransactionService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private ITransactionService transactionService;
	
	@Override
	public View<TransactionListView> listTransaction( ListTransactionParam param)
			throws ServiceException {
		View<TransactionListView> view = new View<TransactionListView>();
		try {
			TransactionListView transactionListView = new TransactionListView();
			view.setData(transactionListView);
			
			List<TransactionView> transactionView = transactionService.listTransactionByUser(param);
			transactionListView.setTransactions(transactionView);
			
			Integer totalCount = transactionService.countTransactionByUser(param);
			PagerView pager = PagerHelper.getPager(param.getPage(),param.getPageSize(),totalCount);
			transactionListView.setPager(pager);
			
			return view;
		} catch (Exception e) {
			view.setMsg(e.getMessage());
			return view;
		}
	}

}
