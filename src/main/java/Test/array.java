package Test;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author LY
 * @version 1.0
 * @date 2024/9/10 11:14
 */

public class array {
    public static void main(String[] args) {
      String s= "C:\\AppData\\Local\\Flash_Center\\userdata\\a.xlsx";
        System.out.println(FileUtil.mainName(s));
    }
}

