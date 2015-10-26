package com.medicalproj.web.util;

public class Constants {
	public static final String SESSION_KEY_LOGIN_ADMIN_ID = "SESSION_KEY_LOGIN_ADMIN_ID";
	public static final String SESSION_KEY_LOGIN_USER = "SESSION_KEY_LOGIN_USER";
	public static final String SESSION_KEY_FILE_BASE_PATH = "SESSION_KEY_FILE_BASE_PATH";
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

	//任务类型 : 病例诊断(1)  资格审批(2)
	public static final int TASK_TYPE_MEDICAL_CASE_DIAGNOSE = 1;
	public static final int TASK_TYPE_QUALIFICATION_AUDIT = 2;
	public static final int TASK_TYPE_MEDICAL_CASE_AUDIT = 3;
	public static final int TASK_TYPE_MEDICAL_CASE_ASSIGN = 4;
	
	/*任务状态*/
	//病例诊断状态 ：1待审 2待诊断 3完成 4已分配待诊断 
	public static final int TASK_STATUS_MEDICAL_CASE_WAIT_FOR_ASSIGNED = 0;
	public static final int TASK_STATUS_MEDICAL_CASE_WAIT_FOR_AUDIT = 1;
	//public static final int TASK_STATUS_MEDICAL_CASE_WAIT_FOR_DIAGNOSE = 2;
	//public static final int TASK_STATUS_MEDICAL_CASE_COMPLETE = 3;
	public static final int TASK_STATUS_MEDICAL_CASE_ASSIGNED_WAIT_FOR_DIAGNOSE = 4;
	public static final int TASK_STATUS_MEDICAL_CASE_ASSIGN_COMPLETE = 10;
	public static final int TASK_STATUS_MEDICAL_CASE_DIAGNOSE_COMPLETE = 11;
	public static final int TASK_STATUS_MEDICAL_CASE_AUDIT_COMPLETE = 12;
	
	//资格审批状态 ： 5待审 6批准 7拒绝 
	public static final int TASK_STATUS_QUALIFICATION_AUDIT_WAIT_FOR_REVIEW = 5;
	public static final int TASK_STATUS_QUALIFICATION_AUDIT_APPROVE = 6;
	public static final int TASK_STATUS_QUALIFICATION_AUDIT_REJECT = 7;
	/* END - 任务状态*/

	public static final int UPLOAD_FILE_TYPE_JPEG = 1;
	public static final int UPLOAD_FILE_TYPE_PNG = 2;
	public static final int UPLOAD_FILE_TYPE_DICOM = 3;

	public static final String CONTENT_TYPE_JPG_JPEG = "image/jpeg";
	public static final String CONTENT_TYPE_PNG = "image/png";
	public static final String CONTENT_TYPE_DICOM = "application/dicom";
	public static final String CONTENT_TYPE_OCTET_STREAM = "application/octet-stream";

	public static final int MEDICAL_CASE_STATUS_OPEN = 1;

	public static final int MEDICAL_CASE_IS_UPLOAD_COMPLETE_FALSE = 0;
	public static final int MEDICAL_CASE_IS_UPLOAD_COMPLETE_TRUE = 1;

	//待诊断
	public static final int STUDY_STATUS_WAIT_FOR_DIAGNOSE = 1;
	//待审查
	public static final int STUDY_STATUS_WAIT_FOR_AUDIT = 2;
	//完成审查
	public static final int STUDY_STATUS_COMPLETE_AUDIT = 3;

	public static final String FILE_SUFFIX_JPG = "jpg";
	//public final static String FTP_HTTP_BASE_URL = "http://52.27.220.196/ftp/";
	public final static String FTP_HTTP_BASE_URL = "http://localhost:8080/ftp/";
	
	
	

	
}
