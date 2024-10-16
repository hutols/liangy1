package Hutool.DateUtil.StrUtil;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.IdcardUtil;
import cn.hutool.core.util.StrUtil;
import org.ehcache.core.util.CollectionUtil;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author LY
 * @version 1.0
 * @date 2024/9/26 14:42
 */

public class test {
    public static void main(String[] args) {
        String a = "11111";
        boolean b = a.chars().distinct().count() == 1;
        if (b) {
            System.out.println("只包含1位重复");
        } else {
            System.out.println("多位重复");
        }

        String input = "dhai11232da"; // 要统计的字符串

        // 使用 Stream 流统计数字的位数
        long digitCount = input.chars() // 将字符串转换为 IntStream
                .filter(Character::isDigit) // 过滤出数字
                .count(); // 统计数字的数量

        // 格式化输出结果
        System.out.printf("输入字符串:\"%s\" ", input);
        System.out.printf("数字的位数:%d ", digitCount);
        String as = "232";
        System.out.println(String.format("%s00", as));

    }

}

