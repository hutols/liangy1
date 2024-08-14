package six;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @author LY
 * @version 1.0
 * @date 2023/7/21 20:02
 */

public class year {
    public static void main(String[] args) {
        Date date = DateUtil.date();
        System.out.println(DateUtil.quarter(date));//季度
        System.out.println(DateUtil.year(date));//年份

        String year = Convert.toStr(DateUtil.year(date));//String类型年份
        String dates = year + "-12-31";
        System.out.println(dates);
        DateTime postDate = DateUtil.parse(dates, DatePattern.NORM_DATE_FORMAT);
        System.out.println(postDate);
        if (postDate.compareTo(new Date()) <= 0) {//年份小于等于当前时间
            System.out.println("大于");
        } else {
            System.out.println("小于");
        }
    }
}

