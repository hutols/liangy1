package easyExcel;

import cn.hutool.poi.excel.cell.CellUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.util.ListUtils;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.fill.FillConfig;
import com.alibaba.excel.write.metadata.fill.FillWrapper;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

/**
 * @author LY
 * @version 1.0
 * @date 2023/7/30 15:40
 */

public class simpleFill {
    public static void main(String[] args) throws IOException {
        String fileName = "D:\\excel\\a.xlsx";
        File file = new File("D:\\excel\\d.xlsx");
        String name = "D:\\excel\\" + System.currentTimeMillis() + "." + file.getName();

        ArrayList<FillData> list = new ArrayList<>();
        ArrayList<FillData> list1 = new ArrayList<>();

        FillData a = new FillData();
        a.setNumble(new BigDecimal(20.1200));
        a.setName("张三");
        a.setSs("删除");
        list.add(a);
        FillData b = new FillData();
        b.setNumble(new BigDecimal(22.3200));
        b.setName("李四");
        b.setSs("新曾");
        list.add(b);

        for (FillData fillData : list) {
            FillData c = new FillData();
            c.setName(fillData.getName());
            c.setNumble(fillData.getNumble());
            c.setSs(fillData.getSs());
            list1.add(c);


        }


        try (ExcelWriter excelWriter = EasyExcel.write(file).withTemplate(fileName).build()) {
            WriteSheet writeSheet = EasyExcel.writerSheet().build();
            WriteSheet writeSheet1 = EasyExcel.writerSheet("Sheet2").build();
            // 如果有多个list 模板上必须有{前缀.} 这里的前缀就是 data1，然后多个list必须用 FillWrapper包裹
            FillConfig fillConfig = FillConfig.builder().forceNewRow(Boolean.TRUE).build();
            excelWriter.fill(new FillWrapper("c", list1), fillConfig, writeSheet);
            excelWriter.fill(new FillWrapper("c", list1), fillConfig, writeSheet1);
            WriteSheet build = EasyExcel.writerSheet(0).build();
           // excelWriter.read(build);
        }

    }

}

