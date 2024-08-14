package Hutool.DateUtil.StrUtil;

import cn.hutool.core.util.HexUtil;

/**
 * @author LY
 * @version 1.0
 * @date 2023/10/19 10:39
 */

public class b {
    public static void main(String[] args) {
        //16进制
        String a="你好世界";
        String s = HexUtil.encodeHexStr(a);
        System.out.println(s);
        String s1 = HexUtil.decodeHexStr("e4bda0e5a4bde4b896e7958c");
        System.out.println(s1);
    }
}

