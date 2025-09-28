package cn.bugstack.domain.award.service;

import cn.bugstack.domain.award.model.entity.UserAwardRecordEntity;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 奖品服务接口
 * @author: Merist
 * @create: 2025-08-07 10:35
 **/
public interface IAwardService {

    void saveUserAwardRecord(UserAwardRecordEntity userAwardRecordEntity);
}
