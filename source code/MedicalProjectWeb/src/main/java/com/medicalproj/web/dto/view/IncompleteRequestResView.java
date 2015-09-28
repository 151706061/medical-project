package com.medicalproj.web.dto.view;

public class IncompleteRequestResView {
	private String uploadNo;
	private Integer alreadyUploadCount;
	private String firstUploadTime;
	public String getUploadNo() {
		return uploadNo;
	}
	public void setUploadNo(String uploadNo) {
		this.uploadNo = uploadNo;
	}
	public Integer getAlreadyUploadCount() {
		return alreadyUploadCount;
	}
	public void setAlreadyUploadCount(Integer alreadyUploadCount) {
		this.alreadyUploadCount = alreadyUploadCount;
	}
	public String getFirstUploadTime() {
		return firstUploadTime;
	}
	public void setFirstUploadTime(String firstUploadTime) {
		this.firstUploadTime = firstUploadTime;
	}
}
