package com.stopcar.service;

import com.stopcar.mapper.CarTableMapper;
import com.stopcar.pojo.CarTable;
import com.stopcar.pojo.CarTableExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class CarService {
    @Autowired
    CarTableMapper mapper;

    //    添加车位
    public int insertCar(CarTable carTable) {
        return mapper.insertSelective(carTable);
    }

    //    修改车位状态
    public int updateCar(CarTable carTable) {
        return mapper.updateByPrimaryKeySelective(carTable);
    }

    //    查看所有车位
    public List<CarTable> findallCar() {
        return mapper.selectByExample(null);
    }

    //     通过车位模糊查看
    public List<CarTable> findportCar(CarTable carTable) {
        CarTableExample carTableExample = new CarTableExample();
        carTableExample.createCriteria().andCarPortLike("%" + carTable.getCarPort() + "%");
        return mapper.selectByExample(carTableExample);
    }

    //    通过车位查看
    public CarTable findnameCar(CarTable carTable) {
        CarTableExample carTableExample = new CarTableExample();
        carTableExample.createCriteria().andCarPortEqualTo(carTable.getCarPort());
        List<CarTable> carTableList = mapper.selectByExample(carTableExample);
        if (carTableList.isEmpty() || carTableList.size() == 0) {
            return null;
        } else {
            return carTableList.get(0);
        }


    }

//  查看当前可用车位及状态

    public List<CarTable> findstateCar(CarTable carTable) {
        CarTableExample carTableExample = new CarTableExample();
        carTableExample.createCriteria().andCarStateEqualTo(carTable.getCarState());
        return mapper.selectByExample(carTableExample);
    }

    public List<CarTable> findstateCar1() {
        CarTableExample carTableExample = new CarTableExample();
        carTableExample.createCriteria().andCarStateEqualTo("正常");
        return mapper.selectByExample(carTableExample);
    }

}
