package cn.bugstack.test.domain.strategy;

import cn.bugstack.domain.strategy.service.armory.IStrategyArmory;
import cn.bugstack.domain.strategy.service.armory.IStrategyDispatch;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @program: big-market-231202-xfg-init-project
 * @description:
 * @author: Merist
 * @create: 2025-07-10 13:35
 **/
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyArmoryDispatchTest {
    @Resource
    private IStrategyArmory strategyArmory;
    @Resource
    private IStrategyDispatch strategyDispatch;

    @Before
    public void test_strategyArmory(){
        boolean success = strategyArmory.assembleLotteryStrategy(100001L);
        log.info("测试结果：{}",success);
    }

    @Test
    public void test_getAssembleRandomVal(){
        log.info("测试结果：{} - 奖品ID值", strategyDispatch.getRandomAwardId(100001L));
    }

    /**
     *  根据策略ID+权重值，从装配的策略中随机获取奖品ID值
     *  4000:102,103,104,105 5000:102,103,104,105,106,107 6000:102,103,104,105,106,107,108,109
     */
    @Test
    public void test_getRandomAwardId_ruleWeightValue(){
        log.info("测试结果：{} - 4000策略配置", strategyDispatch.getRandomAwardId(100001L,"4000:102,103,104,105"));
        log.info("测试结果：{} - 5000策略配置", strategyDispatch.getRandomAwardId(100001L,"5000:102,103,104,105,106,107"));
        log.info("测试结果：{} - 6000策略配置", strategyDispatch.getRandomAwardId(100001L,"6000:102,103,104,105,106,107,108,109"));
    }
}
