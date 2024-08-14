package easyExcel;

import cn.hutool.core.convert.Convert;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.util.ListUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author LY
 * @version 1.0
 * @date 2023/9/7 10:06
 */

public class aa {
    public static void main(String[] args) {
        ArrayList<FillData> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            FillData data = new FillData();
            data.setName("李四" + i);
            data.setDate(new Date());
            data.setNumble1(new BigDecimal(11.1000)+"%");
            list.add(data);
        }

        String writeFile ="D:\\excel\\11.xlsx";
        EasyExcel.write(writeFile, FillData.class)
                .sheet("qr")
                .registerWriteHandler(new DemoStyleStrategy()) //关键 注册自定义拦截器（进行单元格处理）
                .doWrite(list);

    }

}

