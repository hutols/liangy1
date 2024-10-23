package Test;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.IdcardUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import lombok.Data;
import model.DataEntry;
import org.junit.Test;

import java.io.File;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author LY
 * @version 1.0
 * @date 2024/10/16 9:31
 */

public class demo1 {


    /*
    读取excel
     */
    @Test
    public void a() {
        File file = FileUtil.file("D:\\date\\up\\客户编号.xlsx");
        ArrayList<clas> list = new ArrayList<>();
        EasyExcel.read(file, clas.class, new PageReadListener<clas>(list::addAll
        )).sheet().doRead();
        System.out.println(list);
    }


    /*
  18位身份证计算日期
   */
    @Test
    public void b() {
        String a = "432103198810125621";
        System.out.println(IdcardUtil.getBirth(a));
    }

    /*
    计算年龄
     */
    @Test
    public void c() {
        String a = "432103198810125621";
        System.out.println(IdcardUtil.getAgeByIdCard(a));
    }

    /*
    以，分割，去掉空串和null
     */
    @Test
    public void d() {
        Set<String> set = new HashSet<>();
        String a="9,1,2,,3,,,4,,,,5";
        set=  Arrays.stream(a.split(",")).filter(StrUtil::isNotBlank).collect(Collectors.toSet());
        System.out.println(set);
    }


    /*
   base#create#180&batch#create#360转为map
    */
    @Test
    public void e() {
        // 输入的字符串
        String input = "base#create#180&batch#create#360";

        // 将字符串按"&"分割并转换为List<DataEntry>
        List<DataEntry> resultList = Arrays.stream(input.split("&"))
                .map(pair -> pair.split("#"))  // 按"#"分割
                .filter(arr -> arr.length == 3) // 确保有三个元素
                .map(arr -> new DataEntry(arr[0], arr[1], arr[2])) // 创建DataEntry实例
                .toList(); // 收集到List中

        // 输出结果
        resultList.forEach(System.out::println);
    }

}

