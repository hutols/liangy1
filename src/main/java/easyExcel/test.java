package easyExcel;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.io.FileUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;
import org.apache.poi.ss.usermodel.DateUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class test {
    public static void main(String[] args) {
//        FileUtil.mkdir("D:\\test");//创建测试文件夹，第一次运行之后注释掉，
        File file = new File("D:\\test\\test.xlsx");
        //准备第一个sheet页的数据
        list1 list1 = new list1();
        list1.setName("张三213231232131323132132111122222222222222131");
        list1.setAge(20);

        list1Data list1Data = new list1Data();
        List<list1Data> list2Data1 = new ArrayList<>();
        BeanUtil.copyProperties(list1, list1Data);
        list2Data1.add(list1Data);


        //准备第二个sheet页的数据
        list1 list2 = new list1();
        list2.setName("李四");
        list2.setAge(22);

        list2Data list2Data = new list2Data();
        BeanUtil.copyProperties(list2, list2Data);
        List<list2Data> list2Data2 = new ArrayList<>();
        list2Data2.add(list2Data);

        try (ExcelWriter excelWriter = EasyExcel.write(file).build();) {//file文件；
            WriteSheet sheet = EasyExcel.writerSheet("张三信息").head(list1Data.class).build();
            WriteSheet build = EasyExcel.writerSheet("李四信息").head(list2Data.class).registerWriteHandler(new LongestMatchColumnWidthStyleStrategy()).build();
            excelWriter.write(list2Data1, sheet);
            excelWriter.write(list2Data2, build);
            System.out.println("运行成功");
        }

    }
}

