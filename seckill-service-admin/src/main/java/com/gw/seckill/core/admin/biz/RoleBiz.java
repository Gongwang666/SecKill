package com.gw.seckill.core.admin.biz;

import com.gw.seckill.core.admin.dao.SysRoleMapper;
import com.gw.seckill.facade.admin.entity.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service("roleBiz")
public class RoleBiz {
    @Autowired
    private SysRoleMapper sysRoleDAO;
    @Autowired
    private ResourceBiz resourceBiz;

    public Set<String> findPermissions(Long[] roleIds) {
        Set<Long> resourceIds = new HashSet<Long>();
        for (Long roleId : roleIds) {
            SysRole role = sysRoleDAO.selectByPrimaryKey(roleId);
            if (role != null) {
                String[] resIds = role.getResourceIds().split(",");
                for(String id : resIds){
                    resourceIds.add(Long.parseLong(id));
                }

            }
        }
        return resourceBiz.findPermissions(resourceIds);
    }
}
