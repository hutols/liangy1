package 测试4;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author ppeng
 * @date 2020/9/21 10:51
 * @description
 */
@Component
public class FixAmountHandler extends AbstractCalHandler{

    @Override
    public BigDecimal calShareAmount() {
        System.out.println("计算定额逻辑");
        return new BigDecimal("1");
    }

    @Override
    public void afterPropertiesSet() {
        HandlerCalFactory.register("1",this);
    }
}
