package com.gw.seckill.facade.admin.vo;

import com.gw.seckill.facade.admin.entity.GoodsCats;

import java.io.Serializable;
import java.util.List;

public class GoodsCatsVO implements Serializable{
    //
    private GoodsCats parent;
    private List<GoodsCats> childrens = null;

    public GoodsCatsVO(GoodsCats parent, List<GoodsCats> childrens) {
        this.parent = parent;
        this.childrens = childrens;
    }

    public GoodsCats getParent() {
        return parent;
    }

    public void setParent(GoodsCats parent) {
        this.parent = parent;
    }

    public List<GoodsCats> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<GoodsCats> childrens) {
        this.childrens = childrens;
    }
}
