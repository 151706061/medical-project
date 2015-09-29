package com.medicalproj.web.dto.param;

public class SettingSaveParam {
	private String userName;
	private String mobile;
	private String email;
	private boolean isReceiveNotification;
	private String contactUserName;
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
	public boolean isReceiveNotification() {
		return isReceiveNotification;
	}
	public void setReceiveNotification(boolean isReceiveNotification) {
		this.isReceiveNotification = isReceiveNotification;
	}
	public String getContactUserName() {
		return contactUserName;
	}
	public void setContactUserName(String contactUserName) {
		this.contactUserName = contactUserName;
	}
	
}
