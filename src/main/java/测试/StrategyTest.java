package 测试;
/**
* @author LY
* @date 2023/5/26 11:24
* @version 1.0
*/

public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context(new a());
        int demo = context.demo(11, 22);
        System.out.println(demo);
        context = new Context(new b());

        System.out.println(  context.demo1(11,22));
    }
}

