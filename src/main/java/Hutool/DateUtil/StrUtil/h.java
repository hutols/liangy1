package Hutool.DateUtil.StrUtil;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import cn.hutool.core.lang.Console;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.ReflectUtil;
import cn.hutool.core.util.StrUtil;
import easyExcel.list1;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


/**
 * @author LY
 * @version 1.0
 * @date 2023/11/2 11:18
 */

public class h {
    public static void main(String[] args) {
        final TimeInterval timer = new TimeInterval();
        // 分组1
        timer.start("1");
        ThreadUtil.sleep(800);
        // 分组2
        timer.start("2");
        ThreadUtil.sleep(900);

        Console.log("Timer 1 took {}", timer.intervalPretty("1"));
        Console.log("Timer 2 took {}", timer.intervalPretty("2"));

       // int month = DateUtil.month();
        System.out.println();

        String s="sss.xls";
        String substring = StrUtil.removeSuffix(s,s.substring(s.indexOf(".")))+".xlsx";
        System.out.println(substring);
    }

//    private static void finds(Object list) {
//        String s="0";
//       s = DateUtil.timer().intervalPretty();
//        Field[] fields = ReflectUtil.getFields(list.getClass());
//        for (Field field : fields) {
//            System.out.println(field.getName());
//            Object name = ReflectUtil.getFieldValue(list,field.getName());
//            System.out.println(name);
//
//            s = DateUtil.timer().intervalPretty();
//            System.out.println(s);
//        }
//    }
}

