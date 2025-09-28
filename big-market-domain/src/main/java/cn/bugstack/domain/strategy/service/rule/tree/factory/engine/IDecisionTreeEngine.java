package cn.bugstack.domain.strategy.service.rule.tree.factory.engine;

import cn.bugstack.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 规则树组合接口
 * @author: Merist
 * @create: 2025-07-17 14:53
 **/
public interface IDecisionTreeEngine {
    DefaultTreeFactory.StrategyAwardVO process(String userId, Long strategyId, Integer awardId);
}
