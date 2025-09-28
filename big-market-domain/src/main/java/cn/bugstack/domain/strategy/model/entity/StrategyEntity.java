package cn.bugstack.domain.strategy.model.entity;

import cn.bugstack.types.common.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 策略实体
 * @author: Merist
 * @create: 2025-07-10 15:40
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StrategyEntity {
    /** 抽奖策略id */
    private String strategyId;
    /** 抽奖策略描述 */
    private String strategyDesc;
    /** 抽奖规则模型 */
    private String ruleModels;

    public String[] ruleModels(){
        if(StringUtils.isBlank(ruleModels)) return null;
        return ruleModels.split(Constants.SPLIT);
    }

    public String getRuleWeight(){
        String[] ruleModels = this.ruleModels();
        if(ruleModels == null) return null;
        for(String ruleModel : ruleModels){
            if("rule_weight".equals(ruleModel)) return ruleModel;
        }
        return null;
    }
}
