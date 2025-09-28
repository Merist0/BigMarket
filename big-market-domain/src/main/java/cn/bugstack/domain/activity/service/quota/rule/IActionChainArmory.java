package cn.bugstack.domain.activity.service.quota.rule;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 抽奖动作责任链装配
 * @author: Merist
 * @create: 2025-08-02 10:03
 **/
public interface IActionChainArmory {

    IActionChain next();

    IActionChain appendNext(IActionChain next);
}
