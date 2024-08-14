package easyExcel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ContentFontStyle;
import com.alibaba.excel.annotation.write.style.HeadFontStyle;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode
//头字体大小
@HeadFontStyle(fontHeightInPoints = 12)
//内容字体大小
@ContentFontStyle(fontHeightInPoints = 10)

public class list2Data {
    @ExcelProperty("姓名")
    private String name;

    @ExcelProperty("年龄")
    private int age;
}

