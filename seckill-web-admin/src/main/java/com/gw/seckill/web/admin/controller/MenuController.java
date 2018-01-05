package com.gw.seckill.web.admin.controller;

import com.gw.seckill.facade.admin.enums.EnumTreeType;
import com.gw.seckill.facade.admin.vo.ItemVO;
import com.gw.seckill.facade.admin.vo.MenuVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MenuController {
    @ResponseBody
    @RequestMapping("/menu")
    public List<MenuVO> menu(){
        MenuVO menuVO = new MenuVO();
        MenuVO menuVO1 = new MenuVO("华为",EnumTreeType.FOLDER.getName());
        List<MenuVO> mlist = new ArrayList<MenuVO>();
        menuVO.setTitle("苹果公司");
        menuVO.setType(EnumTreeType.FOLDER.getName());
        List<ItemVO> list = new ArrayList<ItemVO>();
        ItemVO itemVO = new ItemVO("IPHONE",EnumTreeType.ITEM.getName());
        ItemVO itemVO1 = new ItemVO("iMac",EnumTreeType.ITEM.getName());
        ItemVO itemVO2 = new ItemVO("MacBook Pro",EnumTreeType.ITEM.getName());
        ItemVO itemVO3 = new ItemVO("MacBook Air",EnumTreeType.ITEM.getName());
        list.add(itemVO);
        list.add(itemVO1);
        list.add(itemVO2);
        list.add(itemVO3);
        menuVO.setProducts(list);
        menuVO1.setProducts(list);
        mlist.add(menuVO1);
        mlist.add(menuVO);
        return mlist;
    }
}
