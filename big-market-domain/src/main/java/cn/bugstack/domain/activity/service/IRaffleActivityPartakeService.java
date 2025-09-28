package cn.bugstack.domain.activity.service;

import cn.bugstack.domain.activity.model.entity.PartakeRaffleActivityEntity;
import cn.bugstack.domain.activity.model.entity.UserRaffleOrderEntity;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 抽奖活动参与服务
 * @author: Merist
 * @create: 2025-08-06 09:47
 **/
public interface IRaffleActivityPartakeService {

    /**
     * 创建抽奖单:用户参与抽奖活动、扣减活动账户库存，产生抽奖单。如存在未被使用的抽奖单则直接返回已存在的抽奖单
     */
    UserRaffleOrderEntity createOrder(PartakeRaffleActivityEntity partakeRaffleActivityEntity);
}
