package com.gw.seckill.core.admin.biz;

import com.gw.seckill.core.admin.dao.SysResourceMapper;
import com.gw.seckill.facade.admin.entity.SysResource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("resourceBiz")
public class ResourceBiz {
    @Autowired
    private SysResourceMapper sysResourceDAO;

    public Set<String> findPermissions(Set<Long> resourceIds) {
        Set<String> permissions = new HashSet<String>();
        for(Long resourceId : resourceIds) {
            SysResource resource = sysResourceDAO.selectByPrimaryKey(resourceId);
            if(resource != null && !StringUtils.isEmpty(resource.getPermission())) {
                permissions.add(resource.getPermission());
            }
        }
        return permissions;
    }
    /**
    　* @描述:     获取资源
    　* @参数描述: 资源ID集合
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/1/16 18:55
      */
    public Set<String> findResourceURLs(Set<Long> resourceIDs) {
        Set<SysResource> resourceSet = new HashSet<SysResource>();
        Set<String> urlSet = new HashSet<String>();
        for (Long id : resourceIDs){
            //父节点
            SysResource sysResParent = sysResourceDAO.selectByPrimaryKey(id);
            if(sysResParent != null && !StringUtils.isEmpty(sysResParent.getResUrl())) {
                resourceSet.add(sysResParent);
            }
            List<SysResource> sysList = sysResourceDAO.selectSysResByParentId(id);
            if(sysList!=null){
                //子节点
                resourceSet.addAll(sysList);
            }
        }
        for(SysResource sysRes : resourceSet){
            urlSet.add(sysRes.getResUrl());
        }
        return urlSet;
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
        sysResource.setAvailable((byte)0);
        sysResourceDAO.updateByPrimaryKeySelective(sysResource);
    }

    /**
    　* @描述:     获取所有资源
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/1/17 16:00
      */
    public List<SysResource> getAllResources() {
        return sysResourceDAO.selectAllRes();
    }
    /**
    　* @描述:     添加资源
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/1/17 16:00
      */
    public void addSysRes(SysResource sysResource) {
        sysResourceDAO.insertSelective(sysResource);
    }

}
