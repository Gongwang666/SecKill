package com.gw.seckill.web.admin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.gw.seckill.common.web.exception.pojo.Result;
import com.gw.seckill.facade.admin.entity.Goods;
import com.gw.seckill.facade.admin.service.GoodsFacade;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
　* @描述:     商品信息管理Controller
　* @参数描述: 
　* @返回值:
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2018/3/7 10:30
  */
@Controller
public class GoodsController {
    @Reference(version = "1.0.0")
    private GoodsFacade goodsFacade;

    @RequiresPermissions("goodsInfo:view")
    @RequestMapping("/goods/goodsInfo/view")
    public String showAllGoods(@RequestParam Integer page, Model model){
        Goods goods = new Goods();
        goods.setPage(page);
        goods.setRows(16);
        PageInfo<Goods> pageInfo = goodsFacade.getAllGoodsPaged(goods);
        model.addAttribute("pageInfo",pageInfo);
        return "/goods/goods";
    }

    @RequiresPermissions("goodsInfo:create")
    @RequestMapping("/goods/goodsInfo/create")
    public String addGoodsPage(){

        return "/goods/add_goods_page";
    }

    @RequiresPermissions("goodsInfo:create")
    @RequestMapping("/goods/goodsInfo/create.do")
    @ResponseBody
    public Result addGoods(@RequestBody Goods goods){
        Result result = new Result();
        if(goods != null){

        }
        result.setStatus(-1);
        result.setMsg("添加失败");
        return result;
    }


}
