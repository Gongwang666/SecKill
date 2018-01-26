package com.gw.seckill.core.admin.biz;

import com.gw.seckill.facade.admin.entity.SysResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ResourceBizTest {
    @Autowired
    private ResourceBiz resourceBiz;
    @Test
    public void updateResources() {
        SysResource sysResource = new SysResource();

    }
}