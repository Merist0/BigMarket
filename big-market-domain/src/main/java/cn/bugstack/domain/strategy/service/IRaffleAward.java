package cn.bugstack.domain.strategy.service;

import cn.bugstack.domain.strategy.model.entity.StrategyAwardEntity;

import java.util.List;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 策略奖品查询接口
 * @author: Merist
 * @create: 2025-07-26 09:44
 **/
public interface IRaffleAward {
    List<StrategyAwardEntity> queryRaffleStrategyAwardList(Long strategyId);
}
