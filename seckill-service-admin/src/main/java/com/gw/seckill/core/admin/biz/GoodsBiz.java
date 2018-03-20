package com.gw.seckill.core.admin.biz;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gw.seckill.core.admin.dao.GoodsMapper;
import com.gw.seckill.facade.admin.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
　* @描述:     商品信息管理业务类
　* @参数描述: 
　* @返回值:
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2018/3/7 10:27
  */
@Service("goodsBiz")
public class GoodsBiz {
    @Autowired
    private GoodsMapper goodsDAO;

    public PageInfo<Goods> getAllGoodsPaged(Goods goods) {
        if (goods.getPage() != null && goods.getRows() != null) {
            PageHelper.startPage(goods.getPage(), goods.getRows());
        }
        return new PageInfo<Goods>(goodsDAO.selectAll());
    }

    public PageInfo<Goods> getAllGoodsPagedWithImgs(Goods goods) {
        if (goods.getPage() != null && goods.getRows() != null) {
            PageHelper.startPage(goods.getPage(), goods.getRows());
        }
        return new PageInfo<Goods>(goodsDAO.selectGoodsWithImg());
    }
}
