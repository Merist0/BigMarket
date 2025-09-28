package cn.bugstack.domain.activity.model.entity;

import lombok.Data;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 参与抽奖活动实体对象
 * @author: Merist
 * @create: 2025-08-06 10:01
 **/
@Data
public class PartakeRaffleActivityEntity {
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 活动ID
     */
    private Long activityId;
}
