package com.sp.login.controller;

import com.sp.common.dto.ResultDTO;
import com.sp.common.dto.ResultPageDTO;
import com.sp.common.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author v_jxjxcheng
 * @date 2020-11-12 11:01
 */
@RestController
@RequestMapping(value = "/login")
public class loginController {
    @GetMapping("/testMethod")
    public String testMethod(){
        return "这是一个nacos客户端";
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
