package com.lau.eshop.entity;

public class UseInf {
    private String useInfId;

    private String useInfName;

    private String useInfPw;

    private String useInfSex;

    private Float useInfMoney;

    private String useInfRolename;

    public String getUseInfId() {
        return useInfId;
    }

    public void setUseInfId(String useInfId) {
        this.useInfId = useInfId == null ? null : useInfId.trim();
    }

    public String getUseInfName() {
        return useInfName;
    }

    public void setUseInfName(String useInfName) {
        this.useInfName = useInfName == null ? null : useInfName.trim();
    }

    public String getUseInfPw() {
        return useInfPw;
    }

    public void setUseInfPw(String useInfPw) {
        this.useInfPw = useInfPw == null ? null : useInfPw.trim();
    }

    public String getUseInfSex() {
        return useInfSex;
    }

    public void setUseInfSex(String useInfSex) {
        this.useInfSex = useInfSex == null ? null : useInfSex.trim();
    }

    public Float getUseInfMoney() {
        return useInfMoney;
    }

    public void setUseInfMoney(Float useInfMoney) {
        this.useInfMoney = useInfMoney;
    }

    public String getUseInfRolename() {
        return useInfRolename;
    }

    public void setUseInfRolename(String useInfRolename) {
        this.useInfRolename = useInfRolename == null ? null : useInfRolename.trim();
    }

    @Override
    public String toString() {
        return "UseInf{" +
                "useInfId='" + useInfId + '\'' +
                ", useInfName='" + useInfName + '\'' +
                ", useInfPw='" + useInfPw + '\'' +
                ", useInfSex='" + useInfSex + '\'' +
                ", useInfMoney=" + useInfMoney +
                ", useInfRolename='" + useInfRolename + '\'' +
                '}';
    }
}