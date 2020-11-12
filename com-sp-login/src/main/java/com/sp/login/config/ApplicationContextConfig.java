package com.sp.login.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 上下文配置
 * @author v_jxjxcheng
 * @date 2020-11-12 16:26
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * 轮询负载均衡
     * @return RestTemplate
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
