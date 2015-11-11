package com.medicalproj.common.domain;

public class MedicalCaseView {
    private Integer medicalCaseId;

    private String patientId;

    private String patientName;

    private String patientBirthday;

    private String patientSex;

    private String medicalCaseStatus;

    private Integer medicalCaseStatusCode;

    private String createTime;

    private Integer creatorUserId;

    private String creatorUserName;

    public Integer getMedicalCaseId() {
        return medicalCaseId;
    }

    public void setMedicalCaseId(Integer medicalCaseId) {
        this.medicalCaseId = medicalCaseId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public String getPatientBirthday() {
        return patientBirthday;
    }

    public void setPatientBirthday(String patientBirthday) {
        this.patientBirthday = patientBirthday == null ? null : patientBirthday.trim();
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex == null ? null : patientSex.trim();
    }

    public String getMedicalCaseStatus() {
        return medicalCaseStatus;
    }

    public void setMedicalCaseStatus(String medicalCaseStatus) {
        this.medicalCaseStatus = medicalCaseStatus == null ? null : medicalCaseStatus.trim();
    }

    public Integer getMedicalCaseStatusCode() {
        return medicalCaseStatusCode;
    }

    public void setMedicalCaseStatusCode(Integer medicalCaseStatusCode) {
        this.medicalCaseStatusCode = medicalCaseStatusCode;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Integer getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(Integer creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public String getCreatorUserName() {
        return creatorUserName;
    }

    public void setCreatorUserName(String creatorUserName) {
        this.creatorUserName = creatorUserName == null ? null : creatorUserName.trim();
    }
}