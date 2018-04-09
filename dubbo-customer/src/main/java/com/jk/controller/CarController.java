package com.jk.controller;

import com.jk.entity.Car;
import com.jk.entity.RiZhi;
import com.jk.service.CarService;
import com.jk.util.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;

@RestController("app/rizhi")
public class CarController {
    @Resource
      private CarService carService;

    @RequestMapping("queryCar")
      public Car queryCar(){

      return carService.queryCarInfo("123");

}

    @GetMapping
    public String queryRiZhi(){

        System.out.println("---------");

        List<RiZhi> list = carService.queryRiZhi();

        return JSONUtil.toJson(list);
    }

    @DeleteMapping("{id}")
    public void deleteRiZhi(@PathVariable Integer id){
        System.out.println(id);
        carService.deleteRiZhi(id);
    }

    @PostMapping
    private void addrizhi(@RequestBody RiZhi riZhi){

        carService.addRiZhi(riZhi);
    }

    @RequestMapping("update")
    public void updaterizhi(@RequestBody RiZhi riZhi){
        System.out.println(riZhi);
        carService.updateRiZhi(riZhi);
    }


}
