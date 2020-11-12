package com.sp.common.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/11 0:29
 */
@Getter
@Setter
@Accessors(chain = true)
public class ResultDTO<T> implements Serializable {
    private String code;
    private String msg;
    private String errorMsg;
    private T data;
    public ResultDTO(){
        this.code = CODE_SUCCESS;
    }
    public ResultDTO(String msg){
        this.msg = msg;
    }
    public ResultDTO(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public static final String CODE_SUCCESS = "200";
    public static final String CODE_ERROR = "500";
}
