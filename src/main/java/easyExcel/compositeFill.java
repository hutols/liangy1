package easyExcel;

import cn.hutool.captcha.ShearCaptcha;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TemporalUtil;
import cn.hutool.core.img.GraphicsUtil;
import cn.hutool.core.math.BitStatusUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SignUtil;
import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.extra.mail.Mail;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author LY
 * @version 1.0
 * @date 2023/7/30 23:59
 */

public class compositeFill {
    public static void main(String[] args) {

        String fileName = "D:\\excel\\d.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 同步读取会自动finish
        List<FillData> list = EasyExcel.read(fileName).head(FillData.class).sheet().doReadSync();
        //需要合并的列
        int[] mergeColumeIndex = {0, 5};
        // 从第二行后开始合并
        int mergeRowIndex = 2;
      //  EasyExcel.write("D:\\excel\\ss1.xlsx").sheet().registerWriteHandler(new ExcelFillCellMergeStrategy(mergeRowIndex, mergeColumeIndex)).doWrite(list);
        System.out.println("运行成功");
        ExcelReaderSheetBuilder excelReaderSheetBuilder = EasyExcel.readSheet().sheetName(fileName);
     
    }

}

