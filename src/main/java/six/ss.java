package six;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.util.*;

/**
 * @author LY
 * @version 1.0
 * @date 2023/7/25 16:47
 */

public class ss {
    public static void main(String[] args) {
        DateTime date = DateUtil.date();
        String s="2023-4-3";
        String ss="2023-3-31";
        System.out.println(DateUtil.beginOfDay(date));
        System.out.println(DateUtil.endOfMonth(date));


    }
}

