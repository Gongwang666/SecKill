package com.gw.seckill.core.admin.biz;

import com.gw.seckill.facade.admin.vo.GoodsCatsVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsCatsBizTest {

    @Autowired
    private GoodsCatsBiz goodsCatsBiz;
    @Test
    public void findGoodsCatsById() {
    }

    @Test
    public void findAllGoodsCats() {
    }

    @Test
    public void getAllGoodsCats() {
        Map<String, List<GoodsCatsVO>> map = goodsCatsBiz.getAllGoodsCats();
        System.out.print(0);
    }
}