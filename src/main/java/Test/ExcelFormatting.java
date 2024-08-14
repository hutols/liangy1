package Test;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.ObjectUtil;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.metadata.data.CellData;
import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.apache.commons.lang3.ArrayUtils.add;

public class ExcelFormatting {

    public static void main(String[] args) {

        Date s= null;
        System.out.println(DateUtil.formatDate(s));
    }
}