package map;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.ChineseDate;
import cn.hutool.core.util.StrUtil;

import javax.sql.rowset.serial.SerialClob;
import java.sql.SQLException;
import java.util.AbstractCollection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;
import java.util.stream.Stream;


/**
 * @author LY
 * @version 1.0
 * @date 2023/4/26 16:20
 */

public class Demo1 {

    public static void main(String[] args) throws SQLException {
        Hosting hosting = new Hosting();
        String s= "System.currentTimeMillis()+";
        SerialClob serialClob = new SerialClob(s.toCharArray());
        System.out.println(serialClob);
        String subString = serialClob.getSubString(1, (int) serialClob.length());
        System.out.println(subString);
    }

//<[!CDATE[<]]>
    private class ChineseUtil {
        private static final Pattern CHINESE_PATTERN = Pattern.compile("[\u4e00-\u9fa5]");

        public static boolean containsChinese(String str) {
            if (str == null) {
                return false;
            }
            Matcher matcher = CHINESE_PATTERN.matcher(str);
            return matcher.find();
        }
    }
}

