package Hutool.DateUtil.StrUtil;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelExample {
    public static void main(String[] args) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Example");

        // 创建多行
        for (int i = 0; i < 10; i++) {
            Row row = sheet.createRow(i);
            Cell cell = row.createCell(0);
            CellStyle style = workbook.createCellStyle();
            style.setBorderBottom(BorderStyle.THIN);
            style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
            cell.setCellValue("Row " + i);
        }

        // 将工作簿写入文件
        try (FileOutputStream fileOut = new FileOutputStream("example.xlsx")) {
            workbook.write(fileOut);
        }

        // 关闭工作簿
        workbook.close();
    }
}