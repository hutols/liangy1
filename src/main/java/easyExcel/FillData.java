package easyExcel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.NumberFormat;
import com.alibaba.excel.annotation.write.style.ContentStyle;
import com.alibaba.excel.annotation.write.style.OnceAbsoluteMerge;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@Accessors(chain = true)
public class FillData {
//    @OnceAbsoluteMerge(firstRowIndex = 2, lastRowIndex = 6, firstColumnIndex = 8, lastColumnIndex = 8)
    private String name;
    @ExcelProperty(value = "完成率", index = 1)
    @ContentStyle(dataFormat = 4)
    private BigDecimal numble;
    @NumberFormat("#.##%")
    private String numble1;
    private String ss;
    private Date date;
  //  private WriteCellData<String> stringFillData;
}