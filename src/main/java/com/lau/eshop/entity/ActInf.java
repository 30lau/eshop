package com.lau.eshop.entity;

public class ActInf {
    private String actInfId;

    private String admInfId;

    private String actInfName;

    private String actInfDescription;

    public String getActInfId() {
        return actInfId;
    }

    public void setActInfId(String actInfId) {
        this.actInfId = actInfId == null ? null : actInfId.trim();
    }

    public String getAdmInfId() {
        return admInfId;
    }

    public void setAdmInfId(String admInfId) {
        this.admInfId = admInfId == null ? null : admInfId.trim();
    }

    public String getActInfName() {
        return actInfName;
    }

    public void setActInfName(String actInfName) {
        this.actInfName = actInfName == null ? null : actInfName.trim();
    }

    public String getActInfDescription() {
        return actInfDescription;
    }

    public void setActInfDescription(String actInfDescription) {
        this.actInfDescription = actInfDescription == null ? null : actInfDescription.trim();
    }

    @Override
    public String toString() {
        return "ActInf{" +
                "actInfId='" + actInfId + '\'' +
                ", admInfId='" + admInfId + '\'' +
                ", actInfName='" + actInfName + '\'' +
                ", actInfDescription='" + actInfDescription + '\'' +
                '}';
    }
}