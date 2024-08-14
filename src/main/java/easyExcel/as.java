package easyExcel;

import cn.hutool.core.compress.Gzip;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.ZipUtil;
import org.apache.commons.compress.compressors.gzip.GzipUtils;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author LY
 * @version 1.0
 * @date 2023/9/19 21:17
 */

public class as {
    public static void main(String[] args) {
        List<File> files = FileUtil.loopFiles("D:\\excel\\path");
        File file1 = files.get(0);
        System.out.println(file1.getName());
        String s="D:\\excel\\path\\bbb_b_b.ctl";
     file1.renameTo(new File(s));
        System.out.println(s);
//        for (File file : files) {
//            File d = FileUtil.rename(file, "dds", true, false);
//            byte[] gzip = ZipUtil.gzip(d);
//        }
    }
}

