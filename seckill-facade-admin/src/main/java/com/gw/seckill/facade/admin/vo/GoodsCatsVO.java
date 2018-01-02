package com.gw.seckill.facade.admin.vo;

import com.gw.seckill.facade.admin.entity.GoodsCats;

import java.io.Serializable;
import java.util.List;

public class GoodsCatsVO implements Serializable{
    private Integer level;
    private GoodsCats goodsCats;

    public GoodsCatsVO() {
    }

    public GoodsCatsVO(Integer level, GoodsCats goodsCats) {
        this.level = level;
        this.goodsCats = goodsCats;
    }


    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public GoodsCats getGoodsCats() {
        return goodsCats;
    }

    public void setGoodsCats(GoodsCats goodsCats) {
        this.goodsCats = goodsCats;
    }
}
