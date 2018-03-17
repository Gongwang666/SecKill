package com.gw.seckill.core.admin.biz;

import com.gw.seckill.core.admin.dao.GoodsImgMapper;
import com.gw.seckill.facade.admin.entity.GoodsImg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("goodsImgBiz")
public class GoodsImgBiz {
    @Autowired
    private GoodsImgMapper goodsImgDAO;

    /**
    　* @描述:     添加图片
    　* @参数描述: 
    　* @返回值:   
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/3/15 23:44
      */
    public int addImg(GoodsImg goodsImg) {
        return goodsImgDAO.insert(goodsImg);
    }
}
