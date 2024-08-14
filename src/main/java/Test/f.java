package Test;

import cn.hutool.core.convert.Convert;
import cn.hutool.json.JSONUtil;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author LY
 * @version 1.0
 * @date 2024/1/2 10:43
 */

public class f {
    public static void main(String[] args) {
        ArrayList<DemoData> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            DemoData demoData = new DemoData();
            if (i==2){
                demoData.setString("1");
                demoData.setDoubleData("1");
                demoData.setDate(new Date());
            }else {
                demoData.setString(Convert.toStr(i));
                demoData.setDate(new Date());
                demoData.setDoubleData(Convert.toStr(i));
            }

            list.add(demoData);
        }
        String json = JSONUtil.toJsonPrettyStr(list);
        //System.out.println(json);
      //  List<DemoData> collect = list.stream().distinct().collect(Collectors.toList());

        //根据字段去重
        ArrayList<DemoData> collect = list.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(
                () -> new TreeSet<>(Comparator.comparing(DemoData::getDate))), ArrayList::new));
        String jsonPrettyStr = JSONUtil.toJsonPrettyStr(collect);
        System.out.println(jsonPrettyStr);
    }
}

