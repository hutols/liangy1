package map;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ContentFontStyle;
import com.alibaba.excel.annotation.write.style.HeadFontStyle;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode
//头字体大小
@HeadFontStyle(fontHeightInPoints = 12)
//内容字体大小
@ContentFontStyle(fontHeightInPoints = 10)

public class Code1 {
    //举个列子，根据自己的需求定义
    @ExcelProperty("客户编号")
    private String custId;
}