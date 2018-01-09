package com.gw.seckill.core.admin.biz;

import com.gw.seckill.facade.admin.vo.MenuTreeVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MenuBizTest {
    @Autowired
    private MenuBiz menuBiz;
    @Test
    public void getMenuTree() {
        List<MenuTreeVO> list = menuBiz.getMenuTree();
        System.out.print(0);
    }
}