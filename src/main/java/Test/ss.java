package Test;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 * @author LY
 * @version 1.0
 * @date 2024/1/2 10:34
 */

public class ss {
    public static void main(String[] args) throws Exception {

            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy年MM月dd日");
            SimpleDateFormat outputFormat = new SimpleDateFormat("d MMM yyyy");

            Date startDate = inputFormat.parse("2023年01月01日");
            Date endDate = inputFormat.parse("2023年12月30日");

            String formattedDateRange = outputFormat.format(startDate) + " to " + outputFormat.format(endDate);
            System.out.println(formattedDateRange);
        }



}


