package com.sp.user.controller;

import com.sp.common.dto.ResultDTO;
import com.sp.user.api.LoginApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author v_jxjxcheng
 * @date 2020-11-12 19:32
 */
@RestController
@RequestMapping(value="user")
@Slf4j
public class UserController {

    @Autowired
    private LoginApi loginApi;

    @Value("${spring.kafka.bootstrap-servers}")
    private String kafkaConfig;

    @GetMapping("/getKafkaConfig")
    public String getKafkaConfig(){
        return "kafkaConfig:"+kafkaConfig;
    }

    @GetMapping("/testMethod")
    public String testMethod(){
        return "我从用户调用登录服务->"+loginApi.testMethod();
    }
    @Autowired
    private KafkaTemplate kafkaTemplate;
    // 发送消息
    @GetMapping("/kafka/sendMsg/{message}")
    public ResultDTO sendMessage1(@PathVariable("message") String normalMessage) {
        log.info("send msg for kafka:"+normalMessage);
        kafkaTemplate.send("noKeyMsg", normalMessage);
        return new ResultDTO("成功");
    }
}
