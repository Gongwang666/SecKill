package com.gw.seckill.facade.admin.vo;

import java.util.List;

/**
　* @描述:     菜单显示VO
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2018/1/5 20:45
  */
public class MenuVO {
    private String title;
    private String type;
    private List<ItemVO> products;

    public MenuVO(String title, String type, List<ItemVO> products) {
        this.title = title;
        this.type = type;
        this.products = products;
    }

    public MenuVO() {
    }

    public MenuVO(String title, String type) {
        this.title = title;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ItemVO> getProducts() {
        return products;
    }

    public void setProducts(List<ItemVO> products) {
        this.products = products;
    }
}
