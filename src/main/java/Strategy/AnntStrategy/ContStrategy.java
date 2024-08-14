package Strategy.AnntStrategy;

/**
 * @author LY
 * @version 1.0
 * @date 2024/1/2 16:28
 */

public class ContStrategy {
    private Strategy strategy;

//    public StrConext(Strategy strategy) {
//        this.strategy = strategy;
//    }

    private void executeStrategy(int a, int b) {
        strategy.all(a, b);
    }
}

