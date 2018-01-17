package com.gw.seckill.facade.admin.service;

import com.gw.seckill.facade.admin.entity.SysResource;

import java.util.List;

/**
　* @描述:     资源管理服务接口
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2018/1/12 15:16
  */
public interface ResourceFacade {
    /**
     　* @描述:     删除资源
     　* @参数描述:
     　* @返回值:
     　* @异常:
     　* @作者:     gongwang
     　* @创建时间: 2018/1/10 22:10
     */
    void deleteSysResource(Long resID);
    /**
     　* @描述:     获取所有的资源
     　* @参数描述:
     　* @返回值:
     　* @异常:
     　* @作者:     gongwang
     　* @创建时间: 2018/1/9 21:30
     */
    List<SysResource> getAllResources();
    /**
     　* @描述:     添加资源
     　* @参数描述:
     　* @返回值:
     　* @异常:
     　* @作者:     gongwang
     　* @创建时间: 2018/1/10 16:21
     */
    void addSysRes(SysResource sysResource);
}
