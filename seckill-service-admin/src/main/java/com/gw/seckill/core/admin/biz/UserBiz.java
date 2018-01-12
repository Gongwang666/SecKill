package com.gw.seckill.core.admin.biz;

import com.gw.seckill.core.admin.dao.SysUserMapper;
import com.gw.seckill.facade.admin.entity.SysUser;
import org.apache.commons.beanutils.ConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Set;

/**
　* @描述:     用户管理业务
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2018/1/5 16:58
  */
@Service("userBiz")
public class UserBiz {
    @Autowired
    private SysUserMapper sysUserDAO;

    @Autowired
    private RoleBiz roleBiz;

    public Set<String> findPermissions(String username) {
        SysUser sysUser =sysUserDAO.selectByUserName(username);
        if(sysUser == null) {
            return Collections.EMPTY_SET;
        }
        String[] roleIDs = sysUser.getRoleIds().split(",");
        Long[] ids =(Long[]) ConvertUtils.convert(roleIDs,Long.class);
        return roleBiz.findPermissions(ids);
    }

    public SysUser findByAccount(String userName) {
        return sysUserDAO.selectByUserName(userName);
    }
}
