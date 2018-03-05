package com.gw.seckill.core.admin.biz;

import com.gw.seckill.facade.admin.entity.GoodsCats;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsCatsBizTest {
    @Autowired
    private GoodsCatsBiz goodsCatsBiz;
    @Test
    public void getAllGoodCats() {
    }

    @Test
    public void getGoodsCatsTree() {
        List<GoodsCats> list = goodsCatsBiz.getGoodsCatsTree();
        System.out.print(0);
    }
}
