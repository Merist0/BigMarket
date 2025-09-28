package cn.bugstack.trigger.api.dto;

import lombok.Data;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 抽奖奖品列表，请求对象
 * @author: Merist
 * @create: 2025-07-25 11:12
 **/
@Data
public class RaffleAwardListRequestDTO {
    // 抽奖策略ID
    private Long strategyId;
}
