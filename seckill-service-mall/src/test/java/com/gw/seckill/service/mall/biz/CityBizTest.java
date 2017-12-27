package com.gw.seckill.service.mall.biz;

import com.gw.seckill.facade.mall.entity.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CityBizTest {

    @Autowired
    private CityBiz cityBiz;
    @Test
    public void findCityByName() {
        City city = cityBiz.findCityByName("温岭市");
        System.out.print(city.toString());
    }
}