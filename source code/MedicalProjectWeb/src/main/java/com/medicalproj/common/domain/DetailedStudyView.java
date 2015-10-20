package com.medicalproj.common.domain;

import java.util.Date;

public class DetailedStudyView {
    private Integer studyId;

    private Integer medicalCaseId;

    private String patientId;

    private String patientName;

    private String patientWeight;

    private Date patientBirthday;

    private String patientSex;

    private Integer medicalCaseStatus;

    private Integer creatorUserId;

    private String creatorUserName;

    private String creatorUserMobile;

    private String creatorUserEmail;

    private String createTime;

    private Date studyDate;

    private String diagnoseImagePerformance;

    private String diagnoseImageResult;

    private Integer diagnoseUserId;

    private String diagnoseUserName;

    private String diagnoseUserMobile;

    private String diagnoseUserEmail;

    private String diagnoseTime;

    private Integer reviewUserId;

    private String reviewUserName;

    private String reviewUserMobile;

    private String reviewUserEmail;

    private String reviewImagePerformance;

    private String reviewImageResult;

    private String reviewTime;

    private String modality;

    private String bodyPartExamined;

    private String studyDescription;

    private String studyStatus;

    public Integer getStudyId() {
        return studyId;
    }

    public void setStudyId(Integer studyId) {
        this.studyId = studyId;
    }

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

    public String getPatientWeight() {
        return patientWeight;
    }

    public void setPatientWeight(String patientWeight) {
        this.patientWeight = patientWeight == null ? null : patientWeight.trim();
    }

    public Date getPatientBirthday() {
        return patientBirthday;
    }

    public void setPatientBirthday(Date patientBirthday) {
        this.patientBirthday = patientBirthday;
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex == null ? null : patientSex.trim();
    }

    public Integer getMedicalCaseStatus() {
        return medicalCaseStatus;
    }

    public void setMedicalCaseStatus(Integer medicalCaseStatus) {
        this.medicalCaseStatus = medicalCaseStatus;
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

    public String getCreatorUserMobile() {
        return creatorUserMobile;
    }

    public void setCreatorUserMobile(String creatorUserMobile) {
        this.creatorUserMobile = creatorUserMobile == null ? null : creatorUserMobile.trim();
    }

    public String getCreatorUserEmail() {
        return creatorUserEmail;
    }

    public void setCreatorUserEmail(String creatorUserEmail) {
        this.creatorUserEmail = creatorUserEmail == null ? null : creatorUserEmail.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Date getStudyDate() {
        return studyDate;
    }

    public void setStudyDate(Date studyDate) {
        this.studyDate = studyDate;
    }

    public String getDiagnoseImagePerformance() {
        return diagnoseImagePerformance;
    }

    public void setDiagnoseImagePerformance(String diagnoseImagePerformance) {
        this.diagnoseImagePerformance = diagnoseImagePerformance == null ? null : diagnoseImagePerformance.trim();
    }

    public String getDiagnoseImageResult() {
        return diagnoseImageResult;
    }

    public void setDiagnoseImageResult(String diagnoseImageResult) {
        this.diagnoseImageResult = diagnoseImageResult == null ? null : diagnoseImageResult.trim();
    }

    public Integer getDiagnoseUserId() {
        return diagnoseUserId;
    }

    public void setDiagnoseUserId(Integer diagnoseUserId) {
        this.diagnoseUserId = diagnoseUserId;
    }

    public String getDiagnoseUserName() {
        return diagnoseUserName;
    }

    public void setDiagnoseUserName(String diagnoseUserName) {
        this.diagnoseUserName = diagnoseUserName == null ? null : diagnoseUserName.trim();
    }

    public String getDiagnoseUserMobile() {
        return diagnoseUserMobile;
    }

    public void setDiagnoseUserMobile(String diagnoseUserMobile) {
        this.diagnoseUserMobile = diagnoseUserMobile == null ? null : diagnoseUserMobile.trim();
    }

    public String getDiagnoseUserEmail() {
        return diagnoseUserEmail;
    }

    public void setDiagnoseUserEmail(String diagnoseUserEmail) {
        this.diagnoseUserEmail = diagnoseUserEmail == null ? null : diagnoseUserEmail.trim();
    }

    public String getDiagnoseTime() {
        return diagnoseTime;
    }

    public void setDiagnoseTime(String diagnoseTime) {
        this.diagnoseTime = diagnoseTime == null ? null : diagnoseTime.trim();
    }

    public Integer getReviewUserId() {
        return reviewUserId;
    }

    public void setReviewUserId(Integer reviewUserId) {
        this.reviewUserId = reviewUserId;
    }

    public String getReviewUserName() {
        return reviewUserName;
    }

    public void setReviewUserName(String reviewUserName) {
        this.reviewUserName = reviewUserName == null ? null : reviewUserName.trim();
    }

    public String getReviewUserMobile() {
        return reviewUserMobile;
    }

    public void setReviewUserMobile(String reviewUserMobile) {
        this.reviewUserMobile = reviewUserMobile == null ? null : reviewUserMobile.trim();
    }

    public String getReviewUserEmail() {
        return reviewUserEmail;
    }

    public void setReviewUserEmail(String reviewUserEmail) {
        this.reviewUserEmail = reviewUserEmail == null ? null : reviewUserEmail.trim();
    }

    public String getReviewImagePerformance() {
        return reviewImagePerformance;
    }

    public void setReviewImagePerformance(String reviewImagePerformance) {
        this.reviewImagePerformance = reviewImagePerformance == null ? null : reviewImagePerformance.trim();
    }

    public String getReviewImageResult() {
        return reviewImageResult;
    }

    public void setReviewImageResult(String reviewImageResult) {
        this.reviewImageResult = reviewImageResult == null ? null : reviewImageResult.trim();
    }

    public String getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(String reviewTime) {
        this.reviewTime = reviewTime == null ? null : reviewTime.trim();
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality == null ? null : modality.trim();
    }

    public String getBodyPartExamined() {
        return bodyPartExamined;
    }

    public void setBodyPartExamined(String bodyPartExamined) {
        this.bodyPartExamined = bodyPartExamined == null ? null : bodyPartExamined.trim();
    }

    public String getStudyDescription() {
        return studyDescription;
    }

    public void setStudyDescription(String studyDescription) {
        this.studyDescription = studyDescription == null ? null : studyDescription.trim();
    }

    public String getStudyStatus() {
        return studyStatus;
    }

    public void setStudyStatus(String studyStatus) {
        this.studyStatus = studyStatus == null ? null : studyStatus.trim();
    }
}