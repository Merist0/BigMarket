package cn.bugstack.test.infrastructure;

import cn.bugstack.infrastructure.persistent.dao.IRaffleActivitySkuDao;
import cn.bugstack.infrastructure.persistent.po.RaffleActivitySku;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 商品sku 测试
 * @author: Merist
 * @create: 2025-07-30 11:38
 **/
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class RaffleActivitySkuTest {

    @Resource
    private IRaffleActivitySkuDao raffleActivitySkuDao;

    @Test
    public void test_queryActivitySku(){
        RaffleActivitySku raffleActivitySku = raffleActivitySkuDao.queryActivitySku(9011L);
        log.info("测试结果：{}", JSON.toJSONString(raffleActivitySku));
    }
}
