package duqu;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.enums.CellExtraTypeEnum;
import map.DemoExtraListener;

import java.io.File;
import java.util.List;

/**
 * @author LY
 * @version 1.0
 * @date 2023/11/22 14:24
 */

public class ces {
    public static void main(String[] args) {
        String fileName = "D:\\date\\up\\aa.xlsx";
        File file = new File(fileName);
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet
//        List<DemoExtraData> objects = EasyExcel.read(fileName, DemoExtraData.class, new DemoExtraListener)
//                // 需要读取批注 默认不读取
//                .extraRead(CellExtraTypeEnum.COMMENT)
//                // 需要读取超链接 默认不读取
//                .extraRead(CellExtraTypeEnum.HYPERLINK)
//                // 需要读取合并单元格信息 默认不读取
//                .extraRead(CellExtraTypeEnum.MERGE).sheet().doReadSync();
//        for (DemoExtraData object : objects) {
//            System.out.println(object.getRow1());
//            System.out.println(object.getRow2());
//        }
        EasyExcel.read(fileName, DemoExtraData.class, new DemoDataListener()).sheet().doRead();

    }

}

