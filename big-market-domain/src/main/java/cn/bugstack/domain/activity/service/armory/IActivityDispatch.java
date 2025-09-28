package cn.bugstack.domain.activity.service.armory;

import java.util.Date;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 活动调度【扣减库存】
 * @author: Merist
 * @create: 2025-08-02 16:49
 **/
public interface IActivityDispatch {
    /**
     * 根据策略I0和奖品ID,扣减奖品缓存库存
     * paran sku 互动SKU
     * @paran endDateTime 活动结束时间，根据结束时间设置加锁的key为结束时间
     * @retura 扣减结果
     */
    boolean subtractActivitySkuStock(Long sku, Date endDateTime);

}
