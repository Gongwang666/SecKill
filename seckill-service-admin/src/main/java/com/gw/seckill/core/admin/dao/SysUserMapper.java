package com.gw.seckill.core.admin.dao;

import com.gw.seckill.facade.admin.entity.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long sysUserId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long sysUserId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}