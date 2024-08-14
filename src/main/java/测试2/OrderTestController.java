package 测试2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : JCccc
 * @CreateTime : 2020/5/11
 * @Description :
 **/
@RestController
public class OrderTestController {
 
    @Autowired
    private OrderStrategyContext orderStrategyContext;
 
//    @PostMapping("/testStrategy")
//    public String testStrategy(@RequestBody OrderInfo orderInfo){
//        OrderStrategyService orderServiceImpl = orderStrategyContext.getResource(orderInfo);
//        String resultTest = orderServiceImpl.preCreateOrder(orderInfo);
//        return resultTest;
//
//    }
 
 
 
}