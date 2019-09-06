package strategymode;

import strategymode.Strategy;

/**
 * 策略处理上下文
 *  @author: xujian
 *  @Date: 2019-09-06
 *  @Description:
 */
public class StrategyContext {
    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }
    public void handle() {
        strategy.handle();
    }
}
