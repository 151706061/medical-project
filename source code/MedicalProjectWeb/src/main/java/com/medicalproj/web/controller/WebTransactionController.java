package com.medicalproj.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.medicalproj.web.service.IWebTransactionService;

@RequestMapping("/web/transaction")
public class WebTransactionController {
	@Autowired
	private IWebTransactionService transactionService;
	
}
