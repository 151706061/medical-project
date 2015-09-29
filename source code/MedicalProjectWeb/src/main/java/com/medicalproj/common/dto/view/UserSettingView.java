package com.medicalproj.common.dto.view;

public class UserSettingView {
	private Integer userId;
	private String userName;
	private String mobile;
	private String email;
	private Integer isReceiveNotification;
	
	private String contactUserName;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getIsReceiveNotification() {
		return isReceiveNotification;
	}
	public void setIsReceiveNotification(Integer isReceiveNotification) {
		this.isReceiveNotification = isReceiveNotification;
	}
	public String getContactUserName() {
		return contactUserName;
	}
	public void setContactUserName(String contactUserName) {
		this.contactUserName = contactUserName;
	}
	
}
