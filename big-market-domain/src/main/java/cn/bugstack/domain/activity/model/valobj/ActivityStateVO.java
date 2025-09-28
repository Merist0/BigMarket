package cn.bugstack.domain.activity.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 活动状态值对象
 * @author: Merist
 * @create: 2025-07-30 11:54
 **/
@Getter
@AllArgsConstructor
public enum ActivityStateVO {

    create("create","创建"),
    open("open","开启"),
    close("close","关闭");

    private final String code;
    private final String desc;
}
