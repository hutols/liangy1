package map;


import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author LY
 * @version 1.0
 * @date 2023/5/10 10:05
 */

public class Demo4 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(9626511.68);
        BigDecimal bigDecimal1 = new BigDecimal(23724788500.0000);
        BigDecimal divide = bigDecimal.divide(bigDecimal1, 6,BigDecimal.ROUND_HALF_EVEN).multiply(new BigDecimal(100));
        System.out.println(divide.setScale(4, BigDecimal.ROUND_HALF_UP));
        System.out.println(divide);
        System.out.println(Convert.toStr(bigDecimal1));
    }
}
