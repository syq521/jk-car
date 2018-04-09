package com.jk.entity;


import java.io.Serializable;

public class Car implements Serializable{

    private static final long serialVersionUID = 3819834880351107702L;
    private String carId;
    private String carName;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }


    @Override
    public String toString() {
        return "Car{" +
                "carId='" + carId + '\'' +
                ", carName='" + carName + '\'' +
                '}';
    }
}
