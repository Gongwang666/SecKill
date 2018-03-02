package com.gw.seckill.web.admin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.gw.seckill.common.web.exception.pojo.Result;
import com.gw.seckill.facade.admin.entity.SysResource;
import com.gw.seckill.facade.admin.entity.SysRole;
import com.gw.seckill.facade.admin.service.ResourceFacade;
import com.gw.seckill.facade.admin.service.RoleFacade;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 类名: RoleController
 * 包名: com.gw.seckill.web.admin.controller
 * 描述: 角色管理Controller
 * 作者: gongwang
 * 创建日期: 2018/2/8
 * 创建时间: 下午12:48
 **/
@Controller
public class RoleController {
    @Reference(version = "1.0.0")
    private RoleFacade roleFacade;
    @Reference(version = "1.0.0")
    private ResourceFacade resourceFacade;

    /**
     * 类名:
     * 参数: 
     * 描述: 角色展示列表
     * 作者: gongwang
     * 日期: 2018/2/12
     * 时间: 上午9:03
     **/
    @RequiresPermissions("role:view")
    @RequestMapping("/role/view")
    public String showRolePage(@RequestParam Integer page, Model model){
        SysRole sysRole = new SysRole();
        sysRole.setPage(page);
        sysRole.setRows(15);
        PageInfo<SysRole> pageInfo = roleFacade.getAllRolesPaged(sysRole);
        model.addAttribute("pageInfo",pageInfo);
        return "/role/role";
    }
    /**
     * 类名:
     * 参数: 
     * 描述: 添加角色页面
     * 作者: gongwang
     * 日期: 2018/2/12
     * 时间: 上午9:03
     **/
    @RequiresPermissions("role:create")
    @RequestMapping("/role/create")
    public String addRolePage(Model model){
        List<SysResource> resList = resourceFacade.getAllResources();
        model.addAttribute("resList",resList);
        return "/role/add_role_page";
    }

    @RequiresPermissions("role:create")
    @RequestMapping("/role/create.do")
    @ResponseBody
    public Result addRole(@RequestBody SysRole sysRole, Model model){
        Result result = new Result();
        if(sysRole!=null){
            int row = roleFacade.addRole(sysRole);
            if(row == 1){
                result.setStatus(0);
                result.setMsg("添加成功!");
                return result;
            }
        }
        result.setStatus(-1);
        result.setMsg("添加失败!");
        return result;
    }

}
