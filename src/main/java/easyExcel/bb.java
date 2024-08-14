package easyExcel;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.poi.excel.cell.CellUtil;
import com.alibaba.excel.EasyExcel;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * @author LY
 * @version 1.0
 * @date 2023/9/13 11:23
 */

public class bb {
    public static void main(String[] args) throws IOException {
        list1 list1 = new list1();
        list1.setName(null);
        list1.setAge(20);

        String name = list1.getName();
       if (StrUtil.isBlank(name)){
           System.out.println("22");
       }
        System.out.println(name);

    }
}

