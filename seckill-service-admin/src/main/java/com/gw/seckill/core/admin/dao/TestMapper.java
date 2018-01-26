package com.gw.seckill.core.admin.dao;

import com.gw.seckill.core.admin.util.BaseMapper;
import com.gw.seckill.facade.admin.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("testMapper")
@Mapper
public interface TestMapper extends BaseMapper<SysUser> {
}
