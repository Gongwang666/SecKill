package com.gw.seckill.facade.admin.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gw.seckill.core.admin.biz.RoleBiz;
import com.gw.seckill.facade.admin.service.RoleFacade;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

/**
　* @描述:     角色管理dubbo实现
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2018/1/12 15:07
  */
@Service(version = "1.0.0")
public class RoleFacadeImpl implements RoleFacade {
    @Autowired
    private RoleBiz roleBiz;

    @Override
    public Set<String> findPermissions(Long[] roleIds) {
        return roleBiz.findPermissions(roleIds);
    }
}
