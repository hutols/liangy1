package Hutool.DateUtil.StrUtil;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;

/**
 * @author LY
 * @version 1.0
 * @date 2023/10/31 15:33
 */

public class f {

    public static void main(String[] args) {
        String s = "张三";
        System.out.println("\033[31;5m" + "张三" + "\033[0m");
        s = "\033[31;5m" + s + "\033[0m";
        JSON parse = JSONUtil.parse(s);
        System.out.println(parse.toString());

    }


}

