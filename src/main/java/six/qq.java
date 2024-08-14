package six;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author LY
 * @version 1.0
 * @date 2023/7/27 23:54
 */

public class qq {
    public static void main(String[] args) {
//        BigDecimal bigDecimal = new BigDecimal(3.21367);
//        BigDecimal bigDecimal1 = bigDecimal.setScale(4, BigDecimal.ROUND_HALF_UP);
//        System.out.println(bigDecimal1);
        BigDecimal b = new BigDecimal("3.335");
        b = b.setScale(3,BigDecimal.ROUND_HALF_UP);
        System.out.println(b);// 结果为： 3.34
    }
}

