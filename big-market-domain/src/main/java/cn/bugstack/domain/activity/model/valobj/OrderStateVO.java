package cn.bugstack.domain.activity.model.valobj;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 订单状态枚举值对象（用于描述对象属性的值，如枚举，不影响数据库操作的对象，无生命周期）
 * @author: Merist
 * @create: 2025-07-30 11:54
 **/
@Getter
@AllArgsConstructor
public enum OrderStateVO {

    completed("completed","完成");

    private final String code;
    private final String info;
}
