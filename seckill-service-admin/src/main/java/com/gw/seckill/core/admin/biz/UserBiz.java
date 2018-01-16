package com.gw.seckill.core.admin.biz;

import com.gw.seckill.core.admin.dao.SysUserMapper;
import com.gw.seckill.facade.admin.entity.SysResource;
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
    @Autowired
    private ResourceBiz resourceBiz;

    /**
    　* @描述:     通过用户名查找用户权限
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/1/16 18:43
      */
    public Set<String> findPermissions(String username) {
        Long[] ids = findUserRoleIDs(username);
        if(ids == null) {
            return Collections.EMPTY_SET;
        }
        Set<Long> resourceIDs = roleBiz.findRoleResourceIDs(ids);
        return resourceBiz.findPermissions(resourceIDs);
    }
    /**
    　* @描述:     通过用户名查找用户信息
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/1/16 18:43
      */
    public SysUser findByAccount(String userName) {
        return sysUserDAO.selectByUserName(userName);
    }
    /**
     　* @描述:     查找用户所拥有的角色id
     　* @参数描述:
     　* @返回值:
     　* @异常:
     　* @作者:     gongwang
     　* @创建时间: 2018/1/16 18:21
     */
    public Long[] findUserRoleIDs(String userName) {
        SysUser sysUser =sysUserDAO.selectByUserName(userName);
        if(sysUser == null) {
            return null;
        }
        String[] roleIDs = sysUser.getRoleIds().split(",");
        Long[] ids =(Long[]) ConvertUtils.convert(roleIDs,Long.class);
        return  ids;
    }
    /**
    　* @描述:     通过用户名查找用户可以访问的URL集合
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/1/16 18:44
      */
    public Set<String> findPermissionUrl(String userName) {
        Long[] ids = findUserRoleIDs(userName);
        if(ids == null) {
            return Collections.EMPTY_SET;
        }
        Set<Long> resourceIDs = roleBiz.findRoleResourceIDs(ids);
        Set<String> sysResourceSet =resourceBiz.findResourceURLs(resourceIDs);
        return sysResourceSet;
    }
}
