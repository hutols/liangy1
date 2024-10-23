package Test;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.IdcardUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import lombok.Data;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;

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


}

