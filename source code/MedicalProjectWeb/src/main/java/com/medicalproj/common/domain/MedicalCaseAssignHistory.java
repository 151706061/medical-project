package com.medicalproj.common.domain;

import java.util.Date;

public class MedicalCaseAssignHistory {
    private Integer id;

    private Integer assignUserId;

    private Integer beAssignedUserId;

    private Date assignTime;

    private Integer medicalCaseId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAssignUserId() {
        return assignUserId;
    }

    public void setAssignUserId(Integer assignUserId) {
        this.assignUserId = assignUserId;
    }

    public Integer getBeAssignedUserId() {
        return beAssignedUserId;
    }

    public void setBeAssignedUserId(Integer beAssignedUserId) {
        this.beAssignedUserId = beAssignedUserId;
    }

    public Date getAssignTime() {
        return assignTime;
    }

    public void setAssignTime(Date assignTime) {
        this.assignTime = assignTime;
    }

    public Integer getMedicalCaseId() {
        return medicalCaseId;
    }

    public void setMedicalCaseId(Integer medicalCaseId) {
        this.medicalCaseId = medicalCaseId;
    }
}