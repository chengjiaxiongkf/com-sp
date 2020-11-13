package com.sp.login;

import com.sp.login.listener.RegisterBeanEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * @author v_jxjxcheng
 * @date 2020-11-12 10:44
 */
@SpringBootApplication
@EnableDiscoveryClient //这是一个nacos客户端
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =  new SpringApplication(App.class).run(args);

//        new RegisterBeanEvent(applicationContext, registerBeanEvent -> {
//            ApplicationContext application = registerBeanEvent.getApplicationContext();
//            log.info("------------------form RegisterBeanListener------------------");
//            log.info(String.format("------------------bean totle:%s------------------", application.getBeanDefinitionCount()));
//            String[] beans = application.getBeanDefinitionNames();
//            Arrays.stream(beans).forEach(beanName-> log.info(String.format("------------------[%s]------------------", beanName)));
//        });
    }
}
