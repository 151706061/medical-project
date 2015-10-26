package com.medicalproj.common.domain;

import java.util.Date;

public class QualificationApplication {
    private Integer id;

    private Date applyTime;

    private Integer applyUserId;

    private Integer yszgzImgId;

    private Integer reviewUserId;

    private String reviewText;

    private Date reviewTime;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Integer getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(Integer applyUserId) {
        this.applyUserId = applyUserId;
    }

    public Integer getYszgzImgId() {
        return yszgzImgId;
    }

    public void setYszgzImgId(Integer yszgzImgId) {
        this.yszgzImgId = yszgzImgId;
    }

    public Integer getReviewUserId() {
        return reviewUserId;
    }

    public void setReviewUserId(Integer reviewUserId) {
        this.reviewUserId = reviewUserId;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText == null ? null : reviewText.trim();
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}