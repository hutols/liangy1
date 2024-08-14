package Hutool.DateUtil.StrUtil;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.FileOutputStream;
import java.io.IOException;

public class MergeCellsWithBottomBorderExample {
    public static void main(String[] args) throws IOException {
        // 创建工作簿
        Workbook workbook = new XSSFWorkbook();
        // 创建工作表
        Sheet sheet = workbook.createSheet("Sheet1");

        // 创建行并设置单元格的值
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        Cell cell1 = row.createCell(1);
        Cell cell2 = row.createCell(2);
        cell.setCellValue("合并的单元格");

        // 创建单元格样式
        CellStyle cellStyle = workbook.createCellStyle();
        // 设置下框线样式
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());

        // 合并单元格（从第1行到第1行, 从第1列到第3列）
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 2));
        
        // 重新设置合并后的单元格样式
        cell.setCellStyle(cellStyle);
        cell1.setCellStyle(cellStyle);
        cell2.setCellStyle(cellStyle);

        // 将工作簿写入文件
        try (FileOutputStream fileOut = new FileOutputStream("merged_cells_with_bottom_border.xlsx")) {
            workbook.write(fileOut);
        }

        // 关闭工作簿
        workbook.close();
    }
}