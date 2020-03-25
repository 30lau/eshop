package com.lau.eshop.entity;

public class MalPro {
    private String malProId;

    private String malProName;

    private Integer malProCredit;

    public String getMalProId() {
        return malProId;
    }

    public void setMalProId(String malProId) {
        this.malProId = malProId == null ? null : malProId.trim();
    }

    public String getMalProName() {
        return malProName;
    }

    public void setMalProName(String malProName) {
        this.malProName = malProName == null ? null : malProName.trim();
    }

    public Integer getMalProCredit() {
        return malProCredit;
    }

    public void setMalProCredit(Integer malProCredit) {
        this.malProCredit = malProCredit;
    }

    @Override
    public String toString() {
        return "MalPro{" +
                "malProId='" + malProId + '\'' +
                ", malProName='" + malProName + '\'' +
                ", malProCredit=" + malProCredit +
                '}';
    }
}