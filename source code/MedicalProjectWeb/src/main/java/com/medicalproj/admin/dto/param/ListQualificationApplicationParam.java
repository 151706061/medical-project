package com.medicalproj.admin.dto.param;

public class ListQualificationApplicationParam {
	private String applyUserName;
	private String applyTime;
	private String status;
	
	private Integer page;
	private Integer pageSize;
	public String getApplyUserName() {
		return applyUserName;
	}
	public void setApplyUserName(String applyUserName) {
		this.applyUserName = applyUserName;
	}
	public String getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
