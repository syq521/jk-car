package com.jk.service;

import com.jk.entity.Car;
import com.jk.entity.RiZhi;
import com.jk.mapper.RiZhiMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("carService")
public class CarServiceImpl implements CarService {

    @Resource
    private RiZhiMapper riZhiMapper;

    @Override
    public Car queryCarInfo(String carId) {
        System.out.println("carId = [" + carId + "]");
       Car  car= new Car();
       car.setCarId(carId);
       car.setCarName("兰博基尼");
        return car;
    }

    @Override
    public List<RiZhi> queryRiZhi() {
        List<RiZhi> list = riZhiMapper.queryRiZhi();

        return list;
    }

    @Override
    public void deleteRiZhi(Integer id) {

        riZhiMapper.deleteRiZhi(id);
    }

    @Override
    public void addRiZhi(RiZhi riZhi) {

        riZhiMapper.addRiZhi(riZhi);
    }

    @Override
    public void updateRiZhi(RiZhi riZhi) {

        riZhiMapper.updateRiZhi(riZhi);
    }
}
