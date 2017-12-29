package com.gw.seckill.facade.admin.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gw.seckill.core.admin.biz.GoodsCatsBiz;
import com.gw.seckill.facade.admin.entity.GoodsCats;
import com.gw.seckill.facade.admin.service.GoodsCatsFacade;
import com.gw.seckill.facade.admin.vo.GoodsCatsVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
　* @描述:     商品分类管理Dubbo服务实现
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2017/12/29 11:08
  */
@Service(version = "1.0.0")
public class GoodsCatsFacadeImpl implements GoodsCatsFacade {

    @Autowired
    private GoodsCatsBiz goodsCatsBiz;

    @Override
    public GoodsCats findGoodsCatsById(Integer catId) {
        return goodsCatsBiz.findGoodsCatsById(catId);
    }

    @Override
    public List<GoodsCats> findAllGoodsCats() {
        return goodsCatsBiz.findAllGoodsCats();
    }

    @Override
    public Map<String, List<GoodsCatsVO>> getAllGoodsCats() {
        return null;
    }
}
