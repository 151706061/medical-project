package com.medicalproj.web.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.util.DateHelper;
import com.medicalproj.web.dto.param.ListTransactionParam;
import com.medicalproj.web.dto.session.User;
import com.medicalproj.web.dto.view.TransactionListView;
import com.medicalproj.web.service.IWebTransactionService;

@RequestMapping("/web/transaction")
@Controller
public class WebTransactionController extends WebBaseController {
	private static final String PERIOD_TYPE_ALL = "all";
	private static final String PERIOD_TYPE_WEEK = "week";
	private static final String PERIOD_TYPE_MONTH = "month";
	private static final String PERIOD_TYPE_THREE_MONTH = "3month";
	private static final String PERIOD_TYPE_HALF_YEAR = "halfYear";
	private static final String PERIOD_TYPE_ONE_YEAR = "oneYear";
	@Autowired
	private IWebTransactionService webTransactionService;
	
	@RequestMapping("/listTransaction")
	@ResponseBody
	public View<TransactionListView> listTransaction(String periodType ,@ModelAttribute("param")ListTransactionParam param,HttpSession session){
		User user = super.getLoginUser(session);
		Date date = null;
		if( periodType != null ){
			if( periodType.trim().length() == 0 || periodType.equals(PERIOD_TYPE_ALL) ){
				date = null;
			}else if( periodType.equals(PERIOD_TYPE_WEEK) ){
				date = DateHelper.getOneWeekBefore();
			}else if( periodType.equals(PERIOD_TYPE_MONTH) ){
				date = DateHelper.getOneMonthBefore();
			}else if( periodType.equals(PERIOD_TYPE_THREE_MONTH) ){
				date = DateHelper.getThreeMonthBefore();
			}else if( periodType.equals(PERIOD_TYPE_HALF_YEAR) ){
				date = DateHelper.getHalfYearBefore();
			}else if( periodType.equals(PERIOD_TYPE_ONE_YEAR) ){
				date = DateHelper.getOneYearBefore();
			}
		}
		param.setStartDate(date);
		param.setUserId(user.getId());
		View<TransactionListView> view = webTransactionService.listTransaction(param);
		
		return view;
	}
	
}
