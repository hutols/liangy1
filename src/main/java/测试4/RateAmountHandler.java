package 测试4;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author ppeng
 * @date 2020/9/21 10:52
 * @description
 */
@Component
public class RateAmountHandler extends AbstractCalHandler{
    @Override
    public BigDecimal calShareAmount() {
        System.out.println("计算比例逻辑");
        return new BigDecimal("2");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        HandlerCalFactory.register("2",this);
    }

}
