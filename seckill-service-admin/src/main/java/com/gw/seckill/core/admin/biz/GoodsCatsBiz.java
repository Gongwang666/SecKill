package com.gw.seckill.core.admin.biz;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    /**
    　* @描述:     获取分页后的分类菜单
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/3/6 14:31
      */
    public PageInfo<GoodsCats> getAllCatsPaged(GoodsCats goodsCats) {
        if (goodsCats.getPage() != null && goodsCats.getRows() != null) {
            PageHelper.startPage(goodsCats.getPage(), goodsCats.getRows());
        }
        return new PageInfo<GoodsCats>(goodsCatsDAO.selectAll());
    }
    /**
    　* @描述:     添加分类
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/3/6 14:32
      */
    public int addCats(GoodsCats goodsCats) {
        goodsCats.setCreateTime(new Date());
        return goodsCatsDAO.insertSelective(goodsCats);
    }
    /**
    　* @描述:     删除分类
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/3/6 14:32
      */
    public int delCat(Long id) {
        GoodsCats goodsCats = getCatsById(id);
        goodsCats.setDataFlag((byte)0);
        return goodsCatsDAO.updateByPrimaryKeySelective(goodsCats);
    }
    /**
    　* @描述:     通过id获取商品分类
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/3/6 14:35
      */
    public GoodsCats getCatsById(Long id) {
        return goodsCatsDAO.selectByPrimaryKey(id);
    }
    /**
    　* @描述:     修改分类信息
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/3/6 15:19
      */
    public int editCat(GoodsCats goodsCats) {
        return goodsCatsDAO.updateByPrimaryKeySelective(goodsCats);
    }
    /**
    　* @描述:     启用分类
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/3/6 15:51
      */
    public int enableCats(Long id) {
        GoodsCats goodsCats = new GoodsCats();
        goodsCats.setId(id);
        goodsCats.setDataFlag((byte)1);
        return goodsCatsDAO.updateByPrimaryKeySelective(goodsCats);
    }
}
