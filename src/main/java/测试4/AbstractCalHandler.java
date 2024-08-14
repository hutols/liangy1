package 测试4;

import java.math.BigDecimal;

/**
 * @author ppeng
 * @date 2020/9/21 10:49
 * @description
 * 定义模板类的作用：
 * 1.空实现接口方法，让实现类去实现所需要的抽象方法，否则接口新定义抽象方法，实现类必须实现该方法，不利于扩展
 *   当然也可以使用JDK8默认方法或静态方法将公共的方法放到接口中写，但不推荐
 * 2.公共方法可抽取到抽象类中复用
 *   
 */
public abstract class AbstractCalHandler implements CalHandler{

    @Override
    public BigDecimal calShareAmount() {
        throw new UnsupportedOperationException(); }

    @Override
    public BigDecimal calCommissionAmount() {
        throw new UnsupportedOperationException(); }

    public BigDecimal common(){
        System.out.println("调用抽象类公共方法");
        return null;
    }

}

