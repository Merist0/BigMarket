package cn.bugstack.domain.activity.model.aggregate;

import cn.bugstack.domain.activity.model.entity.ActivityAccountDayEntity;
import cn.bugstack.domain.activity.model.entity.ActivityAccountEntity;
import cn.bugstack.domain.activity.model.entity.ActivityAccountMonthEntity;
import cn.bugstack.domain.activity.model.entity.UserRaffleOrderEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 参与活动订单聚合对象
 * @author: Merist
 * @create: 2025-08-06 10:58
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreatePartakeOrderAggregate {

    private String userId;

    private Long activityId;

    private ActivityAccountEntity activityAccountEntity;

    private boolean isExistAccountMonth = true;

    private boolean isExistAccountDay = true;

    private ActivityAccountDayEntity activityAccountDayEntity;

    private ActivityAccountMonthEntity activityAccountMonthEntity;

    private UserRaffleOrderEntity userRaffleOrderEntity;
}
