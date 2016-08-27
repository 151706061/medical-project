package com.medicalproj.common.domain;

import java.util.Date;

public class TaskView {
    private Integer taskId;

    private String taskType;

    private String taskStatus;

    private Integer medicalCaseStatusCode;

    private Long resourceId;

    private Date taskCreateTime;

    private String taskCreateTimeStr;

    private String processTimeStr;

    private Integer taskOwnerUserId;

    private String taskOwnerUserName;

    private String taskOwnerUserEmail;

    private String taskOwnerUserMobile;

    private String patientName;

    private Integer medicalCaseCreatorUserId;

    private String medicalCaseCreatorUserName;

    private Long totalImageCount;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus == null ? null : taskStatus.trim();
    }

    public Integer getMedicalCaseStatusCode() {
        return medicalCaseStatusCode;
    }

    public void setMedicalCaseStatusCode(Integer medicalCaseStatusCode) {
        this.medicalCaseStatusCode = medicalCaseStatusCode;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Date getTaskCreateTime() {
        return taskCreateTime;
    }

    public void setTaskCreateTime(Date taskCreateTime) {
        this.taskCreateTime = taskCreateTime;
    }

    public String getTaskCreateTimeStr() {
        return taskCreateTimeStr;
    }

    public void setTaskCreateTimeStr(String taskCreateTimeStr) {
        this.taskCreateTimeStr = taskCreateTimeStr == null ? null : taskCreateTimeStr.trim();
    }

    public String getProcessTimeStr() {
        return processTimeStr;
    }

    public void setProcessTimeStr(String processTimeStr) {
        this.processTimeStr = processTimeStr == null ? null : processTimeStr.trim();
    }

    public Integer getTaskOwnerUserId() {
        return taskOwnerUserId;
    }

    public void setTaskOwnerUserId(Integer taskOwnerUserId) {
        this.taskOwnerUserId = taskOwnerUserId;
    }

    public String getTaskOwnerUserName() {
        return taskOwnerUserName;
    }

    public void setTaskOwnerUserName(String taskOwnerUserName) {
        this.taskOwnerUserName = taskOwnerUserName == null ? null : taskOwnerUserName.trim();
    }

    public String getTaskOwnerUserEmail() {
        return taskOwnerUserEmail;
    }

    public void setTaskOwnerUserEmail(String taskOwnerUserEmail) {
        this.taskOwnerUserEmail = taskOwnerUserEmail == null ? null : taskOwnerUserEmail.trim();
    }

    public String getTaskOwnerUserMobile() {
        return taskOwnerUserMobile;
    }

    public void setTaskOwnerUserMobile(String taskOwnerUserMobile) {
        this.taskOwnerUserMobile = taskOwnerUserMobile == null ? null : taskOwnerUserMobile.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public Integer getMedicalCaseCreatorUserId() {
        return medicalCaseCreatorUserId;
    }

    public void setMedicalCaseCreatorUserId(Integer medicalCaseCreatorUserId) {
        this.medicalCaseCreatorUserId = medicalCaseCreatorUserId;
    }

    public String getMedicalCaseCreatorUserName() {
        return medicalCaseCreatorUserName;
    }

    public void setMedicalCaseCreatorUserName(String medicalCaseCreatorUserName) {
        this.medicalCaseCreatorUserName = medicalCaseCreatorUserName == null ? null : medicalCaseCreatorUserName.trim();
    }

    public Long getTotalImageCount() {
        return totalImageCount;
    }

    public void setTotalImageCount(Long totalImageCount) {
        this.totalImageCount = totalImageCount;
    }
}