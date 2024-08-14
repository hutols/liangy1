package 测试4;

import com.alibaba.excel.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ppeng
 * @date 2020/9/21 10:53
 * @description
 */
public class HandlerCalFactory {
    private static Map<String,CalHandler> map = new HashMap<String,CalHandler>();

    public static void register(String key,CalHandler calHandler){
        if(StringUtils.isEmpty(key) && null == calHandler){
            return;
        }
        map.put(key,calHandler);
    }

    public static CalHandler getInvokeHandler(String key){

        return map.get(key);
    }
    
}
