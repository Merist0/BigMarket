package cn.bugstack.domain.strategy.model.entity;

import lombok.Data;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 规则物料实体对象，用于过滤规则的必要参数
 * @author: Merist
 * @create: 2025-07-12 10:16
 **/
@Data
public class RuleMatterEntity {
    private String userId;
    private Long strategyId;
    private Integer awardId;
    private String ruleModel;
}
