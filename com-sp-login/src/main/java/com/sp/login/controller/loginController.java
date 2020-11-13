package com.sp.login.controller;

import com.sp.common.dto.ResultDTO;
import com.sp.common.dto.ResultPageDTO;
import com.sp.common.dto.UserDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

/**
 * @author v_jxjxcheng
 * @date 2020-11-12 11:01
 */
@RefreshScope
@RestController
@RequestMapping(value = "/login")
public class loginController {

    @Value("${server.port}")
    private String port;

    @Value("${datasource.url}")
    private String url;

    @Value("${log}")
    private String log;

    @Value("${redis}")
    private String redis;

    @GetMapping("/testMethod")
    public String testMethod(){
        return "这是一个nacos客户端."+port+".动态刷新配置datasourceUrl:"+url+".动态刷新配置:"+log+".redis:"+redis;
    }

    @PostMapping("/sign")
    public ResultDTO<UserDTO> sign(@RequestParam("mobile") String mobile, @RequestParam("passWord") String passWord){
        UserDTO userDTO = new UserDTO();
        userDTO.setMobile(mobile);
        userDTO.setPassWord(passWord);
        return new ResultDTO<UserDTO>("123").setData(userDTO);
    }

    @GetMapping("/loginList")
    public ResultPageDTO<UserDTO> login(@RequestParam("mobile") String mobile, @RequestParam("passWord") String passWord){
        UserDTO userDTO = new UserDTO();
        userDTO.setMobile(mobile);
        userDTO.setPassWord(passWord);
        return new ResultPageDTO<UserDTO>().setData(userDTO);
    }
}
