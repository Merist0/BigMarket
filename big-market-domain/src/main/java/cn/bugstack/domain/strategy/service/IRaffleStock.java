package cn.bugstack.domain.strategy.service;

import cn.bugstack.domain.strategy.model.vo.StrategyAwardStockKeyVO;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 抽奖库存相关服务，获取库存消耗队列
 * @author: Merist
 * @create: 2025-07-21 17:05
 **/
public interface IRaffleStock {
    /**
     * 获取奖品库存消耗队列
     * @return 奖品库存key信息
     * @throws InterruptedException 异常
     */
    StrategyAwardStockKeyVO takeQueueValue() throws InterruptedException;

    /**
     * 更新奖品库存消耗记录
     * @param strategyId
     * @param awardId
     */
    void updateStrategyAwardStock(Long strategyId,Integer awardId);
}
