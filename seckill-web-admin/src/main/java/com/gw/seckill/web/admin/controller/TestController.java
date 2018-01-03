package com.gw.seckill.web.admin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gw.seckill.facade.admin.entity.GoodsCats;
import com.gw.seckill.facade.admin.service.GoodsCatsFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Reference(version = "1.0.0")
    private GoodsCatsFacade goodsCatsFacade;

    @RequestMapping("/index.do")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/category.do")
    public String toCategory(Model model){
        List<GoodsCats> goodsCatsList = goodsCatsFacade.findAllGoodsCats();
        model.addAttribute("goodsCats",goodsCatsList);
        return "/category/category";
    }

    @RequestMapping("/login.do")
    public String toLogin(){
        return "login";
    }

    @ResponseBody
    @RequestMapping("/getAllCats.do")
    public void getAllCats(Model model){
        //model.addAttribute("")
    }

    @ResponseBody
    @RequestMapping("/addCat.do")
    public String addCat(@RequestBody GoodsCats goodsCats, Model model){
        //model.addAttribute("")
        if(goodsCats != null){
            goodsCatsFacade.addGoodsCat(goodsCats);
            return "成功";
        }
        return "失败";
    }

}
