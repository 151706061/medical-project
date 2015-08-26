package com.medicalproj.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.medicalproj.web.service.ITransactionService;

@RequestMapping("/web/transaction")
public class TransactionController {
	@Autowired
	private ITransactionService transactionService;
	
}
