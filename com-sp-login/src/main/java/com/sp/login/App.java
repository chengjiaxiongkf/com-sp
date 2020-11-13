package com.sp.login;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author v_jxjxcheng
 * @date 2020-11-12 10:44
 */
@SpringBootApplication(scanBasePackages = {"com.sp.login"})
@EnableDiscoveryClient //这是一个nacos客户端
@Slf4j
public class App {
    public static void main(String[] args) {
        new SpringApplication(App.class).run(args);
    }
}
