package 测试;

/**
 * @author LY
 * @version 1.0
 * @date 2023/5/26 11:19
 */

public class Context {
    private Strategy strategy;
    private Sub sub;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int demo(int a, int b) {
        return strategy.add(a, b);
    }

    public int demo1(int a, int b) {
        return strategy.upd(a, b);
    }
}

