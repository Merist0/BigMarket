package cn.bugstack.domain.activity.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 用户抽奖订单状态枚举
 * @author: Merist
 * @create: 2025-08-06 10:24
 **/
@Getter
@AllArgsConstructor
public enum UserRaffleOrderStateVO {

    create("create","创建"),
    used("used","已使用"),
    cancel("cancel","已作废"),
    ;

    private final String code;
    private final String info;
}
