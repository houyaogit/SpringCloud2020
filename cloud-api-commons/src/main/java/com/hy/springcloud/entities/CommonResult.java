package com.hy.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：hy
 * @description：TODO
 * @date ：2020/10/26 23:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    //TODO lombok 为什么没生效
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
