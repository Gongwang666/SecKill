package com.gw.seckill.core.admin.biz;

import com.gw.seckill.core.admin.dao.SysUserMapper;
import com.gw.seckill.facade.admin.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


    public SysUser findByAccount(String userName) {
        return sysUserDAO.selectByUserName(userName);
    }
}
