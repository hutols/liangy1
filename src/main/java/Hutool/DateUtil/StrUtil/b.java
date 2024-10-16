package Hutool.DateUtil.StrUtil;

import cn.hutool.core.util.HexUtil;
import cn.hutool.core.util.StrUtil;

import java.util.Collections;

/**
 * @author LY
 * @version 1.0
 * @date 2023/10/19 10:39
 */

public class b {
    public static void main(String[] args) {
        String format = StrUtil.format("{:0>4}", 1);
        System.out.println(format);
        for (int i = 1; i <= 9999; i++) {
            // 使用Hutool的StrUtil.format方法格式化数字，补零到4位
            String formattedNumber = StrUtil.fillBefore(String.valueOf(i), '0', 4);
            System.out.println(formattedNumber);
            Collections.emptyList();
        }
    }
}

