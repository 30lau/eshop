package com.lau.eshop.entity;

import java.util.Date;

public class SalOrd {
    private String salOrdId;

    private String salProId;

    private String useInfId;

    private Date salOrdTime;

    private Float salOrdPrice;

    private Integer salOrdCount;

    private Long salOrdTel;

    private String salOrdAddr;

    public String getSalOrdId() {
        return salOrdId;
    }

    public void setSalOrdId(String salOrdId) {
        this.salOrdId = salOrdId == null ? null : salOrdId.trim();
    }

    public String getSalProId() {
        return salProId;
    }

    public void setSalProId(String salProId) {
        this.salProId = salProId == null ? null : salProId.trim();
    }

    public String getUseInfId() {
        return useInfId;
    }

    public void setUseInfId(String useInfId) {
        this.useInfId = useInfId == null ? null : useInfId.trim();
    }

    public Date getSalOrdTime() {
        return salOrdTime;
    }

    public void setSalOrdTime(Date salOrdTime) {
        this.salOrdTime = salOrdTime;
    }

    public Float getSalOrdPrice() {
        return salOrdPrice;
    }

    public void setSalOrdPrice(Float salOrdPrice) {
        this.salOrdPrice = salOrdPrice;
    }

    public Integer getSalOrdCount() {
        return salOrdCount;
    }

    public void setSalOrdCount(Integer salOrdCount) {
        this.salOrdCount = salOrdCount;
    }

    public Long getSalOrdTel() {
        return salOrdTel;
    }

    public void setSalOrdTel(Long salOrdTel) {
        this.salOrdTel = salOrdTel;
    }

    public String getSalOrdAddr() {
        return salOrdAddr;
    }

    public void setSalOrdAddr(String salOrdAddr) {
        this.salOrdAddr = salOrdAddr == null ? null : salOrdAddr.trim();
    }

    @Override
    public String toString() {
        return "SalOrd{" +
                "salOrdId='" + salOrdId + '\'' +
                ", salProId='" + salProId + '\'' +
                ", useInfId='" + useInfId + '\'' +
                ", salOrdTime=" + salOrdTime +
                ", salOrdPrice=" + salOrdPrice +
                ", salOrdCount=" + salOrdCount +
                ", salOrdTel=" + salOrdTel +
                ", salOrdAddr='" + salOrdAddr + '\'' +
                '}';
    }
}