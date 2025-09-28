package cn.bugstack.domain.award.repository;

import cn.bugstack.domain.award.model.aggregate.UserAwardRecordAggregate;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 奖品仓储服务
 * @author: Merist
 * @create: 2025-08-07 11:14
 **/
public interface IAwardRepository {
    void saveUserAwardRecord(UserAwardRecordAggregate userAwardRecordAggregate);
}
