package Test;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Filter;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.extra.compress.archiver.Archiver;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static org.assertj.core.api.Assertions.as;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author LY
 * @version 1.0
 * @date 2024/1/2 10:34
 */

public class ss {
    public static void main(String[] args) throws Exception {
        /*String a = "1,2,3,4";
        String b = "2,3,4";
        String[] c = a.split(",");
        String[] d = b.split(",");
        System.out.println(ArrayUtil.toString(c));
        System.out.println(ArrayUtil.toString(d));*/

        // 示例数组
        String[] a = {"2", "1", "3", "4", "1", "5", "1"};
        String target = "1"; // 目标元素
        List<Integer> indices = new ArrayList<>(); // 存储索引位置

        // 查找目标元素的索引位置
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(target)) {
                indices.add(i);
            }
        }
        String[] array = indices.stream().map(String::valueOf).toArray(String[]::new);
        // 将索引位置拼接为字符串
        String result = String.join(",", indices.stream().map(String::valueOf).toArray(String[]::new));

        // 输出结果
        System.out.println("元素'" + target + "'的索引位置: " + result);


    }


}


