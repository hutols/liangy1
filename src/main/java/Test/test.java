package Test;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.img.FontUtil;
import cn.hutool.core.img.LabColor;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.LineHandler;
import cn.hutool.core.net.Ipv4Util;
import cn.hutool.core.net.NetUtil;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.core.util.ReflectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.spring.SpringUtil;
import cn.hutool.json.JSONUtil;
import com.alibaba.excel.EasyExcel;
import lombok.Data;
import org.apache.commons.io.FileUtils;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.util.*;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @author LY
 * @version 1.0
 * @date 2023/11/28 10:30
 */

public class test {

    /*
    contains比较多条
     */
    @Test
    public void a() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        if (list.contains("k") && (list.contains("c") || list.contains("b"))) {
            System.out.println("进来了");
        }

    }

    /*
   修改文件名，替换文件
     */
    @Test
    public void b() {
        String path = "D:\\test";
        List<File> files = FileUtil.loopFiles(path);//获取文件夹下的所有内容
        for (File file : files) {
            //1、isRetainExt为true时，保留原扩展名：
            // FileUtil.rename(file, "aaa", true) xx/xx.png =》xx/aaa.png
            //2、isRetainExt为false时，不保留原扩展名，需要在newName中
            // FileUtil.rename(file, "aaa.jpg", false) xx/xx.png =》xx/aaa.jpg
            FileUtil.rename(file, "aa", true, false);//修改文件名

            String content = FileUtil.readString(file, "GBK");//读取文件内容
            //  String content = FileUtil.readUtf8String(file);//读取文件内容 utf-8编码
            System.out.println(content);
            content = content.replaceAll("张三", "李四");//替换文件内容

            FileUtil.writeString(content, file, "GBK");//将替换后的内容写入文件  utf-8编码
            // FileUtil.writeUtf8String(content, file);//将替换后的内容写入文件  utf-8编码
        }
    }

    @Test
    public void c() {
        String path = "D:\\test";

        List<File> files = FileUtil.loopFiles(path);//获取文件夹下的所有内容
        for (File file : files) {
            //D:\test\aa.xlsx
            System.out.println(file);

        }
        List<String> list = FileUtil.listFileNames(path);
        for (String s : list) {
            //aa
            String s1 = StrUtil.removeSuffix(s, ".xlsx");
            System.out.println(s1);
            String suffix = FileUtil.getSuffix(s);
            System.out.println("." + suffix);

        }


    }

    /*
    获取一天的开始事件和结束时间
     */
    @Test
    public void d() {
        DateTime date = DateUtil.date();
        System.out.println(DateUtil.beginOfDay(date));
        System.out.println(DateUtil.endOfDay(date));
    }

    /*
   异步
     */
    @Test
    public void e() {

        Future<?> future = ThreadUtil.execAsync(() -> {
            System.out.println("进入异步");
            ThreadUtil.sleep(3000);
            System.out.println("随眠3秒");
        });
        System.out.println("直接执行");
        Boolean falg = false;

        try {
            falg = (Boolean) future.get(40, TimeUnit.SECONDS);
            if (falg) {
                System.out.println("成功");
            } else {
                System.out.println("失败");
            }
            System.out.println(falg);
        } catch (Exception e) {

        }
    }

    /*
   读取excel
     */
    @Test
    public void f() {
        String fileName = "D:\\excel\\11.xlsx";
        EasyExcel.read(fileName, DemoData.class, new DemoDataListener()).doReadAll();
        System.out.println("结束");
    }

    /*
  读取excel条数
    */
    @Test
    public void g() {
        String fileName = "D:\\excel\\c.xlsx";
        List<String> stringList = FileUtil.readLines(new File(fileName), "UTF-8");

        System.out.println(stringList.size());
    }

    /*
读取excel条数
 */
    @Test
    public void h() {
        String s = "";
        if (ObjectUtil.isNotEmpty(s)) {
            System.out.println("a");
        }
    }

    /*
电脑ip地址
*/
    @Test
    public void FontUtil() throws UnknownHostException {

        InetAddress ipAddress = InetAddress.getLocalHost();
        String ip = ipAddress.getHostAddress();
        System.out.println("IP地址: " + ipAddress);
        System.out.println(InetAddress.getLoopbackAddress());
    }

    /*
 判断是否同一个月
*/
    @Test
    public void IsMonth() {
        String date = "2023-12-30";
        DateTime dateTime = DateUtil.parseDate(date);
        DateTime dateTime1 = DateUtil.offsetDay(dateTime, +1);
        boolean sameMonth = DateUtil.isSameMonth(dateTime, dateTime1);
        if (!sameMonth) {
            System.out.println("不是一个月");
        }
    }


    /*
 date判断大小于
 */
    @Test
    public void IsMonths() {
        Date date = new Date();
        Date dateTime = DateUtil.offsetDay(date, -1);

        if (dateTime.before(date)) {
            System.out.println("dateTime小于date ");
        }

        if (date.after(dateTime)) {
            System.out.println("date大于dateTime");
        }
    }

    /*
 去中英文括号
*/
    @Test
    public void asserts() {
        // 使用正则表达式去掉中英文括号
        String a = "()）（zhagsna";
        String regex = "[\\(（）)]";
        String s = a.replaceAll(regex, "");
        System.out.println(s);
    }


    public void as(int a, int b) {
        System.out.println(a + b);
    }

    /*
1,2,3转list
*/
    @Test
    public void lists() {
        // 使用正则表达式去掉中英文括号
        String s = "1,2,3";
        ArrayList<String> strings = Lists.newArrayList(s.split(","));
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void event() throws Exception {
        String s = "2-第一期";
        String a = null;
        a = StrUtil.sub(s, 2, 5);
        System.out.println(a);
    }
}

