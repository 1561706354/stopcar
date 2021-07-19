package com.stopcar.pojo;

public class RecordTable {
    private Integer recordId;

    private String recordNum;

    private String recordGotime;

    private String recordLvtime;

    private String accessType;

    private Integer recordCost;

    private String carPort;

    private String recordStart;

    @Override
    public String toString() {
        return "RecordTable{" +
                "recordId=" + recordId +
                ", recordNum='" + recordNum + '\'' +
                ", recordGotime='" + recordGotime + '\'' +
                ", recordLvtime='" + recordLvtime + '\'' +
                ", accessType='" + accessType + '\'' +
                ", recordCost=" + recordCost +
                ", carPort='" + carPort + '\'' +
                ", recordStart='" + recordStart + '\'' +
                '}';
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getRecordNum() {
        return recordNum;
    }

    public void setRecordNum(String recordNum) {
        this.recordNum = recordNum == null ? null : recordNum.trim();
    }

    public String getRecordGotime() {
        return recordGotime;
    }


    public void setRecordGotime(String recordGotime) {
        this.recordGotime = recordGotime == null ? null : recordGotime.trim();
    }

    public String getRecordLvtime() {
        return recordLvtime;
    }

    public void setRecordLvtime(String recordLvtime) {
        this.recordLvtime = recordLvtime == null ? null : recordLvtime.trim();
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType == null ? null : accessType.trim();
    }

    public Integer getRecordCost() {
        return recordCost;
    }

    public void setRecordCost(Integer recordCost) {
        this.recordCost = recordCost;
    }

    public String getCarPort() {
        return carPort;
    }

    public void setCarPort(String carPort) {
        this.carPort = carPort == null ? null : carPort.trim();
    }

    public String getRecordStart() {
        return recordStart;
    }

    public void setRecordStart(String recordStart) {
        this.recordStart = recordStart == null ? null : recordStart.trim();
    }
}