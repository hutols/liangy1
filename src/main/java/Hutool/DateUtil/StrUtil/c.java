package Hutool.DateUtil.StrUtil;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.core.util.StrUtil;
import cn.hutool.cron.CronUtil;
import cn.hutool.cron.task.Task;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import org.springframework.util.DigestUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author LY
 * @version 1.0
 * @date 2023/10/19 11:25
 */

public class c {
    public static void main(String[] args) {
        List<Data> list = new ArrayList<>();
        Data data = new Data();
        data.setAge("1");
        data.setAge("2");

        data.setName("\033[31;5m" + "张三" + "\033[0m");
        Date date = new Date();
        String format = DateUtil.format(date, DatePattern.NORM_DATETIME_PATTERN);
        DateTime dateTime = DateUtil.parseDate("2023-10-10");
        data.setDate(date);
        list.add(data);

        System.out.println(data.getName());
        String jsonPrettyStr = JSONUtil.toJsonStr(list);
        System.out.println(jsonPrettyStr);
        String fileName = StrUtil.removeSuffix("pretty_girl.jpg", ".jpg") + ".xml";  //fileName -> pretty_girl
        System.out.println(fileName);
        String s = "ss.xlxsl";
        String substring = s.substring(0, s.indexOf("."));
        System.out.println(substring);
        System.out.println(FileUtil.	readBytes("ss1.xls"));
        CronUtil.schedule("*/2 * * * * *", new Task() {
            @Override
            public void execute() {
                Console.log("Task excuted.");
            }
        });

    }
}

