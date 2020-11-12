package com.sp.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author v_jxjxcheng
 * @date 2020-11-12 19:35
 */
@SpringBootApplication
@EnableFeignClients
public class App {
    public static void main(String[] args) {
        new SpringApplication(App.class).run(args);
    }
}
