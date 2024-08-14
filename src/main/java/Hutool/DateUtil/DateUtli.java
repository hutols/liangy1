package Hutool.DateUtil;


import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.util.Date;


public class DateUtli {
    public static void main(String[] args) {
        Date date = new Date();
        int year = DateUtil.year(date);//年份
        String month = "01";//月份

        //yyyyMM----->yyyyMMdd
        String yearMonth = year + month + "01";//year可写死，月份第一天
        DateTime dateTime = DateUtil.parse(yearMonth,DatePattern.PURE_DATE_PATTERN);//转为Date类型
        DateTime ofMonth = DateUtil.endOfMonth(dateTime);//获取月份最后一天（带时分秒）
        DateTime truncate = DateUtil.truncate(ofMonth, DateField.DAY_OF_MONTH);//去时分秒

        System.out.println(dateTime);//转为Date类型
        System.out.println(ofMonth);//月份最后一天（带时分秒）
        System.out.println(truncate);//月份最后一天（去时分秒）

    }

}

