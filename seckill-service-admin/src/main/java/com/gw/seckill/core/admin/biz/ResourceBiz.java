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
}
