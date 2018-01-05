package com.gw.seckill.web.admin.controller;

import com.gw.seckill.common.web.exception.handler.WebGlobalExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
　* @描述:     用户登录，登出，验证Controller
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2018/1/5 16:13
  */
@Controller
public class UserController {

    //统一异常处理
    @Autowired
    private WebGlobalExceptionHandler webGlobalExceptionHandler;

    @RequestMapping("/user/login.do")
    public String toLogin(){
        return "login";
    }
}
