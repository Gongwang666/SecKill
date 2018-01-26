package com.gw.seckill.core.admin.biz;

import com.gw.seckill.core.admin.dao.SysRoleMapper;
import com.gw.seckill.core.admin.dao.SysUserMapper;
import com.gw.seckill.facade.admin.entity.SysRole;
import com.gw.seckill.facade.admin.entity.SysUser;
import org.apache.commons.beanutils.ConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("roleBiz")
public class RoleBiz {
    @Autowired
    private SysRoleMapper sysRoleDAO;
    @Autowired
    private ResourceBiz resourceBiz;
    @Autowired
    private SysUserMapper sysUserDAO;

    /**
    　* @描述:     通过角色id查找角色所拥有的资源id
    　* @参数描述: 
    　* @返回值:
    　* @异常:     
    　* @作者:     gongwang
    　* @创建时间: 2018/1/16 18:31
      */
    public Set<Long> findRoleResourceIDs(Long[] roleIds){
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
        return resourceIds;
    }
    /**
     * 类名:
     * 参数: 
     * 描述: 获取所有角色
     * 作者: gongwang
     * 日期: 2018/1/26
     * 时间: 下午4:31
     **/
    public List<SysRole> getAllRoles() {
        return sysRoleDAO.selectAll();
    }
}
