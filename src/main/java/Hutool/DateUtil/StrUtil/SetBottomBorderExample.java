package Hutool.DateUtil.StrUtil;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class SetBottomBorderExample {
    public static void main(String[] args) throws IOException {
        // 创建工作簿
        Workbook workbook = new XSSFWorkbook();
        // 创建工作表
        Sheet sheet = workbook.createSheet("Sheet1");
        // 创建行
        Row row = sheet.createRow(0);
        // 创建单元格并设置值
        Cell cell = row.createCell(1);

        CellRangeAddress cellAddresses = new CellRangeAddress(0, 0, 0, 1);
        sheet.addMergedRegion(cellAddresses);

        // 设置单元格样式
        CellStyle cellStyle = workbook.createCellStyle();
        // 设置下框线样式
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        cell.setCellStyle(cellStyle);
        cell.setCellValue("有下框线的单元格");

        // 将工作簿写入文件
        try (FileOutputStream fileOut = new FileOutputStream("cell_with_bottom_border.xlsx")) {
            workbook.write(fileOut);
        }
        // 关闭工作簿
        workbook.close();
    }
}