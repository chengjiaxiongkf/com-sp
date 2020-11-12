package com.sp.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author v_jxjxcheng
 * @date 2020-11-12 10:44
 */
@SpringBootApplication
@EnableDiscoveryClient //这是一个nacos客户端
public class App {
    public static void main(String[] args) {
        new SpringApplication(App.class).run(args);
    }
}
