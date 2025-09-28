package cn.bugstack.test.domain.strategy;

import cn.bugstack.domain.strategy.service.IRaffleStrategy;
import cn.bugstack.domain.strategy.service.armory.IStrategyArmory;
import cn.bugstack.domain.strategy.service.rule.chain.ILogicChain;
import cn.bugstack.domain.strategy.service.rule.chain.factory.DefaultChainFactory;
import cn.bugstack.domain.strategy.service.rule.chain.impl.RuleWeightLogicChain;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;

import javax.annotation.Resource;

/**
 * @program: big-market-231202-xfg-init-project
 * @description:
 * @author: Merist
 * @create: 2025-07-17 11:20
 **/
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class LogicChainTest {
    @Resource
    private DefaultChainFactory defaultChainFactory;

    @Resource
    private IStrategyArmory strategyArmory;


    @Resource
    private RuleWeightLogicChain ruleWeightLogicChain;

    @Before
    public void setUp(){
        // 策略装配 100001、100002、100003
        log.info("测试结果：{}",strategyArmory.assembleLotteryStrategy(100001L));
        log.info("测试结果：{}",strategyArmory.assembleLotteryStrategy(100002L));
        log.info("测试结果：{}",strategyArmory.assembleLotteryStrategy(100003L));
    }

    @Test
    public void test_logicChain_rule_blacklist(){
        ILogicChain logicChain = defaultChainFactory.openLogicChain(100001L);
        DefaultChainFactory.StrategyAwardVO strategyAwardVO = logicChain.logic("user001", 100001L);
        log.info("测试结果：{}", JSON.toJSONString(strategyAwardVO));
    }

    @Test
    public void test_logicChain_rule_weight(){
        // 通过反射 mock 规则中的值
        ReflectionTestUtils.setField(ruleWeightLogicChain,"userScore",4900L);

        ILogicChain logicChain = defaultChainFactory.openLogicChain(100001L);
        DefaultChainFactory.StrategyAwardVO strategyAwardVO = logicChain.logic("user001", 100001L);
        log.info("测试结果：{}", JSON.toJSONString(strategyAwardVO));
    }

    @Test
    public void test_logicChain_rule_default(){
        ILogicChain logicChain = defaultChainFactory.openLogicChain(100001L);
        DefaultChainFactory.StrategyAwardVO strategyAwardVO = logicChain.logic("user001", 100001L);
        log.info("测试结果：{}", JSON.toJSONString(strategyAwardVO));
    }
}
