package com.lau.eshop.entity;

public class AdvInf {
    private String advInfId;

    private String admInfId;

    private String advInfName;

    private String advInfDescription;

    public String getAdvInfId() {
        return advInfId;
    }

    public void setAdvInfId(String advInfId) {
        this.advInfId = advInfId == null ? null : advInfId.trim();
    }

    public String getAdmInfId() {
        return admInfId;
    }

    public void setAdmInfId(String admInfId) {
        this.admInfId = admInfId == null ? null : admInfId.trim();
    }

    public String getAdvInfName() {
        return advInfName;
    }

    public void setAdvInfName(String advInfName) {
        this.advInfName = advInfName == null ? null : advInfName.trim();
    }

    public String getAdvInfDescription() {
        return advInfDescription;
    }

    public void setAdvInfDescription(String advInfDescription) {
        this.advInfDescription = advInfDescription == null ? null : advInfDescription.trim();
    }

    @Override
    public String toString() {
        return "AdvInf{" +
                "advInfId='" + advInfId + '\'' +
                ", admInfId='" + admInfId + '\'' +
                ", advInfName='" + advInfName + '\'' +
                ", advInfDescription='" + advInfDescription + '\'' +
                '}';
    }
}