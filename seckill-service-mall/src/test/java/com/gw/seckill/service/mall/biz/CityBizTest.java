package com.gw.seckill.service.mall.biz;

import com.gw.seckill.facade.mall.entity.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
/**
　* @描述:     ${todo}
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2017/12/28 14:14
  */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CityBizTest {

    @Autowired
    private CityBiz cityBiz;
    
    @Test
    /**
    　* @描述:     ${todo}
    　* @参数描述:
    　* @返回值:   java.lang.String
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2017/12/28 14:11
      */
    public void findCityByName() {
        City city = cityBiz.findCityByName("温岭市");
        System.out.print(city.toString());
    }
}