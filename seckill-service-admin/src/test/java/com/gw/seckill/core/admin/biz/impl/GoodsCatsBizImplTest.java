package com.gw.seckill.core.admin.biz.impl;

import com.gw.seckill.core.admin.biz.GoodsCatsBiz;
import com.gw.seckill.facade.admin.entity.GoodsCats;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsCatsBizImplTest {

    @Autowired
    private GoodsCatsBiz goodsCatsBiz;
    @Test
    public void findGoodsCatsById() {
        GoodsCats goodsCats = goodsCatsBiz.findGoodsCatsById(1);
        System.out.print(goodsCats.getCatName());
    }
}