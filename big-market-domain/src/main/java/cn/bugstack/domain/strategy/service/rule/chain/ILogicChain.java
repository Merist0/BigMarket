package cn.bugstack.domain.strategy.service.rule.chain;

import cn.bugstack.domain.strategy.service.rule.chain.factory.DefaultChainFactory;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 责任链接口
 * @author: Merist
 * @create: 2025-07-17 09:26
 **/
public interface ILogicChain extends ILogicChainArmory{
    /**
     * 责任链接口
     * @param userId
     * @param strategyId
     * @return 奖品ID
     */
    DefaultChainFactory.StrategyAwardVO logic(String userId, Long strategyId);

}
