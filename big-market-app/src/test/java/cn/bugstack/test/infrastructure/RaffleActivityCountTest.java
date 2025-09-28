package cn.bugstack.test.infrastructure;

import cn.bugstack.infrastructure.persistent.dao.IRaffleActivityCountDao;
import cn.bugstack.infrastructure.persistent.po.RaffleActivityCount;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 商品次数测试
 * @author: Merist
 * @create: 2025-07-30 11:43
 **/
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class RaffleActivityCountTest {

    @Resource
    private IRaffleActivityCountDao raffleActivityCountDao;

    @Test
    public void test_queryActivityCountByActivityCountId(){
        RaffleActivityCount raffleActivityCount = raffleActivityCountDao.queryRaffleActivityCountByActivityCountId(11101L);
        log.info("测试结果：{}", JSON.toJSONString(raffleActivityCount));
    }
}
