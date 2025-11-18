package cn.bugstack.trigger.api;

import cn.bugstack.trigger.api.dto.ActivityDrawRequestDTO;
import cn.bugstack.trigger.api.dto.ActivityDrawResponseDTO;
import cn.bugstack.types.model.Response;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 抽奖活动服务
 * @author: Merist
 * @create: 2025-09-28 13:41
 **/
public interface IRaffleActivityService {

    /**
     * 活动装配，数据预热缓存
     * @param activityId
     * @return
     */
    Response<Boolean> armory(Long activityId);

    /**
     * 活动抽奖接口
     * @param request
     * @return
     */
    Response<ActivityDrawResponseDTO> draw(ActivityDrawRequestDTO request);
}
