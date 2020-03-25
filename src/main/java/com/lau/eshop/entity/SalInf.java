package com.lau.eshop.entity;

public class SalInf {
    private String salInfId;

    private String salInfName;

    private String salInfDescription;

    private String salInfPw;

    public String getSalInfId() {
        return salInfId;
    }

    public void setSalInfId(String salInfId) {
        this.salInfId = salInfId == null ? null : salInfId.trim();
    }

    public String getSalInfName() {
        return salInfName;
    }

    public void setSalInfName(String salInfName) {
        this.salInfName = salInfName == null ? null : salInfName.trim();
    }

    public String getSalInfDescription() {
        return salInfDescription;
    }

    public void setSalInfDescription(String salInfDescription) {
        this.salInfDescription = salInfDescription == null ? null : salInfDescription.trim();
    }

    public String getSalInfPw() {
        return salInfPw;
    }

    public void setSalInfPw(String salInfPw) {
        this.salInfPw = salInfPw == null ? null : salInfPw.trim();

    }

    @Override
    public String toString() {
        return "SalInf{" +
                "salInfId='" + salInfId + '\'' +
                ", salInfName='" + salInfName + '\'' +
                ", salInfDescription='" + salInfDescription + '\'' +
                ", salInfPw='" + salInfPw + '\'' +
                '}';
    }
}