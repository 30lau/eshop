package com.lau.eshop.entity;

public class AdmChk {
    private String salInfId;

    private String admChkModule;

    public String getSalInfId() {
        return salInfId;
    }

    public void setSalInfId(String salInfId) {
        this.salInfId = salInfId == null ? null : salInfId.trim();
    }

    public String getAdmChkModule() {
        return admChkModule;
    }

    public void setAdmChkModule(String admChkModule) {
        this.admChkModule = admChkModule == null ? null : admChkModule.trim();
    }

    @Override
    public String toString() {
        return "AdmChk{" +
                "salInfId='" + salInfId + '\'' +
                ", admChkModule='" + admChkModule + '\'' +
                '}';
    }
}