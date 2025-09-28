package cn.bugstack.trigger.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 抽奖奖品列表，应答对象
 * @author: Merist
 * @create: 2025-07-25 11:14
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RaffleAwardListResponseDTO {
    // 奖品ID
    private Integer awardId;
    // 奖品标题
    private String awardTitle;
    // 奖品副标题【抽奖第一次后解锁】
    private String awardSubtitle;
    // 排序编号
    private Integer sort;
}
