package cn.bugstack.domain.activity.service;

import cn.bugstack.domain.activity.model.valobj.ActivitySkuStockKeyVO;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 活动sku库存处理接口
 * @author: Merist
 * @create: 2025-08-05 11:31
 **/
public interface IRaffleActivitySkuStockService {

    /**
     * 获取活动sku库存消耗队列
     */
    ActivitySkuStockKeyVO takeQueueValue() throws InterruptedException;

    /**
     * 清空队列
     */
    void clearQueueValue();

    /**
     * 延迟队列+任务驱使更新活动sku库存
     */
    void updateActivitySkuStock(Long sku);

    /**
     * 缓存库存已消耗完毕，清空数据库库存
     */
    void clearActivitySkuStock(Long sku);
}
