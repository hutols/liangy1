package Hutool.DateUtil;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import cn.hutool.core.thread.ThreadUtil;

import java.util.Calendar;
import java.util.Date;

/**
 * @author LY
 * @version 1.0
 * @date 2023/10/17 11:12
 */

public class a {
    public static void main(String[] args) {
        TimeInterval timer = DateUtil.timer();
        //当前时间
        Date date = DateUtil.date();
//当前时间
        Date date2 = DateUtil.date(Calendar.getInstance());
//当前时间
        Date date3 = DateUtil.date(System.currentTimeMillis());
//当前时间字符串，格式：yyyy-MM-dd HH:mm:ss
        String now = DateUtil.now();
//当前日期字符串，格式：yyyy-MM-dd
        String today = DateUtil.today();
        ThreadUtil.sleep(800);
        System.out.println(date);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(now);
        System.out.println(today);
        System.out.println(timer.intervalMs());

    }
}

