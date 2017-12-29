package com.gw.seckill.web.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/index.do")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/category.do")
    public String toCategory(){
        return "/category/category";
    }
}
