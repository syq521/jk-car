package com.jk.service;

import com.jk.entity.Car;
import com.jk.entity.RiZhi;

import java.util.List;

public interface CarService {

    Car queryCarInfo(String carId);



    List<RiZhi> queryRiZhi();

    void deleteRiZhi(Integer id);

    void addRiZhi(RiZhi riZhi);

    void updateRiZhi(RiZhi riZhi);

}
