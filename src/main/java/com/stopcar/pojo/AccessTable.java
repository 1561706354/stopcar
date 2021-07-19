package com.stopcar.pojo;

public class AccessTable {
    private Integer accessId;

    private String accessName;

    private String accessPhone;

    private String accessNum;

    private String accessColor;

    private String accessBrand;

    private String accessType;

    private String accessTime;

    private String accessOuttime;

    private String accessOutday;

    @Override
    public String toString() {
        return "AccessTable{" +
                "accessId=" + accessId +
                ", accessName='" + accessName + '\'' +
                ", accessPhone='" + accessPhone + '\'' +
                ", accessNum='" + accessNum + '\'' +
                ", accessColor='" + accessColor + '\'' +
                ", accessBrand='" + accessBrand + '\'' +
                ", accessType='" + accessType + '\'' +
                ", accessTime='" + accessTime + '\'' +
                ", accessOuttime='" + accessOuttime + '\'' +
                ", accessOutday='" + accessOutday + '\'' +
                '}';
    }

    public Integer getAccessId() {
        return accessId;
    }

    public void setAccessId(Integer accessId) {
        this.accessId = accessId;
    }

    public String getAccessName() {
        return accessName;
    }

    public void setAccessName(String accessName) {
        this.accessName = accessName == null ? null : accessName.trim();
    }

    public String getAccessPhone() {
        return accessPhone;
    }

    public void setAccessPhone(String accessPhone) {
        this.accessPhone = accessPhone == null ? null : accessPhone.trim();
    }

    public String getAccessNum() {
        return accessNum;
    }

    public void setAccessNum(String accessNum) {
        this.accessNum = accessNum == null ? null : accessNum.trim();
    }

    public String getAccessColor() {
        return accessColor;
    }

    public void setAccessColor(String accessColor) {
        this.accessColor = accessColor == null ? null : accessColor.trim();
    }

    public String getAccessBrand() {
        return accessBrand;
    }

    public void setAccessBrand(String accessBrand) {
        this.accessBrand = accessBrand == null ? null : accessBrand.trim();
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType == null ? null : accessType.trim();
    }

    public String getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(String accessTime) {
        this.accessTime = accessTime == null ? null : accessTime.trim();
    }

    public String getAccessOuttime() {
        return accessOuttime;
    }

    public void setAccessOuttime(String accessOuttime) {
        this.accessOuttime = accessOuttime == null ? null : accessOuttime.trim();
    }

    public String getAccessOutday() {
        return accessOutday;
    }

    public void setAccessOutday(String accessOutday) {
        this.accessOutday = accessOutday == null ? null : accessOutday.trim();
    }
}