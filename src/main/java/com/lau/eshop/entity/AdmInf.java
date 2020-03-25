package com.lau.eshop.entity;

public class AdmInf {
    private String admInfId;

    private String admInfName;

    private String admInfSex;

    private String admInfRole;

    private String admInfPw;

    public String getAdmInfId() {
        return admInfId;
    }

    public void setAdmInfId(String admInfId) {
        this.admInfId = admInfId == null ? null : admInfId.trim();
    }

    public String getAdmInfName() {
        return admInfName;
    }

    public void setAdmInfName(String admInfName) {
        this.admInfName = admInfName == null ? null : admInfName.trim();
    }

    public String getAdmInfSex() {
        return admInfSex;
    }

    public void setAdmInfSex(String admInfSex) {
        this.admInfSex = admInfSex == null ? null : admInfSex.trim();
    }

    public String getAdmInfRole() {
        return admInfRole;
    }

    public void setAdmInfRole(String admInfRole) {
        this.admInfRole = admInfRole == null ? null : admInfRole.trim();
    }

    public String getAdmInfPw() {
        return admInfPw;
    }

    public void setAdmInfPw(String admInfPw) {
        this.admInfPw = admInfPw == null ? null : admInfPw.trim();
    }

    @Override
    public String toString() {
        return "AdmInf{" +
                "admInfId='" + admInfId + '\'' +
                ", admInfName='" + admInfName + '\'' +
                ", admInfSex='" + admInfSex + '\'' +
                ", admInfRole='" + admInfRole + '\'' +
                ", admInfPw='" + admInfPw + '\'' +
                '}';
    }
}