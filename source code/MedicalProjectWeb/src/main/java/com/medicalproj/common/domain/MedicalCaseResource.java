package com.medicalproj.common.domain;

public class MedicalCaseResource {
    private Integer id;

    private Integer ownerMedicalCaseId;

    private Integer uploadId;

    private String bodyParts;

    private String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwnerMedicalCaseId() {
        return ownerMedicalCaseId;
    }

    public void setOwnerMedicalCaseId(Integer ownerMedicalCaseId) {
        this.ownerMedicalCaseId = ownerMedicalCaseId;
    }

    public Integer getUploadId() {
        return uploadId;
    }

    public void setUploadId(Integer uploadId) {
        this.uploadId = uploadId;
    }

    public String getBodyParts() {
        return bodyParts;
    }

    public void setBodyParts(String bodyParts) {
        this.bodyParts = bodyParts == null ? null : bodyParts.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}