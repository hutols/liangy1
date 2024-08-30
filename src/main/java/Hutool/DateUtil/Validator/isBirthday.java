package Hutool.DateUtil.Validator;

import cn.hutool.core.lang.Validator;

/**
 * @author LY
 * @version 1.0
 * @date 2024/8/29 15:01
 */

public class isBirthday {
    public static void main(String[] args) {
        String s = "2000-12-311";
        boolean birthday = Validator.isBirthday(s);//是否为生日格式
        if (birthday) {
            System.out.println("是");
        }
        if (Validator.hasChinese("s啊")) {//是否包含中文
            System.out.println("1");
        }

        Validator.validateEmail("chenl421hkbea.com1", "错误信息");

    }
}

