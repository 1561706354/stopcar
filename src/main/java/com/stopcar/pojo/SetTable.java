package com.stopcar.pojo;

public class SetTable {
    private Integer setId;

    private String setName;

    private String setPwd;

    private Integer setPrice;

    private Long setMonth;

    private Long setYear;

    private String setType;

    private String setTime;

    @Override
    public String toString() {
        return "SetTable{" +
                "setId=" + setId +
                ", setName='" + setName + '\'' +
                ", setPwd='" + setPwd + '\'' +
                ", setPrice=" + setPrice +
                ", setMonth=" + setMonth +
                ", setYear=" + setYear +
                ", setType='" + setType + '\'' +
                ", setTime='" + setTime + '\'' +
                '}';
    }

    public Integer getSetId() {
        return setId;
    }

    public void setSetId(Integer setId) {
        this.setId = setId;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName == null ? null : setName.trim();
    }

    public String getSetPwd() {
        return setPwd;
    }

    public void setSetPwd(String setPwd) {
        this.setPwd = setPwd == null ? null : setPwd.trim();
    }

    public Integer getSetPrice() {
        return setPrice;
    }

    public void setSetPrice(Integer setPrice) {
        this.setPrice = setPrice;
    }

    public Long getSetMonth() {
        return setMonth;
    }

    public void setSetMonth(Long setMonth) {
        this.setMonth = setMonth;
    }

    public Long getSetYear() {
        return setYear;
    }

    public void setSetYear(Long setYear) {
        this.setYear = setYear;
    }

    public String getSetType() {
        return setType;
    }

    public void setSetType(String setType) {
        this.setType = setType == null ? null : setType.trim();
    }

    public String getSetTime() {
        return setTime;
    }

    public void setSetTime(String setTime) {
        this.setTime = setTime == null ? null : setTime.trim();
    }
}