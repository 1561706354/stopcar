package com.stopcar.controller;

import com.stopcar.chepai.Chepai1;
import com.stopcar.pojo.AccessTable;
import com.stopcar.pojo.CarTable;
import com.stopcar.pojo.RecordTable;
import com.stopcar.pojo.SetTable;
import com.stopcar.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Controller
public class RecordController {

    @Autowired
    RecordService service;
    @Autowired
    CarService carService;
    @Autowired
    AccessService accessService;
    @Autowired
    SetService setService;

    //停车 管理员界面
    @RequestMapping("insertRed")
    public String insertRed(@RequestParam(value = "file", required = false)
                                    MultipartFile file, RecordTable recordTable, Model model) throws IOException {
        List<SetTable> setTables = setService.findSet();
        SetTable setTable = setTables.get(0);
        if (setTable.getSetType().equals("开启")) {
//        图片上传成功后，将图片的地址写到数据库
//        保存图片的路径
            String filePath = "/home/img";
//获取原始图片的扩展名
            String carFilename = file.getOriginalFilename();
//        新的文件名字
            String newFilename = UUID.randomUUID() + carFilename;
//        封装上传文件到封装上传文件位置的全路径

            File targetFile = new File(filePath, newFilename);
//        把本地文件上传到封装上传文件位置的全路径
            file.transferTo(targetFile);

            String caryu = Chepai1.licensePlate(targetFile.getAbsolutePath());

            recordTable.setRecordNum(caryu);
            System.out.println(recordTable.getRecordNum());
            if (caryu != null) {
                recordTable.setRecordNum(caryu);
            } else {
                recordTable.getRecordNum();
            }


            List<CarTable> carTables = carService.findstateCar1();

            AccessTable accessTable = new AccessTable();
            accessTable.setAccessNum(recordTable.getRecordNum());
            AccessTable accessTable1 = accessService.finnumAss(accessTable);
            System.out.println(accessTable.toString());

            RecordTable recordTable1 = new RecordTable();
            recordTable1.setRecordNum(recordTable.getRecordNum());
            recordTable1.setRecordStart("已停车");
            System.out.println(recordTable1);
            RecordTable recordTables = service.findnsRed(recordTable1);
//        System.out.println(recordTables.toString());
            if (recordTables != null) {
                model.addAttribute("int", "该车辆已停车");
            } else {
//                  Random random = new Random();
//                  int num = (int) Math.round(Math.random() * 100);
//                  if (carTables.size() != 0) {
//                      if (num >= carTables.size()) {
////                          insertRed(file, recordTable, model);
//                      } else {

                carTables.get(0).setCarState("已停车");
                carTables.get(0).setCarTime(Mytools.isTime());
                carService.updateCar(carTables.get(0));
                recordTable.setCarPort(carTables.get(0).getCarPort());
                recordTable.setRecordStart("已停车");

                if (accessTable1 == null) {
                    recordTable.setAccessType("普通");

                } else {
                    recordTable.setAccessType(accessTable1.getAccessType());
                }
                recordTable.setRecordGotime(Mytools.isTime());
                recordTable.setRecordCost(0);
                service.insertRed(recordTable);
            }

//                  }
//              }
        } else {
            model.addAttribute("off", "停车场维护中");
        }
        return "redirect:/findred";
    }

    //查找可用车位
    @RequestMapping("findred")
    public String findred(Model model, HttpSession session) {
        List<CarTable> carTables = carService.findstateCar1();
        if (carTables.size() == 0) {
            model.addAttribute("st", "车位已满");
        } else {
            model.addAttribute("state", carTables);
            model.addAttribute("port", carTables.size());
        }
        SetTable setTable = (SetTable) session.getAttribute("log");
        if (setTable == null) {
            return "USER";
        } else {
            return "index";
        }


    }

    //    取车
    @RequestMapping("updateRed")
    public String updateRed(@RequestParam(value = "file", required = false) MultipartFile file, RecordTable recordTable, Model model, HttpSession session) throws ParseException, IOException {
//       查询通过车牌，状态判断该车辆是否已存在
//        如果null 车不存在
//        else    车存在

        //        图片上传成功后，将图片的地址写到数据库
//        保存图片的路径
        String filePath = "/home/img";
//获取原始图片的扩展名
        String carFilename = file.getOriginalFilename();
//        新的文件名字
        String newFilename = UUID.randomUUID() + carFilename;
//        封装上传文件到封装上传文件位置的全路径
        File targetFile = new File(filePath, newFilename);
//        把本地文件上传到封装上传文件位置的全路径
        file.transferTo(targetFile);

        String caryu = Chepai1.licensePlate(targetFile.getAbsolutePath());
        if (caryu != null) {
            recordTable.setRecordNum(caryu);
        } else {
            recordTable.getRecordNum();
        }

        RecordTable recordTable1 = new RecordTable();

        recordTable1.setRecordNum(recordTable.getRecordNum());
        recordTable1.setRecordStart("已停车");
        RecordTable recordTable2 = service.findnsRed(recordTable1);
        if (recordTable2 == null) {
            model.addAttribute("out1", "请检查车牌号是否正确");
        } else {
//            车位改为正常
            CarTable carTable = new CarTable();
            carTable.setCarPort(recordTable2.getCarPort());
            CarTable carTable1 = carService.findnameCar(carTable);
            CarTable carTable2 = new CarTable();
            carTable2.setCarId(carTable1.getCarId());
            carTable2.setCarState("正常");
            carService.updateCar(carTable2);
//            判断会员与普通用户
            recordTable.setRecordId(recordTable2.getRecordId());
            recordTable.setRecordLvtime(Mytools.isTime());
//            遍历获得管理员信息
            List<SetTable> setTables = setService.findSet();
            for (SetTable settable : setTables
            ) {
                if (("管理员").equals(settable.getSetName())) {
                    int price = settable.getSetPrice();
                    System.out.println(price);


                    if (recordTable2.getAccessType().equals("普通")) {

                        System.out.println(recordTable2.getAccessType() + "==" + Mytools.isTime());
//                费用
                        String tim = Mytools.timesub(recordTable2.getRecordGotime(), Mytools.isTime());
                        System.out.println(tim);
                        String[] tims = tim.split(",");
                        int day = Integer.valueOf(tims[0]);
                        int hour = Integer.valueOf(tims[1]);
                        int min = Integer.valueOf(tims[2]);
//                System.out.println(setTable.getSetPrice());
                        if (min >= 30 && hour >= 0) {

                            recordTable.setRecordCost(((day * 24) + hour + 1) * price);
                        } else {
                            recordTable.setRecordCost(((day * 24) + hour) * price);
                        }

                        System.out.println(day + "==" + hour + "==" + min);
                        System.out.println((day * 24 + hour) * price);

                    } else {

//                费用
                        recordTable.setRecordCost(0);
                    }
                    recordTable.setRecordLvtime(Mytools.isTime());
                    recordTable.setRecordStart("未停车");
                    service.updateRed(recordTable);
                }
            }


            List<AccessTable> accessTables = accessService.findAss();
            if (accessTables.isEmpty() || accessTables.size() == 0) {
                model.addAttribute("assfind", "暂无数据");
            } else {
                for (AccessTable accessTable1 : accessTables
                ) {
                    if (accessTable1.getAccessNum().equals(recordTable.getRecordNum())) {
                        String outday = Mytools.timesub(Mytools.isTime(), accessTable1.getAccessOuttime());
                        String[] tine = outday.split(",");
                        int day = Integer.valueOf(tine[0]);
                        int hours = Integer.valueOf(tine[1]);
                        AccessTable accessTable = new AccessTable();
                        accessTable.setAccessId(accessTable1.getAccessId());
                        if (day >= 0 && hours > 0) {
                            int day1 = day + 1;
                            String outday1 = String.valueOf(day1);

                            accessTable.setAccessOutday(outday1);
                        } else {
                            accessTable.setAccessOutday("0");
                        }
                        model.addAttribute("find", accessTable.getAccessOutday());
                        accessService.updateAsss(accessTable);

                    }
                }
            }
        }
        return "redirect:/findred";
    }

    //    查看记录
    @RequestMapping("findeed")
    public String findRed1(Model model) {
        List<RecordTable> recordTables = service.findRed();

        model.addAttribute("findredd", recordTables);
        return "redfind";
    }

    @RequestMapping("findmohu")
    public String findmohu(RecordTable recordTable, Model model) {
        List<RecordTable> recordTables = service.findnumRed(recordTable);
        model.addAttribute("findredd", recordTables);
        return "redfind";
    }

    @RequestMapping("sumRed1")
    public String sumred(Model model,HttpSession session) {
        int a = service.sumRed();



        List<SetTable> setTables = setService.findSet();
        SetTable setTable = setTables.get(0);
        String year = String.valueOf(setTable.getSetYear());
        int years = Integer.valueOf(year);
        String month = String.valueOf(setTable.getSetMonth());
        int months = Integer.valueOf(month);
        AccessTable accessTable = new AccessTable();
        accessTable.setAccessType("年卡");

        List<AccessTable> accessTables = accessService.findtypeAss(accessTable);
            int yyy=0;
        if( session.getAttribute("yea")!=null) {
             yyy = (int) session.getAttribute("yea");
            System.out.println(session.getAttribute("yea"));
            System.out.println(yyy);
        }else if(session.getAttribute("jkk")!=null){
            yyy = (int) session.getAttribute("jkk");
        }else if(session.getAttribute("mon")!=null){
            yyy = (int) session.getAttribute("mon");
        }

            int cc = accessTables.size();
            int yy = (cc+yyy) * years;
            model.addAttribute("ccyear", cc);
            model.addAttribute("yyear", yy);
            AccessTable accessTable1 = new AccessTable();
            accessTable1.setAccessType("季卡");
            List<AccessTable> accessTables1 = accessService.findtypeAss(accessTable1);
            int cc1 = accessTables1.size();
            int jj1 = (int) ((cc1+yyy) * months * 0.8);
            model.addAttribute("cc1num", cc1);
            model.addAttribute("jika", jj1);
            AccessTable accessTable2 = new AccessTable();
            accessTable2.setAccessType("月卡");
            List<AccessTable> accessTables2 = accessService.findtypeAss(accessTable2);
            int cc2 = accessTables2.size();
            int mm1 = (cc2+yyy) * months;
            model.addAttribute("yuenum", cc2);
            model.addAttribute("yueka", mm1);
            AccessTable accessTable3 = new AccessTable();
            accessTable3.setAccessType("免费");
            List<AccessTable> accessTables3 = accessService.findtypeAss(accessTable3);
            int cc3 = accessTables3.size();
            System.out.println(cc3);
            model.addAttribute("free", cc3);

            model.addAttribute("sumR", a);

            int addcose = yy + jj1 + mm1;
            model.addAttribute("heji", addcose);
            int renshu = cc + cc1 + cc2 + cc3;
            model.addAttribute("num", renshu);
        return "redcose";
    }


}
