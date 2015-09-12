package com.medicalproj.common.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalproj.common.dao.TransactionMapper;
import com.medicalproj.common.dao.TransactionViewMapper;
import com.medicalproj.common.domain.TransactionView;
import com.medicalproj.common.domain.TransactionViewExample;
import com.medicalproj.common.exception.ServiceException;
import com.medicalproj.common.service.ITransactionService;
import com.medicalproj.common.util.PagerHelper;
import com.medicalproj.web.dto.param.ListTransactionParam;

@Service
public class TransactionServiceImpl implements ITransactionService {
	@Autowired
	private TransactionMapper mapper;
	
	@Autowired
	private TransactionViewMapper transactionViewMapper;

	@Override
	public List<TransactionView> listTransactionByUser(ListTransactionParam param)
			throws ServiceException {
		try {
			TransactionViewExample example = buildTransactionViewExample(param);

			int start = PagerHelper.getStart(param.getPage(),param.getPageSize());
			int limit = param.getPageSize();
			RowBounds bounds = new RowBounds(start,limit);
			return transactionViewMapper.selectByExampleWithRowbounds(example, bounds);
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(),e);
		}
	}

	@Override
	public Integer countTransactionByUser(ListTransactionParam param) throws ServiceException {
		try {
			TransactionViewExample example = buildTransactionViewExample(param);

			return transactionViewMapper.countByExample(example);
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(),e);
		}
	}

	private TransactionViewExample buildTransactionViewExample(ListTransactionParam param) {
		TransactionViewExample example = new TransactionViewExample();
		TransactionViewExample.Criteria c = example.createCriteria();
		c.andOwnerUserIdEqualTo(param.getUserId());
		if( param.getStartDate() != null ){
			c.andTransTimeOriginGreaterThan(param.getStartDate());
		}
		
		return example;
	}
	
	
	
}
