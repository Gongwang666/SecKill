package com.gw.seckill.web.boss.controller;

import com.gw.seckill.facade.mall.entity.City;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CityController {

    @RequestMapping("/cityPage")
    public ModelAndView getCity(){
        ModelAndView modelAndView = new ModelAndView();
        City city = new City();
        city.setCityName("银川");
        modelAndView.setViewName("/city");
        modelAndView.addObject("city",city);
        return  modelAndView;
    }

    @RequestMapping("/getValue")
    public City getValue(){
        City city = new City();
        city.setCityName("银川");
        return  city;
    }
}
