package 测试4;

import java.math.BigDecimal;

/**
 * @author ppeng
 * @date 2020/9/21 10:49
 * @description
 */
public class Test {
    public static void main(String[] args) {
        CalHandler invokeHandler = HandlerCalFactory.getInvokeHandler("1");
        BigDecimal bigDecimal = invokeHandler.calShareAmount();
    }
}
