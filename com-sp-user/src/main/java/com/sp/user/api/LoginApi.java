package com.sp.user.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author v_jxjxcheng
 * @date 2020-11-12 19:36
 */
@FeignClient("com-sp-login")
@Component
public interface LoginApi {
    @GetMapping("/login/testMethod")
    String testMethod();
}
