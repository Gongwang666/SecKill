package com.gw.seckill.web.admin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gw.seckill.common.web.exception.enums.ExceptionEnum;
import com.gw.seckill.common.web.exception.pojo.Result;
import com.gw.seckill.common.web.exception.utils.ResultUtil;
import com.gw.seckill.facade.admin.entity.SysResource;
import com.gw.seckill.facade.admin.entity.SysUser;
import com.gw.seckill.facade.admin.service.MenuFacade;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ResourceController {
    @Reference(version = "1.0.0")
    private MenuFacade menuFacade;

    /**
    　* @描述:     资源浏览页面
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/1/10 16:52
      */
    @RequiresPermissions("resource:view")
    @RequestMapping("/resource/view")
    public String showAllRes(Model model){

        model.addAttribute("resList",menuFacade.getAllResources());
        return "/resource/resource";
    }
    /**
    　* @描述:     跳转到添加资源页面
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/1/10 16:18
      */
    @RequiresPermissions("resource:create")
    @RequestMapping("/resource/create")
    public String addResPage(Model model){
        Subject subject = SecurityUtils.getSubject();
        String userName =(String) subject.getPrincipal();
        boolean flag =subject.isPermitted("resource:view");
        model.addAttribute("resList",menuFacade.getAllResources());
        return "/resource/add_res_page";
    }
    /**
    　* @描述:     添加操作
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/1/10 16:18
      */
    @ResponseBody
    @RequestMapping("/resource/create.do")
    public Result addRes(@RequestBody SysResource sysResource, Model model){
        if(sysResource != null){
            menuFacade.addSysRes(sysResource);
            return ResultUtil.success();
        }
        return ResultUtil.error(ExceptionEnum.ADD_ERROR);
    }
    /**
    　* @描述:     删除资源
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/1/10 22:08
      */
    @RequiresPermissions("resource:delete")
    @ResponseBody
    @RequestMapping("/resource/delete")
    public Result delRes(@RequestBody Long resID){
        if(resID != null){
            menuFacade.deleteSysResource(resID);
        }
        return ResultUtil.error(ExceptionEnum.ADD_ERROR);
    }
}
