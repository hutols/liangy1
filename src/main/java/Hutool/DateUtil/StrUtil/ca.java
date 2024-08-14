package Hutool.DateUtil.StrUtil;

import cn.hutool.json.JSONUtil;
import org.json.JSONObject;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LY
 * @version 1.0
 * @date 2023/11/24 10:50
 */
/*
json格式加颜色
 */
public class ca {
    public static void main(String[] args) {
        Data data = new Data();
        List<Data> list = new ArrayList<>();
        data.setName("张三");
        data.setAge("32");
        String name = data.getName();
        data.setName("\u001B[31m" + name);
        list.add(data);
        Data data1 = new Data();
        List<Data> list1 = new ArrayList<>();
        data1.setName("张三");
        data1.setAge("33");
        list1.add(data1);

        String jsonStr = JSONUtil.toJsonStr(list);
        System.out.println(jsonStr);

    }
}

