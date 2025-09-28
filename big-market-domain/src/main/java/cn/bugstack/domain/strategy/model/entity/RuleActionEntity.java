package cn.bugstack.domain.strategy.model.entity;

import cn.bugstack.domain.strategy.model.vo.RuleLogicCheckTypeVO;
import lombok.*;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 规则动作实体
 * @author: Merist
 * @create: 2025-07-12 10:34
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RuleActionEntity <T extends RuleActionEntity.RaffleEntity>{
    private String code = RuleLogicCheckTypeVO.ALLOW.getCode();
    private String info = RuleLogicCheckTypeVO.ALLOW.getInfo();
    private String ruleModel;
    private T data;

    static public class RaffleEntity{


    }
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    // 抽奖之前
    static public class RaffleBeforeEntity extends RaffleEntity{
        private Long strategyId;
        /** 权重值key：用于抽奖时可以选择权重抽奖 */
        private String ruleWeightValueKey;
        private Integer awardId;
    }
    // 抽奖之中
    static public class RaffleCenterEntity extends RaffleEntity{

    }
    // 抽奖之后
    static public class RaffleAfterEntity extends RaffleEntity{

    }
}
