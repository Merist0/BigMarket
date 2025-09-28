package cn.bugstack.domain.strategy.service.rule.chain;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 装配
 * @author: Merist
 * @create: 2025-07-17 11:18
 **/
public interface ILogicChainArmory {
    ILogicChain appendNext(ILogicChain next);

    ILogicChain next();
}
