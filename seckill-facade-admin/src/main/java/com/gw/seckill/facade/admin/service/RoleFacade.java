package com.gw.seckill.facade.admin.service;

import java.util.Set;

/**
　* @描述:     角色管理
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2018/1/12 15:05
  */
public interface RoleFacade {
    /**
    　* @描述:     根据角色编号得到权限字符串列表
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/1/12 15:11
      */
    Set<String> findPermissions(Long[] roleIds);
}
