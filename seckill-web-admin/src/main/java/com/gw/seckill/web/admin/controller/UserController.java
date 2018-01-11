package com.gw.seckill.web.admin.controller;

import com.gw.seckill.common.web.exception.enums.ExceptionEnum;
import com.gw.seckill.common.web.exception.handler.WebGlobalExceptionHandler;
import com.gw.seckill.facade.admin.entity.SysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/user/login")
    public String toLogin(){
        return "login";
    }
    /**
    　* @描述:     登录操作
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/1/11 18:34
      */
    @RequestMapping("/user/login.do")
    public String login(SysUser sysUser){
        if(sysUser == null){
            webGlobalExceptionHandler.exceptionGet(new Exception(ExceptionEnum.USER_LOGIN_ERROR.getMsg()));
        }
        String account = sysUser.getUserName();
        String password = sysUser.getPassWord();
        UsernamePasswordToken token = new UsernamePasswordToken(account, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            webGlobalExceptionHandler.exceptionGet(new Exception(ExceptionEnum.USER_NOT_FIND.getMsg()));
        }
        return "redirect:/index.do";
    }
}
