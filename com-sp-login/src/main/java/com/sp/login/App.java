package com.sp.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author v_jxjxcheng
 * @date 2020-11-12 10:44
 */
@SpringBootApplication(scanBasePackages = {"com.sp.login"})
public class App {
    public static void main(String[] args) {
        new SpringApplication(App.class).run(args);
    }
}
