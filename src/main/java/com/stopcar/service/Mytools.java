package com.stopcar.service;

import com.stopcar.pojo.SetTable;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Mytools {

    //获得当前时间
    public static String isTime() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String formate = simpleDateFormat.format(date);
        return formate;
    }


//      获取两个时间的时间差，精确到毫秒
//      @param str
//     @return

    public static String timesub(String start, String end) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date d1 = df.parse(start);
        Date d2 = df.parse(end);
        long nd = 1000 * 24 * 60 * 60;
        long nh = 1000 * 60 * 60;
        long nm = 1000 * 60;
        long ns = 1000;
        // 获得两个时间的毫秒时间差异
        long diff = d2.getTime() - d1.getTime();
        // 计算差多少天
        long day = diff / nd;
        // 计算差多少小时
        long hour = diff % nd / nh;
        // 计算差多少分钟
        long min = diff % nd % nh / nm;
        // 计算差多少秒//输出结果
        long sec = diff % nd % nh % nm / ns;


        String times = day + "," + hour + "," + min + "," + sec;
        return times;

    }


    //    在原基础上修改年时间
    public static String timeyearadd(String time, int i) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = format.parse(time);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, i);
        Date timeadd = calendar.getTime();
        String yearadd = format.format(timeadd);
        return yearadd;
    }

    //月
    public static String timemonthadd(String time, int i) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = format.parse(time);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, i);
        Date timeadd = calendar.getTime();
        String monthadd = format.format(timeadd);
        return monthadd;
    }

//    年月


}
