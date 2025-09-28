package cn.bugstack.domain.strategy.model.vo;

import cn.bugstack.types.common.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 抽奖策略规则值对象，没用唯一ID，仅限于从数据库查询对象
 * @author: Merist
 * @create: 2025-07-15 11:45
 **/
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StrategyAwardRuleModelVO {
    private String ruleModels;
}
