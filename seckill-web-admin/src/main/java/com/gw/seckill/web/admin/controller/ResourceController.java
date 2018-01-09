package com.gw.seckill.web.admin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gw.seckill.facade.admin.service.MenuFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ResourceController {
    @Reference(version = "1.0.0")
    private MenuFacade menuFacade;

    @RequestMapping("/resource/view")
    public String showAllRes(Model model){
        model.addAttribute("resList",menuFacade.getAllResources());
        return "/resource/resource";
    }

    @RequestMapping("/resource/create")
    public String addResPage(Model model){
        model.addAttribute("resList",menuFacade.getAllResources());
        return "/resource/add_res_page";
    }
}
