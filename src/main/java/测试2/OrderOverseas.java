package 测试2;

import org.springframework.stereotype.Component;

/**
 * @Author : JCccc
 * @CreateTime : 2020/5/11
 * @Description :海外
 **/
@Component("Overseas")
public class OrderOverseas implements OrderStrategyService {
    @Override
    public String preCreateOrder(OrderInfo orderInfo) {
        System.out.println("**处理海外预下单的相关业务**");
        return orderInfo.getPlatFormType()+"-海外预下单";
    }
}