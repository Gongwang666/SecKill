package com.gw.seckill.web.admin.enums;
/**
　* @描述:     不需要权限的URL枚举类
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2018/1/16 20:11
  */
public enum EnumWithOutPermissionUrls {
    LOGIN_PAGE("/user/login"),DO_LOGIN("/user/login.do"),
    UNAUTHER_PAGE("/unauthor"),ERROR_INFO("/404");
    private String url;

    EnumWithOutPermissionUrls(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
