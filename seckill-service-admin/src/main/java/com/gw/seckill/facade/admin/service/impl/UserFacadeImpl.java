package com.gw.seckill.facade.admin.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gw.seckill.facade.admin.entity.User;
import com.gw.seckill.facade.admin.service.UserFacade;

import java.util.Set;

@Service(version = "1.0.0")
public class UserFacadeImpl implements UserFacade {

    @Override
    public Set<String> findPermissions(String username) {
        return null;
    }

    @Override
    public User findByAccount(String userName) {
        return null;
    }
}
