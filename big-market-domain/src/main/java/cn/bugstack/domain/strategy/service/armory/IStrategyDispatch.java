package cn.bugstack.domain.strategy.service.armory;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 策略抽奖的调度
 * @author: Merist
 * @create: 2025-07-10 15:08
 **/
public interface IStrategyDispatch {
    Integer getRandomAwardId(Long strategyId);

    Integer getRandomAwardId(Long strategyId, String ruleWeightValue);

    Boolean subtractionAwardStock(Long strategyId, Integer awardId);
}
