package com.sp.common.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/15 23:49
 */
@Getter
@Setter
@Accessors(chain = true)
public class ResultPageDTO<T> extends ResultDTO<T> {
    public ResultPageDTO(){
        super();
    }
    public ResultPageDTO(T t, long total){
        this.data = t;
        this.total = total;
    }
    private long total;
    private T data;
    private int startSize;
    private int endSize;
}
