package com.gw.seckill.web.admin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.gw.seckill.common.web.exception.pojo.Result;
import com.gw.seckill.common.web.fastdfs.utils.FastDFSClientWrapper;
import com.gw.seckill.facade.admin.entity.Goods;
import com.gw.seckill.facade.admin.entity.GoodsImg;
import com.gw.seckill.facade.admin.service.GoodsFacade;
import com.gw.seckill.facade.admin.service.GoodsImgFacade;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

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
    @Reference(version = "1.0.0")
    private GoodsImgFacade goodsImgFacade;
    @Autowired
    private FastDFSClientWrapper dfsClient;

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
    /**
    　* @描述:     跳转到商品图片管理页面
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/3/15 19:06
      */
    @RequiresPermissions("goodsInfo:view")
    @RequestMapping("/goods/goodsInfo/imgManage")
    public String goodsImgsPage(@RequestParam Long id,Model model){
        model.addAttribute("goodsID",id);
        return "/goods/goods_img_manager";
    }

    @RequiresPermissions("goodsInfo:create")
    @RequestMapping("/goods/goodsInfo/uploadFile.do")
    @ResponseBody
    public Result uploadImg(@RequestBody MultipartFile file,Long goodsID) throws Exception{
        Result result = new Result();
        if(file != null && goodsID != null){
            GoodsImg goodsImg = new GoodsImg();
            String imgUrl = dfsClient.uploadFile(file);
            goodsImg.setGoodsID(goodsID);
            goodsImg.setImgUrl(imgUrl);
            goodsImg.setUploadDate(new Date());

            int row = goodsImgFacade.addImg(goodsImg);
            if(row == 1){
                result.setStatus(0);
                result.setMsg("上传成功!");
                return result;
            }

        }
        result.setStatus(-1);
        result.setMsg("上传失败!");
        return result;
    }

}
