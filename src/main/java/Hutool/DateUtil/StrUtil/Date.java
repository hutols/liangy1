package Hutool.DateUtil.StrUtil;

import cn.hutool.core.date.BetweenFormatter;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;

import static cn.hutool.core.date.DateUnit.*;

/**
 * @author LY
 * @version 1.0
 * @date 2024/7/30 9:48
 */

public class Date {
    public static void main(String[] args) {
        long seconds = DateUtil.currentSeconds();

        DateTime date = DateUtil.date(seconds *1000);
        System.out.println(date);

    }
}

