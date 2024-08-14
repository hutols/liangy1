package Test;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MergeRowsExample {

    public static void main(String[] args) {
        // 模拟数据
        List<List<String>> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                row.add("Row " + i + ", Col " + j);
            }
            data.add(row);
        }

        // 合并行
       mergeRows(data, 2, 4);

        // 写入 Excel 文件
        String fileName = "a.xlsx";
        ExcelWriter excelWriter = EasyExcel.write(fileName).build();
        WriteSheet writeSheet = EasyExcel.writerSheet("Sheet1").build();
        excelWriter.write(data, writeSheet);
        excelWriter.finish();
        System.out.println("Excel 文件已生成：" + fileName);
    }

    public static void mergeRows(List<List<String>> data, int startRow, int endRow) {
        for (int i = startRow; i <= endRow; i++) {
            List<String> row = data.get(i);
            for (int j = 0; j < row.size(); j++) {
                // 清空被合并的行的数据
                row.set(j, "");
            }
        }
    }
}
