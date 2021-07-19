package com.stopcar.controller;

import com.stopcar.pojo.CarTable;
import com.stopcar.service.CarService;
import com.stopcar.service.Mytools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    CarService service;


//    @RequestMapping("carinsert1")
//    public String carinsert1(){
//        return "carinsert";
//    }

    @RequestMapping("insertCar")
    public String insertCar(CarTable carTable, Model model, HttpSession session) {

        carTable.setCarTime(Mytools.isTime());
        carTable.setCarState("正常");

        List<CarTable> carTables = service.findallCar();
        for (CarTable carTable1 : carTables
        ) {
            if (carTable1.getCarPort().equals(carTable.getCarPort())) {
                model.addAttribute("fla", "该车位重复,请检查");
                return "carinsert";
            }
        }
        service.insertCar(carTable);
        return "redirect:/findallCar";
    }


    @RequestMapping("updateCar")
    public String updateCar(CarTable carTable) {
        if (carTable.getCarState().equals("正常")) {
            carTable.setCarState("维修中");
        } else {
            carTable.setCarState("正常");
        }
        carTable.setCarTime(Mytools.isTime());
        service.updateCar(carTable);
        return "redirect:/findallCar";
    }

    @RequestMapping("findallCar")
    public String findallCar(Model model, HttpSession session) {
        List<CarTable> carTables = service.findallCar();
        model.addAttribute("carall", carTables);
        session.setAttribute("caralls", carTables);
        return "carinsert";
    }

    @RequestMapping("findportCar")
    public String findportCar(CarTable carTable, Model model) {
        List<CarTable> carTableList = service.findportCar(carTable);
        System.out.println(carTableList);
        model.addAttribute("carall", carTableList);
        return "carinsert";
    }


    @RequestMapping("findnameCar")
    public String findnameCar(CarTable carTable, Model model, HttpSession session) {
        List<CarTable> carTables = (List<CarTable>) service.findnameCar(carTable);
        session.setAttribute("car1", carTables);
        model.addAttribute("carname", carTables);
        return "";
    }
}
