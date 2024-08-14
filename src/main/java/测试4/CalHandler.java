package 测试4;

import org.springframework.beans.factory.InitializingBean;

import java.math.BigDecimal;

/**
 * @author ppeng
 * @date 2020/9/21 10:49
 * @description
 */
public interface CalHandler extends InitializingBean {
    /**
     * 分润金额计算
     * @return
     */
    BigDecimal calShareAmount();
    /**
     * 返佣金额计算
     * @return
     */
    BigDecimal calCommissionAmount();
}
