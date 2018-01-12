package com.gw.seckill.core.admin.biz;

import com.gw.seckill.core.admin.dao.SysResourceMapper;
import com.gw.seckill.facade.admin.entity.SysResource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
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
}
