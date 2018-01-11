package com.gw.seckill.web.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
　* @描述:     SpingBoot启动类
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2017/12/28 17:44
  */
@SpringBootApplication
@PropertySource(value = {"classpath:service.properties"})
@ComponentScan(basePackages = {"com.gw.seckill.common.web.exception","com.gw.seckill.web.admin.config"})
public class AdminWebApplication {
    public static void main(String [] args){
        SpringApplication.run(AdminWebApplication.class,args);
    }
}
