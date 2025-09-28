package cn.bugstack.domain.activity.event;

import cn.bugstack.types.event.BaseEvent;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @program: big-market-231202-xfg-init-project
 * @description: 活动sku库存清空信息
 * @author: Merist
 * @create: 2025-08-02 17:54
 **/
@Component
public class ActivitySkuStockZeroMessageEvent extends BaseEvent<Long> {


    @Value("${spring.rabbitmq.topic.activity_sku_stock_zero}")
    private String topic;

    @Override
    public EventMessage<Long> buildEventMessage(Long sku) {
        return EventMessage.<Long>builder()
                .id(RandomStringUtils.randomNumeric(11))
                .timestamp(new Date())
                .data(sku)
                .build();
    }

    @Override
    public String topic() {
        return topic;
    }
}
