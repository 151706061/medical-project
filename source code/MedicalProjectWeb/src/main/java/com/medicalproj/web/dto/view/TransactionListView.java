package com.medicalproj.web.dto.view;

import java.util.List;

import com.medicalproj.common.domain.TransactionView;

public class TransactionListView {
	private List<TransactionView> transactions;
	private PagerView pager;
	public List<TransactionView> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<TransactionView> transactions) {
		this.transactions = transactions;
	}
	public PagerView getPager() {
		return pager;
	}
	public void setPager(PagerView pager) {
		this.pager = pager;
	}
}
