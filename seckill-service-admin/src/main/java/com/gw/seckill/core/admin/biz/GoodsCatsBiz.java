package com.gw.seckill.core.admin.biz;


import com.gw.seckill.core.admin.dao.GoodsCatsMapper;
import com.gw.seckill.core.admin.util.GoodsCatsUtil;
import com.gw.seckill.facade.admin.entity.GoodsCats;
import com.gw.seckill.facade.admin.vo.GoodsCatsTreeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
　* @描述:     商品分类管理业务
　* @异常:
　* @作者:     gongwang
　* @创建时间: 2017/12/29 16:24
  */
@Service("goodsCatsBiz")
public class GoodsCatsBiz {
    @Autowired
    private GoodsCatsMapper goodsCatsDAO;

    /**
    　* @描述:     获取所有商品分类信息
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/3/5 20:48
      */
    public List<GoodsCats> getAllGoodCats() {
        return goodsCatsDAO.selectAll();
    }

    /**
    　* @描述:     获取商品分类树形结构
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/3/5 20:52
      */
    public List<GoodsCats> getGoodsCatsTree() {
        List<GoodsCats> goodsCatsList = getAllGoodCats();
        List<GoodsCatsTreeVO> goodsCatsTreeVOList = new ArrayList<GoodsCatsTreeVO>();
        for(GoodsCats goodsCats : goodsCatsList){
            if(goodsCats.getDataFlag() == 1){
                GoodsCatsTreeVO goodsCatsTreeVO = new GoodsCatsTreeVO();
                goodsCatsTreeVO.setId(goodsCats.getId());
                goodsCatsTreeVO.setParentId(goodsCats.getParentId());
                goodsCatsTreeVO.setGoodsCats(goodsCats);
                goodsCatsTreeVOList.add(goodsCatsTreeVO);
            }
        }
        GoodsCatsUtil goodsCatsUtil = new GoodsCatsUtil();
        return goodsCatsUtil.getChildTreeObjects(goodsCatsTreeVOList,(long)-1);
    }
}
