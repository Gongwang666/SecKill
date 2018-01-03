package com.gw.seckill.core.admin.biz;


import com.gw.seckill.core.admin.dao.GoodsCatsMapper;
import com.gw.seckill.facade.admin.entity.GoodsCats;
import com.gw.seckill.facade.admin.vo.GoodsCatsVO;
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

    //key：为分类的根 value：为以GoodsCats为根的子孙节点集合
    private Map<GoodsCats,List<GoodsCatsVO>> catsMap = new HashMap<GoodsCats, List<GoodsCatsVO>>();
    //子孙节点集合
    private List<GoodsCatsVO> goodsCatsVOList = new ArrayList<GoodsCatsVO>();

    public GoodsCats findGoodsCatsById(Integer catId) {
        return goodsCatsDAO.selectByPrimaryKey(catId);
    }

    public List<GoodsCats> findAllGoodsCats() {
        return goodsCatsDAO.selectAllCats();
    }

    /**
     　* @描述:     获取父分类的所有子孙节点
     　* @参数描述: parentId：父节点id，level：层数
     　* @返回值:
     　* @异常:
     　* @作者:     gongwang
     　* @创建时间: 2018/1/2 14:12
     */
    private void getCatsChildren(GoodsCats cat,int level){
        Integer parentId = cat.getCatId();
        List<GoodsCats> childrens = goodsCatsDAO.selectCatsByParentId(parentId);
        //层数为0，将goodsCatsVOList加入map中
        if (level == 0){
            //将集合清空
            goodsCatsVOList.clear();
            //catsMap.put(goodsDAO.selectByPrimaryKey(parentId),goodsCatsVOList);
            catsMap.put(cat,goodsCatsVOList);
        }
        Iterator<GoodsCats> iterator = childrens.iterator();
        while (iterator.hasNext()){
            GoodsCats goodsCats =(GoodsCats)iterator.next();
            GoodsCatsVO goodsCatsVO = new GoodsCatsVO(level,goodsCats);
            goodsCatsVOList.add(goodsCatsVO);
            getCatsChildren(goodsCats,level+1);
        }
    }
    /**
     　* @描述:     获取所有分类（已分级）
     　* @参数描述:
     　* @返回值:    key：根分类 value：所有子孙节点
     　* @异常:
     　* @作者:     gongwang
     　* @创建时间: 2018/1/2 15:04
     */
    public Map<GoodsCats,List<GoodsCatsVO>> getAllCatsWithLevel(){
        List<GoodsCats> rooots = goodsCatsDAO.selectAllRootCats();
        catsMap.clear();
        for (GoodsCats root : rooots){
            getCatsChildren(root,0);
        }
        return catsMap;
    }
    /**
    　* @描述:     添加分类
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/1/3 14:23
      */
    public int addGoodsCat(GoodsCats goodsCats) {
        goodsCats.setCreateTime(new Date());
        return goodsCatsDAO.insertSelective(goodsCats);
    }
}
