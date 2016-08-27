package com.medicalproj.web.dto.view;

public class ListMedicalCaseParam {
	private Integer ownerUserType;
	private Integer ownerUserId;
	private Integer page;
	private Integer pageSize;
	
	public Integer getOwnerUserType() {
		return ownerUserType;
	}
	public void setOwnerUserType(Integer ownerUserType) {
		this.ownerUserType = ownerUserType;
	}
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
