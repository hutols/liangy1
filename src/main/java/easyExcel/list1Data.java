package easyExcel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.*;
import com.alibaba.excel.enums.BooleanEnum;
import com.alibaba.excel.enums.poi.BorderStyleEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.springframework.boot.autoconfigure.data.ConditionalOnRepositoryType;

import java.lang.annotation.ElementType;

import static org.apache.poi.ss.usermodel.FillPatternType.*;
import static org.springframework.boot.autoconfigure.data.RepositoryType.AUTO;


@Data
@EqualsAndHashCode
//头字体大小
@HeadFontStyle(fontHeightInPoints = 12)
//内容字体大小
@ContentFontStyle(fontHeightInPoints = 10)

public class list1Data {
    @ExcelProperty("姓名13")
    @ColumnWidth(20)
    @ContentStyle(wrapped = BooleanEnum.TRUE)
    @HeadFontStyle(fontName = "name", color = 2)

    private String name;

    @ExcelProperty("年龄")
    private int age;
}

