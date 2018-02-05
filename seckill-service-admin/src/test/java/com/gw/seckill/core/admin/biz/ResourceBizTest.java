package com.gw.seckill.core.admin.biz;

import com.gw.seckill.facade.admin.entity.SysResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ResourceBizTest {
    @Autowired
    private ResourceBiz resourceBiz;
    @Test
    public void getAllResourcesPaged() {
        SysResource sysResource = new SysResource();
        sysResource.setRows(10);
        List<SysResource> list = resourceBiz.getAllResourcesPaged(sysResource);
        sysResource.setPage(2);
        List<SysResource> list2 = resourceBiz.getAllResourcesPaged(sysResource);
        sysResource.setPage(3);
        List<SysResource> list3 = resourceBiz.getAllResourcesPaged(sysResource);
        System.out.print(0);
    }
}
