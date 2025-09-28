package cn.bugstack.trigger.job;

import cn.bugstack.domain.task.model.entity.TaskEntity;
import cn.bugstack.domain.task.repository.ITaskRepository;
import cn.bugstack.domain.task.service.ITaskService;
import cn.bugstack.middleware.db.router.strategy.IDBRouterStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 发送MQ消息队列任务
 * @author: Merist
 * @create: 2025-08-07 14:39
 **/
@Slf4j
@Component()
public class SendMessageTaskJob {

    @Resource
    private ITaskService taskService;

    @Resource
    private ThreadPoolExecutor executor;

    @Resource
    private IDBRouterStrategy dbRouter;


    @Scheduled(cron = "0/5 * * * * ?")
    public void exec(){
        try {
            // 获取分库数量
            int dbCount = dbRouter.dbCount();

            for (int dbIdx = 1; dbIdx <= dbCount;dbIdx++){
                int finalDbIdx = dbIdx;
                executor.execute(() -> {
                    try {
                        dbRouter.setDBKey(finalDbIdx);
                        dbRouter.setTBKey(0);
                        List<TaskEntity> taskEntities = taskService.queryNoSendMessageTaskList();
                        if(taskEntities.isEmpty()) return;
                        // 发送MQ消息
                        for (TaskEntity taskEntity : taskEntities){
                            executor.execute(()->{
                                try {
                                    taskService.sendMessage(taskEntity);
                                    taskService.updateTaskSendMessageCompleted(taskEntity.getUserId(),taskEntity.getMessageId());
                                }catch (Exception e){
                                    log.error("定时任务，发送MQ消息失败 userId:{} topic:{}",taskEntity.getUserId(),taskEntity.getTopic());
                                    taskService.updateTaskSendMessageFail(taskEntity.getUserId(),taskEntity.getMessageId());
                                }
                            });
                        }
                    }finally {
                        dbRouter.clear();
                    }
                });
            }
        }catch (Exception e){
            log.error("定时任务，扫描MQ任务表发送消息失败",e);
        }
    }
}
