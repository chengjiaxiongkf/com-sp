package com.sp.login.listener;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationContext;

/**
 * @author v_jxjxcheng
 * @date 2020-11-13 9:59
 */
@Getter
@Setter
public class RegisterBeanEvent {
    private RegisterBeanListener registerBeanListener;
    private ApplicationContext applicationContext;

    public RegisterBeanEvent(ApplicationContext applicationContext,RegisterBeanListener registerBeanListener){
        this.applicationContext = applicationContext;
        this.registerBeanListener = registerBeanListener;
        this.registerBeanListener.showListBean(this);
    }
}
