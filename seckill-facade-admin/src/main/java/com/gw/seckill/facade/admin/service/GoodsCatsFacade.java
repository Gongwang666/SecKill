package com.gw.seckill.facade.admin.service;

import com.gw.seckill.facade.admin.entity.GoodsCats;
import com.gw.seckill.facade.admin.vo.GoodsCatsVO;

import java.util.List;
import java.util.Map;


/**
　* @描述:     商品分类管理接口
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2017/12/29 10:54
  */
public interface GoodsCatsFacade {
    /**
    　* @描述:     查找所有分类信息
    　* @参数描述: 
    　* @返回值:   List<GoodsCats>
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2017/12/29 10:58
      */
    GoodsCats findGoodsCatsById(Integer catId);

    /**
     　* @描述:     获取所有商品分类
     　* @参数描述:
     　* @返回值:    分类集合
     　* @异常:
     　* @作者:     gongwang
     　* @创建时间: 2017/12/29 19:33
     */
    List<GoodsCats> findAllGoodsCats();
    /**
    　* @描述:     获取所有商品的分类（分层后）
    　* @参数描述:
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2017/12/29 20:16
      */
    Map<GoodsCats,List<GoodsCatsVO>> getAllCatsWithLevel();
}
