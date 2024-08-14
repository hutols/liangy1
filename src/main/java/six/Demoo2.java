package six;

import cn.hutool.cache.CacheListener;
import cn.hutool.core.collection.CollUtil;
import org.apache.commons.lang.StringUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author LY
 * @version 1.0
 * @date 2023/7/3 9:31
 */

public class Demoo2 {
    public static void main(String[] args) {
        String s = "1,2,3,4,5";
        List<String> a = CollUtil.newArrayList(s.split(","));
        String ae = "1,2,3,4";
        List<String> b = CollUtil.newArrayList(ae.split(","));

        a.removeAll(b);
        String strip = StringUtils.strip(a.toString(), "[]");

        System.out.println(strip);



    }

}

