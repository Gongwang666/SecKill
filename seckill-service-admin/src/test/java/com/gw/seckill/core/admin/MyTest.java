package com.gw.seckill.core.admin;

import com.gw.seckill.core.admin.dao.TestMapper;
import com.gw.seckill.facade.admin.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest{
    @Autowired
    private TestMapper testMapper;
    @Test
    public void test(){
        SysUser sysUser =testMapper.selectByPrimaryKey((long)1);
        
        System.out.print(0);
    }

}
