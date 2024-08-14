package map;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.ftp.Ftp;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.springframework.util.StreamUtils;

import javax.sql.rowset.serial.SerialClob;
import javax.swing.event.CellEditorListener;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author LY
 * @version 1.0
 * @date 2023/5/19 14:59
 */
@Slf4j
public class Test1 {
    /**
     * 读取公式和单元格类型
     *
     * <p>
     * 1. 创建excel对应的实体对象 参照{@link CellDataReadDemoData}
     * <p>
     * 2. 由于默认一行行的读取excel，所以需要创建excel一行一行的回调监听器，参照{@link }
     * <p>
     * 3. 直接读即可
     *
     * @since 2.2.0-beat1
     */
    @Test
    public void cellDataRead() {

        String fileName = "D:/date/file/ss.xls";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet
        EasyExcel.read(fileName, DemoExtraData.class, new PageReadListener<DemoExtraData>(dataList -> {
            List<DemoExtraData> list = new ArrayList<>();
            for (DemoExtraData demoData : dataList) {
                //  log.info("读取到一条数据{}", JSONUtil.toJsonStr(demoData));
                DemoExtraData demoExtraData = new DemoExtraData();
                demoExtraData.setRow1(demoData.getRow1());
                demoExtraData.setRow2(demoData.getRow2());
                list.add(demoExtraData);

            }
            for (DemoExtraData demoExtraData : list) {
                System.out.println(demoExtraData.getRow1());
                System.out.println(demoExtraData.getRow2());
            }
        })).sheet().doRead();

    }

    @Test
    public void delFile() {
        File file = new File("D:\\ss");
        boolean file1 = FileUtil.del(file);
        if (file1) {
            System.out.println("shanc");
        } else {
            System.out.println("wu");
        }
    }

    @Test
    public void upFile() throws IOException, SQLException {
        List<Hosting> list = new ArrayList<>();
        Hosting hosting = new Hosting();
        hosting.setId(1);
        //hosting.setName("2");
        list.add(hosting);
        Hosting hosting2 = new Hosting();
        hosting2.setId(1);
       // hosting2.setName("2");
        list.add(hosting2);
        Hosting hosting3 = new Hosting();
        hosting3.setId(1);
        //hosting3.setName("3");
        list.add(hosting3);
        if (list.isEmpty()){
            System.out.println("you");
        }
        // 列表对象中，多个字段校验，去重后生成新的列表
        List<Hosting> testList = list.stream().collect(
                Collectors.collectingAndThen(Collectors.toCollection(
                        () -> new TreeSet<>(Comparator.comparing(
                                o -> o.getId() + ";" + o.getName() )
                        )), ArrayList::new));
        System.out.println(testList);
        //  String collect = list.stream().map(hosting::getName).collect(Collectors.joining());
        // System.out.println(collect);
    }

    @Test
    private void s() throws SQLException {

    }
}

