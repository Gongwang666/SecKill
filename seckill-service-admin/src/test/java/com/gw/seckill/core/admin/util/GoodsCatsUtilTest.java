package com.gw.seckill.core.admin.util;

import com.gw.seckill.facade.admin.entity.GoodsCats;
import com.gw.seckill.facade.admin.vo.GoodsCatsVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsCatsUtilTest {
    //@Autowired
    private GoodsCatsUtil goodsCatsUtil = new GoodsCatsUtil();
    @Test
    public void getGoodsCatsTree() {
        //Map<GoodsCats,List<GoodsCatsVO>> map =goodsCatsUtil.getAllCatsWithLevel();
        System.out.print(0);
    }
}