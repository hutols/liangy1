package map;

import cn.hutool.captcha.CaptchaUtil;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @author LY
 * @version 1.0
 * @date 2023/9/13 10:47
 */

public class qianfengbi {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(522.1232);
        DecimalFormat format = new DecimalFormat("#,###.00");
        String format1 = format.format(bigDecimal);
        System.out.println(format1);

        BigDecimal sa = new BigDecimal(523652112.12320);
        DecimalFormat qw = new DecimalFormat("#.0000");
        String ss = qw.format(sa);
        System.out.println(ss);

    }
}

