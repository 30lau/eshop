package com.lau.eshop.entity;

import java.util.Date;

public class MalOrd {
    private String malOrdId;

    private String useInfId;

    private String malProId;

    private Date malOrdTime;

    private Float malOrdPrice;

    private Integer malOrdCount;

    private Long malOrdTel;

    private String malOrdAddr;

    public String getMalOrdId() {
        return malOrdId;
    }

    public void setMalOrdId(String malOrdId) {
        this.malOrdId = malOrdId == null ? null : malOrdId.trim();
    }

    public String getUseInfId() {
        return useInfId;
    }

    public void setUseInfId(String useInfId) {
        this.useInfId = useInfId == null ? null : useInfId.trim();
    }

    public String getMalProId() {
        return malProId;
    }

    public void setMalProId(String malProId) {
        this.malProId = malProId == null ? null : malProId.trim();
    }

    public Date getMalOrdTime() {
        return malOrdTime;
    }

    public void setMalOrdTime(Date malOrdTime) {
        this.malOrdTime = malOrdTime;
    }

    public Float getMalOrdPrice() {
        return malOrdPrice;
    }

    public void setMalOrdPrice(Float malOrdPrice) {
        this.malOrdPrice = malOrdPrice;
    }

    public Integer getMalOrdCount() {
        return malOrdCount;
    }

    public void setMalOrdCount(Integer malOrdCount) {
        this.malOrdCount = malOrdCount;
    }

    public Long getMalOrdTel() {
        return malOrdTel;
    }

    public void setMalOrdTel(Long malOrdTel) {
        this.malOrdTel = malOrdTel;
    }

    public String getMalOrdAddr() {
        return malOrdAddr;
    }

    public void setMalOrdAddr(String malOrdAddr) {
        this.malOrdAddr = malOrdAddr == null ? null : malOrdAddr.trim();
    }

    @Override
    public String toString() {
        return "MalOrd{" +
                "malOrdId='" + malOrdId + '\'' +
                ", useInfId='" + useInfId + '\'' +
                ", malProId='" + malProId + '\'' +
                ", malOrdTime=" + malOrdTime +
                ", malOrdPrice=" + malOrdPrice +
                ", malOrdCount=" + malOrdCount +
                ", malOrdTel=" + malOrdTel +
                ", malOrdAddr='" + malOrdAddr + '\'' +
                '}';
    }
}