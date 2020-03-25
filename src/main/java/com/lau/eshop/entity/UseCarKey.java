package com.lau.eshop.entity;

public class UseCarKey {
    private String salProId;

    private String useInfId;

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

    @Override
    public String toString() {
        return "UseCarKey{" +
                "salProId='" + salProId + '\'' +
                ", useInfId='" + useInfId + '\'' +
                '}';
    }
}