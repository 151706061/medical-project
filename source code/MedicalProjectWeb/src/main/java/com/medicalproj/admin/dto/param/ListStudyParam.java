package com.medicalproj.admin.dto.param;

public class ListStudyParam {
	private String patientId;
	private String patientName;
	private String creatorUserName;
	private String createTime;
	private String studyStatus;
	
	private Integer page;
	private Integer pageSize;
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getCreatorUserName() {
		return creatorUserName;
	}
	public void setCreatorUserName(String creatorUserName) {
		this.creatorUserName = creatorUserName;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getStudyStatus() {
		return studyStatus;
	}
	public void setStudyStatus(String studyStatus) {
		this.studyStatus = studyStatus;
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
