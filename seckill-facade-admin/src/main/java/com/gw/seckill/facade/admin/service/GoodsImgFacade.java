package com.gw.seckill.facade.admin.service;
import com.gw.seckill.facade.admin.entity.GoodsImg; /**
　* @描述:     商品图片服务接口
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2018/3/15 23:32
  */
public interface GoodsImgFacade {
    /**
    　* @描述:     添加图片
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/3/15 23:42
      */
    int addImg(GoodsImg goodsImg);
}
