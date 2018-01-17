package com.gw.seckill.core.admin.biz;

import com.gw.seckill.facade.admin.entity.SysUser;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.Set;

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
        //Set<String> set = userBiz.findPermissionUrl("admin");
        //System.out.print(0);
    }

    @Test
    public void addSysUser(){
        SysUser sysUser = new SysUser();
        String username = "gongwang";
        String password = "123";
        sysUser.setUserName(username);
        sysUser.setPassWord(password);
        userBiz.addSysUser(sysUser);
    }
}