package com.gw.seckill.facade.admin.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gw.seckill.core.admin.biz.UserBiz;
import com.gw.seckill.facade.admin.entity.SysUser;
import com.gw.seckill.facade.admin.service.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

@Service(version = "1.0.0")
public class UserFacadeImpl implements UserFacade {
    @Autowired
    private UserBiz userBiz;
    @Override
    public Set<String> findPermissions(String username) {
        return null;
    }

    @Override
    public SysUser findByAccount(String userName) {
        return userBiz.findByAccount(userName);
    }

    @Override
    public List<String> findPermissionUrl(String s) {
        return null;
    }
}
