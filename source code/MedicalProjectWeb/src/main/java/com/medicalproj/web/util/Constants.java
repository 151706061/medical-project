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
	public static final int USER_TYPE_SECRETARY = 5;				//秘书
	public static final int USER_TYPE_CHIEF_CENSOR_DOCTOR = 6;		//主检医师
	public static final int USER_TYPE_CHIEF_PHSICIAN = 7;			//主任医师
	
	// notification read status
	public static final int NOTIFICATION_IS_READ_FALSE = 0;
	public static final int NOTIFICATION_IS_READ_TRUE = 1;

	/* notification status */
	public static final int NOTIFICATION_STATUS_WAIT_FOR_REVIEW = 1;	//待审核
	public static final int NOTIFICATION_STATUS_APPROVE = 2;			//同意
	public static final int NOTIFICATION_STATUS_REJECT = 3;				//拒绝
	public static final int NOTIFICATION_STATUS_EXPIRE = 4;				//过期
	
	/* notification type */
	public static final int NOTIFICATION_TYPE_NORMAL = 0;				//普通通知(仅文字，无后续操作)
	public static final int NOTIFICATION_TYPE_DIAGNOSE_INVITATION = 1;	//诊断邀请 
	
	/* notification from type */
	public static final int NOTIFICATION_FROM_TYPE_USER = 1;	//来源是用户(用户操作产生的通知)
	
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
	public static final int TASK_TYPE_MEDICAL_CASE_FIRST_REVIEW = 5;
	public static final int TASK_TYPE_MEDICAL_CASE_FINAL_REVIEW = 6;
	
	/*任务状态*/
	//病例诊断状态 ：1待审 2待诊断 3完成 4已分配待诊断 
	public static final int MEDICAL_CASE_STATUS_WAIT_FOR_ASSIGNED = 0;
	public static final int MEDICAL_CASE_STATUS_WAIT_FOR_AUDIT = 1;
	//public static final int TASK_STATUS_MEDICAL_CASE_WAIT_FOR_DIAGNOSE = 2;
	//public static final int TASK_STATUS_MEDICAL_CASE_COMPLETE = 3;
	public static final int MEDICAL_CASE_STATUS_ASSIGNED_WAIT_FOR_DIAGNOSE = 4;
	public static final int MEDICAL_CASE_STATUS_ASSIGN_COMPLETE = 10;
	public static final int MEDICAL_CASE_STATUS_DIAGNOSE_COMPLETE = 11;
	public static final int MEDICAL_CASE_STATUS_AUDIT_COMPLETE = 12;
	public static final int MEDICAL_CASE_STATUS_WAIT_FOR_FIRST_REVIEW = 13;
	public static final int MEDICAL_CASE_STATUS_FIRST_REVIEW_COMPLETE = 14;
	public static final int MEDICAL_CASE_STATUS_WAIT_FOR_FINAL_REVIEW = 15;
	public static final int MEDICAL_CASE_STATUS_FINAL_REVIEW_COMPLETE = 16;
	
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
	public final static String FTP_HTTP_BASE_URL = "http://dupiange.com/ftp/";
	
	//public final static String FTP_HTTP_BASE_URL = "http://localhost:8080/ftp/";
	
	// 未操作通知过期时间 
	public static final int NOTIFICATION_CONFIRM_EXPIRE_PERIOD = 3600*24*5;
	
	public static final int IS_DIAGNOSED_TRUE = 1;
	public static final int IS_DIAGNOSED_FALSE = 0;
	public static final int IS_FIRST_REVIEWED_TRUE = 1;
	public static final int IS_FIRST_REVIEWED_FALSE = 0;
	public static final int IS_FINAL_REVIEWED_TRUE = 1;
	
	
	
}
