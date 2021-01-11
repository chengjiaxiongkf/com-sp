package com.sp.login.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Component;

/**
 * @Author chengjiaxiong
 * @Date 2021/1/11 23:53
 */
@Component
public class KafkaListener {
    // 消费监听
    @org.springframework.kafka.annotation.KafkaListener(topics = {"noKeyMsg"})
    public void onMessage1(ConsumerRecord<?, ?> record){
        // 消费的哪个topic、partition的消息,打印出消息内容
        System.out.println("简单消费："+record.topic()+"-"+record.partition()+"-"+record.value());
    }
}
