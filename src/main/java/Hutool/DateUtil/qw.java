package Hutool.DateUtil;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.Month;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author LY
 * @version 1.0
 * @date 2023/10/12 17:45
 */

public class qw {
    public static void main(String[] args) {
//        String s = "20230117";
//        DateTime parse = DateUtil.parse(s, DatePattern.PURE_DATE_PATTERN);
//        int i = DateUtil.month(parse) + 1;
//        System.out.println(i);
//        DateTime dateTime = DateUtil.endOfMonth(parse);
//        System.out.println(dateTime);
        DateTime date = DateUtil.date();
        int year = DateUtil.year(date);
        String s =   "2024-02-01";
        DateTime dateTime = DateUtil.endOfMonth(DateUtil.parse(s));
        String today = DateUtil.today();
        System.out.println(today);
        System.out.println(dateTime);
       // System.out.println(date1);

    }
}

