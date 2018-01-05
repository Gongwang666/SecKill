package com.gw.seckill.common.web.exception;

import com.gw.seckill.common.web.exception.enums.ExceptionEnum;

/**
　* @描述:     错误描述
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2018/1/5 14:41
  */
public class DescribeException extends  RuntimeException {
    private Integer code;

    /**
     * 继承exception，加入错误状态值
     * @param exceptionEnum
     */
    public DescribeException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMsg());
        this.code = exceptionEnum.getCode();
    }

    /**
     * 自定义错误信息
     * @param message
     * @param code
     */
    public DescribeException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
