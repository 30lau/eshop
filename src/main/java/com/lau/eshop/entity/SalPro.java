package com.lau.eshop.entity;

public class SalPro {
    private String salProId;

    private String salInfId;

    private String salProName;

    private Double salProPrice;

    public String getSalProId() {
        return salProId;
    }

    public void setSalProId(String salProId) {
        this.salProId = salProId == null ? null : salProId.trim();
    }

    public String getSalInfId() {
        return salInfId;
    }

    public void setSalInfId(String salInfId) {
        this.salInfId = salInfId == null ? null : salInfId.trim();
    }

    public String getSalProName() {
        return salProName;
    }

    public void setSalProName(String salProName) {
        this.salProName = salProName == null ? null : salProName.trim();
    }

    public Double getSalProPrice() {
        return salProPrice;
    }

    public void setSalProPrice(Double salProPrice) {
        this.salProPrice = salProPrice;
    }

    @Override
    public String toString() {
        return "SalPro{" +
                "salProId='" + salProId + '\'' +
                ", salInfId='" + salInfId + '\'' +
                ", salProName='" + salProName + '\'' +
                ", salProPrice=" + salProPrice +
                '}';
    }
}