package com.gw.seckill.facade.admin.service;

import com.gw.seckill.facade.admin.entity.User;

import java.util.Set;

/**
　* @描述:     用户登录，权限管理
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2018/1/5 16:56
  */
public interface UserFacade {
    Set<String> findPermissions(String username);

    User findByAccount(String userName);
}
