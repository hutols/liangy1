package six;

import cn.hutool.core.collection.CollUtil;

import java.util.ArrayList;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
* @author LY
* @date 2023/7/4 10:35
* @version 1.0
*/

public class Demo3 {
    public static void main(String[] args) {
     String   s="1,2,3,4";
        ArrayList<String> strings = CollUtil.newArrayList(s.split(","));
        String collect = strings.stream().collect(joining(","));
        System.out.println(collect);

    }
}

