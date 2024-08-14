package map;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdcardUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author LY
 * @version 1.0
 * @date 2023/5/5 10:10
 */

public class Demo2 {
    public static void main(String[] args) {
        DateTime date = DateUtil.date();
        //+1是加一天，-1是减一天，
        //日期加一天
        DateTime offDate = DateUtil.offsetDay(date, +1);
        System.out.println(date);   //2023-05-08 16:28:22
        System.out.println(offDate);//2023-05-09 16:28:22
        //日期加一个小时
        DateTime offDate1 = DateUtil.offsetHour(date, +1);
        System.out.println(date);    //2023-05-08 16:28:22
        System.out.println(offDate1);//2023-05-08 17:28:22
        //日期加一个月
        DateTime offDate2 = DateUtil.offsetMonth(date, +1);
        System.out.println(date);     //2023-05-08 16:29:51
        System.out.println(offDate2); //2023-06-08 16:29:51
        //日期加一分钟
        DateTime offDate3 = DateUtil.offsetMinute(date, +1);
        System.out.println(date);    //2023-05-08 16:29:51
        System.out.println(offDate3);//2023-05-08 16:30:51
        //日期加1000毫秒等于一秒
        DateTime offDate4 = DateUtil.offsetMillisecond(date, +1000);
        System.out.println(date);    //2023-05-08 16:29:51
        System.out.println(offDate4);//2023-05-08 16:29:51
        //日期加一秒
        DateTime offDate5 = DateUtil.offsetSecond(date, +1);
        System.out.println(date);    //2023-05-08 16:29:51
        System.out.println(offDate5);//2023-05-08 16:29:52
        //日期加一个星期
        DateTime offDate6 = DateUtil.offsetWeek(date, +1);
        System.out.println(date);    //2023-05-08 16:29:51
        System.out.println(offDate6);//2023-05-15 16:29:51
    }
}

