package com.gw.seckill.core.admin.biz;

import com.gw.seckill.core.admin.dao.SysResourceMapper;
import com.gw.seckill.core.admin.util.MenuUtil;
import com.gw.seckill.facade.admin.entity.SysResource;
import com.gw.seckill.facade.admin.vo.MenuTreeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
　* @描述:     菜单管理服务
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2018/1/9 10:42
  */
@Service("menuBiz")
public class MenuBiz {
    @Autowired
    private SysResourceMapper sysResourceDAO;

    public List<MenuTreeVO> getMenuTree() {
        List<SysResource> resList = sysResourceDAO.selectAllRes();
        List<MenuTreeVO> menuTreeVOList = new ArrayList<MenuTreeVO>();
        for(SysResource sysResource : resList){
            MenuTreeVO menuTreeVO = new MenuTreeVO(sysResource.getResName(),
                                                   sysResource.getResType(),
                                                   sysResource.getResUrl());
            menuTreeVO.setId(sysResource.getResId());
            menuTreeVO.setParentId(sysResource.getParentId());
            menuTreeVOList.add(menuTreeVO);
        }
        MenuUtil menuUtil = new MenuUtil();
        return menuUtil.getChildTreeObjects(menuTreeVOList,(long)1);
    }

    public List<SysResource> getAllResources() {
        return sysResourceDAO.selectAllRes();
    }

    public void addSysRes(SysResource sysResource) {
        sysResourceDAO.insertSelective(sysResource);
    }
    /**
    　* @描述:     删除资源业务逻辑
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/1/10 22:11
      */
    public void deleteSysResource(Long resID) {
        SysResource sysResource = new SysResource();
        sysResource.setResId(resID);
        sysResource.setAvailable(false);
        sysResourceDAO.updateByPrimaryKeySelective(sysResource);
    }
}
