package com.stopcar.controller;

import com.stopcar.pojo.CarTable;
import com.stopcar.pojo.SetTable;
import com.stopcar.service.CarService;
import com.stopcar.service.Mytools;
import com.stopcar.service.RecordService;
import com.stopcar.service.SetService;
import jdk.nashorn.internal.ir.SetSplitState;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class SetController {
    @Autowired
    SetService service;
    @Autowired
    CarService carService;

    @RequestMapping("login")
    public String login() {

        return "login";
    }

    @RequestMapping("USER")
    public String USER() {
        return "USER";
    }


    @RequestMapping("logins")
    public String lonins(SetTable setTable, Model model, HttpSession session) {
        SetTable setTables = service.selectSet(setTable);
        if (setTables == null) {
            model.addAttribute("flg", "用户名或密码错误");
            return "login";

        } else {
            session.setAttribute("log", setTables);
            return "redirect:/index1";
        }

    }


    @RequestMapping("index1")
    public String index(Model model) {
        List<CarTable> carTables = carService.findstateCar1();
        if (carTables.size() == 0) {
            model.addAttribute("st", "车位已满");
        } else {
            model.addAttribute("state", carTables);
            model.addAttribute("port", carTables.size());
        }

        return "index";
    }

    @RequestMapping("updateSet")
    public String updateSet(SetTable setTable) {


        setTable.setSetTime(Mytools.isTime());
        service.updateSet(setTable);
        return "redirect:/findset";
    }


    @RequestMapping("findset")
    public String findset(Model model) {
        List<SetTable> list = service.findSet();
        model.addAttribute("money", list);
        return "settype";
    }


}
