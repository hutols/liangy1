package Hutool.DateUtil.StrUtil;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

/**
 * @author LY
 * @version 1.0
 * @date 2023/10/31 15:00
 */

public class d {
    public static void main(String[] args) {
        String html = "{\"name\":\"Something must have been changed since you leave\"}";
        JSONObject jsonObject = JSONUtil.parseObj(html);
        String str = jsonObject.getStr("name");
        System.out.println(str);

    }
}

