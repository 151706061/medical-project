package com.medicalproj.web.util;

public class Constants {
	public static final String SESSION_KEY_LOGIN_USER = "SESSION_KEY_LOGIN_USER";
	
	/*
	 * 用户类型
	 */
	public static final int USER_TYPE_USER = 1;
	public static final int USER_TYPE_JUNIOR_DOCTOR = 2;
	public static final int USER_TYPE_SENIOR_DOCTOR = 3;
	public static final int USER_TYPE_ENTERPRISE_USER = 4;

	public static final int NOTIFICATION_IS_READ_FALSE = 0;
	public static final int NOTIFICATION_IS_READ_TRUE = 1;

	public static final int PAY_AUTHORIZE_STATUS_AUTHORIZED = 1;
	public static final int PAY_AUTHORIZE_STATUS_NOT_AUTHORIZED = 2;

	public static final int QUALIFICATION_APPLICATION_STATUS_WAIT_FOR_REVIEW = 1;
	public static final int QUALIFICATION_APPLICATION_STATUS_APPROVE = 2;
	public static final int QUALIFICATION_APPLICATION_STATUS_REJECT = 3;

}
