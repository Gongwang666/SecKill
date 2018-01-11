package com.gw.seckill.facade.admin.service;

import com.gw.seckill.facade.admin.entity.SysUser;

import java.util.List;
import java.util.Set;

/**
　* @描述:     用户登录，权限管理
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2018/1/5 16:56
  */
public interface UserFacade {
    Set<String> findPermissions(String username);

    /**
    　* @描述:     通过用户名查找账户
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/1/11 17:03
      */
    SysUser findByAccount(String userName);

    List<String> findPermissionUrl(String s);
}
