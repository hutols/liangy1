package Hutool.DateUtil.StrUtil;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.annotation.format.NumberFormat;
import com.alibaba.excel.write.handler.AbstractRowWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import lombok.Data;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import java.util.ArrayList;
import java.util.List;

public class EasyExcelFormatExample {
    public static void main(String[] args) {
        // 创建数据
        List<MyData> data = getData();

        // 写入Excel
        EasyExcel.write("output_format.xlsx", MyData.class)
                .registerWriteHandler(new FormatWriteHandler()) // 注册格式处理器
                .sheet("Sheet1")
                .doWrite(data); // 写入数据
    }

    // 自定义格式处理器
    public static class FormatWriteHandler extends AbstractRowWriteHandler {
        @Override
        public void afterRowCreate(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Row row, Integer rowIndex, Boolean isHead) {
            if (rowIndex == 0) {
                // 在第一行设置标题
               // createCell(row, 0, "1234567.89", CellType.STRING);
                Cell cell = createCell(row, 1, "1234567.89", CellType.NUMERIC);
                // 设置失焦格式化样式
                CellStyle cellStyle = row.getSheet().getWorkbook().createCellStyle();
                DataFormat format = row.getSheet().getWorkbook().createDataFormat();
                cellStyle.setDataFormat(format.getFormat("#,##0.00")); // 千分位加两位小数
                cell.setCellStyle(cellStyle);
            } else {
                // 填充数据
                createCell(row, 0, 1234567.89, CellType.NUMERIC); // 原值
                Cell cell = createCell(row, 1, 1234567.89, CellType.NUMERIC); // 格式化值

                // 设置失焦格式化样式
                CellStyle cellStyle = row.getSheet().getWorkbook().createCellStyle();
                DataFormat format = row.getSheet().getWorkbook().createDataFormat();
                cellStyle.setDataFormat(format.getFormat("#,##0.00")); // 千分位加两位小数
                cell.setCellStyle(cellStyle);
            }
        }



        private Cell createCell(Row row, int columnIndex, Object value, CellType cellType) {
            Cell cell = row.createCell(columnIndex, cellType);
            if (value instanceof String) {
                cell.setCellValue((String) value);
            } else if (value instanceof Number) {
                cell.setCellValue(((Number) value).doubleValue());
            }
            return cell;
        }
    }

    // 模拟获取数据
    private static List<MyData> getData() {
        List<MyData> data = new ArrayList<>();
        data.add(new MyData("示例", 1234567.89));
        return data;
    }

  @Data
    // 数据类
    public static class MyData {
        private String name;
        @NumberFormat("#,##0.00_ ")
        private Double value;

        public MyData(String name, Double value) {
            this.name = name;
            this.value = value;
        }

        // Getter 和 Setter 省略
    }
}