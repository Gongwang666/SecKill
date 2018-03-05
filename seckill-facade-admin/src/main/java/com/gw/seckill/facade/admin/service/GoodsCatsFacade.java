package com.gw.seckill.facade.admin.service;

import com.gw.seckill.facade.admin.entity.GoodsCats;

import java.util.List;


/**
　* @描述:     商品分类管理接口
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2017/12/29 10:54
  */
public interface GoodsCatsFacade {
    /**
    　* @描述:     获取所有的商品分类信息
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/3/5 20:43
      */
    List<GoodsCats> getAllGoodCats();

    /**
    　* @描述:     获取商品分类树形结构
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/3/5 20:49
      */
    List<GoodsCats> getGoodsCatsTree();
}
