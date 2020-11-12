package com.sp.user.controller;

import com.sp.user.api.LoginApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author v_jxjxcheng
 * @date 2020-11-12 19:32
 */
@RestController
@RequestMapping(value="user")
public class UserController {

    @Autowired
    private LoginApi loginApi;

    @GetMapping("/testMethod")
    public String testMethod(){
        return "我从用户调用登录服务->"+loginApi.testMethod();
    }
}
