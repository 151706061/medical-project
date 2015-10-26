package com.medicalproj.common.domain;

public class TaskView {
    private Integer taskId;

    private String taskType;

    private String taskStatus;

    private Long resourceId;

    private String taskCreateTime;

    private String processTime;

    private Integer taskOwnerUserId;

    private String taskOwnerUserName;

    private String taskOwnerUserEmail;

    private String taskOwnerUserMobile;

    private String patientName;

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

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public String getTaskCreateTime() {
        return taskCreateTime;
    }

    public void setTaskCreateTime(String taskCreateTime) {
        this.taskCreateTime = taskCreateTime == null ? null : taskCreateTime.trim();
    }

    public String getProcessTime() {
        return processTime;
    }

    public void setProcessTime(String processTime) {
        this.processTime = processTime == null ? null : processTime.trim();
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
}