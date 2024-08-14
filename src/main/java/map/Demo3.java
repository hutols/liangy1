package map;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author LY
 * @version 1.0
 * @date 2023/5/8 17:05
 */

public class Demo3 {
    private static final String CUST_CLASS_CD = "NDS";
    public static void main(String[] args) throws ParseException {
        String string = "2023-05-08 10:10:20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            System.out.println(sdf.parse(string));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        DateTime date = DateUtil.date(sdf.parse(string));
        System.out.println(date);
        System.out.println(CUST_CLASS_CD);
    }


}

