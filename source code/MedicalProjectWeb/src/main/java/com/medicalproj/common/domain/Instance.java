package com.medicalproj.common.domain;

import java.util.Date;

public class Instance {
    private Integer id;

    private Integer seriesId;

    private String instanceNumber;

    private Integer dicomFileId;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public String getInstanceNumber() {
        return instanceNumber;
    }

    public void setInstanceNumber(String instanceNumber) {
        this.instanceNumber = instanceNumber == null ? null : instanceNumber.trim();
    }

    public Integer getDicomFileId() {
        return dicomFileId;
    }

    public void setDicomFileId(Integer dicomFileId) {
        this.dicomFileId = dicomFileId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}