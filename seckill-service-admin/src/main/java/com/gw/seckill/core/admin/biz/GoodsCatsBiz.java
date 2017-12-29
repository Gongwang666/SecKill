package com.gw.seckill.core.admin.biz;


import com.gw.seckill.core.admin.dao.GoodsCatsMapper;
import com.gw.seckill.facade.admin.entity.Goods;
import com.gw.seckill.facade.admin.entity.GoodsCats;
import com.gw.seckill.facade.admin.enums.EnumGoodsCatName;
import com.gw.seckill.facade.admin.vo.GoodsCatsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public GoodsCats findGoodsCatsById(Integer catId) {
        return goodsCatsDAO.selectByPrimaryKey(catId);
    }

    public List<GoodsCats> findAllGoodsCats() {
        return goodsCatsDAO.selectAllCats();
    }

    public Map<String, List<GoodsCatsVO>> getAllGoodsCats() {
        List<GoodsCats> goodsCatsList = findAllGoodsCats();
        List<GoodsCats> parents = new ArrayList<GoodsCats>();
        Map<String, List<GoodsCatsVO>> map = new HashMap<String, List<GoodsCatsVO>>();
        List<GoodsCatsVO> list = new ArrayList<GoodsCatsVO>();
        for (GoodsCats goodsCats : goodsCatsList){
            if(goodsCats.getParentId() == -1){
                parents.add(goodsCats);
            }
        }

        for (GoodsCats goodsCats : parents){
            List<GoodsCats> childrens = new ArrayList<GoodsCats>();
            for(GoodsCats cats : goodsCatsList){
                if(goodsCats.getCatId() == cats.getParentId()){
                    childrens.add(goodsCats);
                }
            }
            GoodsCatsVO goodsCatsVO = new GoodsCatsVO(null,childrens);
            list.add(goodsCatsVO);
        }
        map.put(EnumGoodsCatName.FIRST.getName(),list);
        return map;
    }
}
