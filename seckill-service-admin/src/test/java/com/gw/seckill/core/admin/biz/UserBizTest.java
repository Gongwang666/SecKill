package com.gw.seckill.core.admin.biz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserBizTest {
    @Autowired
    private UserBiz userBiz;
    @Test
    public void findPermissions() {
    }

    @Test
    public void findByAccount() {
    }

    @Test
    public void findUserRoleIDs() {
    }

    @Test
    public void findPermissionUrl() {
        Set<String> set = userBiz.findPermissionUrl("admin");
        System.out.print(0);
    }
}