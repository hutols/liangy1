package easyExcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;
import lombok.Data;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ExcelUtil {
    public static void main(String[] args) throws IOException {
        List<ExcelData> dataList = new ArrayList<>();
        dataList.add(new ExcelData("1", "This is a long text that needs to be wrapped in cell.", "Merged Cell"));

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        for (int i = 0; i < dataList.size(); i++) {
            XSSFRow row = sheet.createRow(i);
            ExcelData data = dataList.get(i);

            XSSFCell cell1 = row.createCell(0);
            cell1.setCellValue(data.getId());

            XSSFCell cell2 = row.createCell(1);
            cell2.setCellValue(data.getText());
            cell2.getCellStyle().setWrapText(true);

            XSSFCell cell3 = row.createCell(2);
            cell3.setCellValue(data.getMergedText());

            sheet.addMergedRegion(new CellRangeAddress(i, i, 1, 2));
        }

        // 自动调整列宽
        for (int i = 0; i < 3; i++) {
            sheet.autoSizeColumn(i);
        }

        // 设置样式，使单元格自动换行
        CellStyle style = workbook.createCellStyle();
        style.setWrapText(true);
        sheet.setDefaultColumnStyle(1, style);

        // 导出excel文件
        FileOutputStream outputStream = new FileOutputStream("output.xlsx");
        workbook.write(outputStream);
        outputStream.close();
    }

    @Data
    static class ExcelData {
        @ExcelProperty("Id")
        private String id;

        @ExcelProperty("Text")
        private String text;

        @ExcelProperty("Merged Text")
        private String mergedText;

        public ExcelData(String id, String text, String mergedText) {
            this.id = id;
            this.text = text;
            this.mergedText = mergedText;
        }

        // Getter and Setter



    }
}