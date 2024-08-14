package six;

import java.math.BigDecimal;


public class BigDecimalExample {
    public static void main(String[] args) {
        // 创建两个BigDecimal对象
        BigDecimal a = new BigDecimal("0.9");
        BigDecimal b = new BigDecimal("10");


        // 相除求百分比
        BigDecimal percentage = a.divide(b, 4, BigDecimal.ROUND_HALF_UP)
                .multiply(BigDecimal.valueOf(100));
        if (percentage.compareTo(new BigDecimal(42))==1){
            System.out.println("ss");
        }else {
            System.out.println("aaa");
        }
        System.out.println("百分比: " + percentage + "%");

    }
}

