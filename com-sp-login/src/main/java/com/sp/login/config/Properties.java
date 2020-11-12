package com.sp.login.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author v_jxjxcheng
 * @date 2020-11-12 19:24
 */
@Component
@ConfigurationProperties(prefix ="spring")   //告诉springboot与配置文件中的哪个属性进行映射
public class Properties {

}
