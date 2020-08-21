package com.ld.cloud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 28415@hand-china.com 2020/08/16 11:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    /**
     * 不携带数据
     * @param code 结果编码
     * @param message 结果信息
     */
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}

