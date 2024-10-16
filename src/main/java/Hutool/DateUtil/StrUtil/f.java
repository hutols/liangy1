package Hutool.DateUtil.StrUtil;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.ByteUtil;
import cn.hutool.core.util.NumberUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import org.apache.commons.lang.ArrayUtils;
import org.apache.xmlbeans.XmlID;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author LY
 * @version 1.0
 * @date 2023/10/31 15:33
 */

public class f {

    public static void main(String[] args) {
        String text = "这是一个非常长的字符串,超过了二十个字符,需要在适当的地方插入换行符,以便更好地显示。";
        String formattedText = formatString(text, 5);
        System.out.println(formattedText);
        Double a = 0.0004;
        String s = NumberUtil.decimalFormat("#.####", a);

        File file = new File("D:\\date\\tmp\\ab.xlsx");

        // 创建一个List<Byte>并添加一些元素
        byte[] bytes = text.getBytes();

        FileUtil.writeBytes(bytes, file);


    }

    public static String formatString(String text, int maxLength) {
        StringBuilder formattedText = new StringBuilder();
        int start = 0;

        while (start < text.length()) {
            int end = Math.min(start + maxLength, text.length());
            formattedText.append(text, start, end).append("/n"); // 添加换行符
            start = end; // 更新起始位置
        }

        return formattedText.toString().trim(); // 去除最后多余的换行符
    }
}

