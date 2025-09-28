package cn.bugstack.trigger.api.dto;

import lombok.Data;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 抽奖请求参数
 * @author: Merist
 * @create: 2025-07-25 11:22
 **/
@Data
public class RaffleRequestDTO {
    // 抽奖策略ID
    private Long strategyId;
}
