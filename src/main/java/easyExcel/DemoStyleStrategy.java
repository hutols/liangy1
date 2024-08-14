package easyExcel;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.util.StringUtils;
import com.alibaba.excel.write.merge.AbstractMergeStrategy;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;

public class DemoStyleStrategy extends AbstractMergeStrategy {

    public DemoStyleStrategy() {
    }

    /**
     * 初始化时，记录行号和内容
     */

    @Override
    protected void merge(Sheet sheet, Cell cell, Head head, Integer integer) {

        // 1、获取单元格的数据,并且转化为字符串，strValue用于判断该行是否需要合并，避免报错数据获取异常
        String strValue = null;
        if (cell.getCellType() == CellType.STRING) {
            strValue = cell.getStringCellValue();
        } else if (cell.getCellType() == CellType.NUMERIC) {
            double value = cell.getNumericCellValue();
            strValue = String.valueOf(value);
        }

        // 2、判断是否需要合并单元格 当单元格的值为”字符串6“ ,当前行的第1列和第2列进行 合并单元格操作
        if (StringUtils.equals(strValue, "李四1")) {

            // 3、获取需要做合并操作的单元格在第几行
            int rowNum = cell.getRowIndex();
            //
            /*
             * 设置合并的位置
             * org.apache.poi.ss.util.CellRangeAddressBase 合并单元格参数设置
             *  例子：CellRangeAddress（1,1, 3, 4)
             *  表示 第1行的第3和第4单元格合并为一个单元格，
             *
             * */
            int count = 0;
            for (int i = 0; i < 10; i++) {
                CellRangeAddress cellAddresses = new CellRangeAddress(count, count, 0, 1);
                // 3、合并单元格执行
                sheet.addMergedRegion(cellAddresses);
                count++;
            }
        }
    }
}



