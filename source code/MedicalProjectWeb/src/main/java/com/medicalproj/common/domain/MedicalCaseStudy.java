package com.medicalproj.common.domain;

import java.util.Date;

public class MedicalCaseStudy {
    private Integer id;

    private String seriesNumber;

    private String instanceNumber;

    private String modality;

    private Date studyDate;

    private String bodyPartExamined;

    private String patientPosition;

    private Date acquisitionDatetime;

    private Integer medicalCaseId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(String seriesNumber) {
        this.seriesNumber = seriesNumber == null ? null : seriesNumber.trim();
    }

    public String getInstanceNumber() {
        return instanceNumber;
    }

    public void setInstanceNumber(String instanceNumber) {
        this.instanceNumber = instanceNumber == null ? null : instanceNumber.trim();
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality == null ? null : modality.trim();
    }

    public Date getStudyDate() {
        return studyDate;
    }

    public void setStudyDate(Date studyDate) {
        this.studyDate = studyDate;
    }

    public String getBodyPartExamined() {
        return bodyPartExamined;
    }

    public void setBodyPartExamined(String bodyPartExamined) {
        this.bodyPartExamined = bodyPartExamined == null ? null : bodyPartExamined.trim();
    }

    public String getPatientPosition() {
        return patientPosition;
    }

    public void setPatientPosition(String patientPosition) {
        this.patientPosition = patientPosition == null ? null : patientPosition.trim();
    }

    public Date getAcquisitionDatetime() {
        return acquisitionDatetime;
    }

    public void setAcquisitionDatetime(Date acquisitionDatetime) {
        this.acquisitionDatetime = acquisitionDatetime;
    }

    public Integer getMedicalCaseId() {
        return medicalCaseId;
    }

    public void setMedicalCaseId(Integer medicalCaseId) {
        this.medicalCaseId = medicalCaseId;
    }
}