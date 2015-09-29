package com.medicalproj.web.dto.view;

public class ListMedicalCaseParam {
	private Integer ownerUserId;
	private Integer page;
	private Integer pageSize;
	public Integer getOwnerUserId() {
		return ownerUserId;
	}
	public void setOwnerUserId(Integer ownerUserId) {
		this.ownerUserId = ownerUserId;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
