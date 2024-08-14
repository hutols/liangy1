package Hutool.DateUtil.FileUtil;

import cn.hutool.core.io.FileUtil;
import org.assertj.core.util.Lists;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.ArrayList;

/**
 * @author LY
 * @version 1.0
 * @date 2024/1/17 10:55
 */
@SpringBootApplication
public class appendLines {
    public static void main(String[] args) {
        String path = "D:\\excel\\c.xlsx";
        File file = new File(path);
        String a = "张三、李四、王五、赵六";
        ArrayList<String> strings = Lists.newArrayList(a.split("、"));


    }
}

