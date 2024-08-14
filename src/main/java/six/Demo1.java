package six;


import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LY
 * @version 1.0
 * @date 2023/6/25 9:53
 */

public class Demo1 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(0);
        BigDecimal b = new BigDecimal(10);
        BigDecimal c = new BigDecimal(10);
        BigDecimal d = new BigDecimal(10);

        ArrayList<BigDecimal> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        for (BigDecimal o : list) {

        //   a = a.add(o);

        }
        System.out.println(a);
        System.out.println(a.add(b).add(c).add(d));

    }
}

