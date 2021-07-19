package com.stopcar.pojo;

public class CarTable {
    private Integer carId;

    private String carPort;

    private String carState;

    private String carTime;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getCarPort() {
        return carPort;
    }

    public void setCarPort(String carPort) {
        this.carPort = carPort == null ? null : carPort.trim();
    }

    public String getCarState() {
        return carState;
    }

    public void setCarState(String carState) {
        this.carState = carState == null ? null : carState.trim();
    }

    public String getCarTime() {
        return carTime;
    }

    public void setCarTime(String carTime) {
        this.carTime = carTime == null ? null : carTime.trim();
    }
}