package com.gw.seckill.facade.admin.service;

import com.gw.seckill.facade.admin.entity.SysRole;

import java.util.List;
import java.util.Set;

/**
　* @描述:     角色管理
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2018/1/12 15:05
  */
public interface RoleFacade {
    /**
    　* @描述:     根据角色编号得到资源ID列表
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/1/12 15:11
      */
    Set<Long> findRoleResourceIDs(Long[] roleIds);
    /**
     * 类名:
     * 参数: 
     * 描述: 获取所有角色
     * 作者: gongwang
     * 日期: 2018/1/26
     * 时间: 下午4:29
     **/
    List<SysRole> getAllRoles();
}
