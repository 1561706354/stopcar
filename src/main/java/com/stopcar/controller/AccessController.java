package com.stopcar.controller;

import com.stopcar.pojo.AccessTable;
import com.stopcar.service.AccessService;
import com.stopcar.service.Mytools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class AccessController {

    @Autowired
    AccessService service;


    @RequestMapping("accessinsert")
    public String accessinsert() {
        return "accessinsert";
    }

    @RequestMapping("insertAss")
    public String insertAss(AccessTable accessTable, Model model) throws ParseException {
        AccessTable accessTables = service.finnumAss(accessTable);
        if (accessTables == null) {
            accessTable.setAccessTime(Mytools.isTime());

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String outtime = Mytools.isTime();
            Date date = format.parse(outtime);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            if (accessTable.getAccessType().equals("年卡")) {
                calendar.add(Calendar.YEAR, 1);
                Date outtime1 = calendar.getTime();
                String dte = format.format(outtime1);
                accessTable.setAccessOuttime(dte);


            } else if (accessTable.getAccessType().equals("季卡")) {
                calendar.add(Calendar.MONTH, 3);
                Date outtime1 = calendar.getTime();
                String dte = format.format(outtime1);
                accessTable.setAccessOuttime(dte);


            } else if (accessTable.getAccessType().equals("月卡")) {
                calendar.add(Calendar.MONTH, 1);
                Date outtime1 = calendar.getTime();
                String dte = format.format(outtime1);
                accessTable.setAccessOuttime(dte);


            } else {
                accessTable.setAccessOuttime("无");
            }


//                accessTable.setAccessOuttime();
            service.insertAcccess(accessTable);
        } else {

            model.addAttribute("ass1", "车牌号重复");
        }

        return "redirect:/findAss";
    }

    //    查看type
    @RequestMapping("findtypeAss")
    public String findtypeAss(AccessTable accessTable, Model model) {
        List<AccessTable> accessTable1 = service.findtypeAss(accessTable);
        model.addAttribute("find", accessTable1);
        return "accessinsert";
    }

    //    模糊查询
    @RequestMapping("findnumAss")
    public String findnumAss(AccessTable accessTable, Model model) {
        List<AccessTable> accessTables = service.findnumAss(accessTable);
        model.addAttribute("find", accessTables);
        return "accessinsert";
    }

    //    查看所有Vip
    @RequestMapping("findAss")
    public String findAss(Model model) throws ParseException {
        List<AccessTable> accessTables = service.findAss();
        model.addAttribute("find", accessTables);
        return "accessinsert";
    }

    //    删除
    @RequestMapping("deleteAss")
    public String deleteAss(AccessTable accessTable) {
        service.deleteAss(accessTable);

        return "redirect:/findAss";

    }

    @RequestMapping("accessupdate")
    public String accessupdate() {
        return "accessupdate";
    }

    //   续费 修改
    @RequestMapping("updateAss")
    public String updateAss(AccessTable accessTable, Model model, HttpSession session) throws ParseException {
//        遍历VIP表
        String outtime;
        List<AccessTable> accessTables = service.findAss();
        if (accessTables.isEmpty() || accessTables.size() == 0) {
            model.addAttribute("assfind", "暂无数据");
        } else {
            for (AccessTable accessTable1 : accessTables) {
                if (accessTable1.getAccessNum().equals(accessTable.getAccessNum())) {
                    int accessID = accessTable1.getAccessId();

                    System.out.println(accessID);
                    System.out.println(accessTable);
                    int aa=0;
                    if (accessTable.getAccessType().equals("年卡")) {
                        aa++;
                       session.setAttribute("yea",aa++);
                        outtime = Mytools.timeyearadd(accessTable1.getAccessOuttime(), 1);
                        accessTable.setAccessOuttime(outtime);
                    } else if (accessTable.getAccessType().equals("季卡")) {
                        aa++;
                        session.setAttribute("jkk",aa++);
                        outtime = Mytools.timemonthadd(accessTable1.getAccessOuttime(), 3);
                        accessTable.setAccessOuttime(outtime);
                    } else if (accessTable.getAccessType().equals("月卡")) {
                        aa++;
                        session.setAttribute("mon",aa++);
                        outtime = Mytools.timemonthadd(accessTable1.getAccessOuttime(), 1);
                        accessTable.setAccessOuttime(outtime);
                    }
                    accessTable.setAccessId(accessID);
                    service.updateAsss(accessTable);
                } else {
                    model.addAttribute("acc", "请检查输入车牌号是否正确");
                }

            }
        }

        return "redirect:/findAss";
    }

    @RequestMapping("updateAsss")
    public String updateAsss(AccessTable accessTable) {
        service.updateAsss(accessTable);
        return "redirect:/findAss";
    }
}
