package com.example.demo.service.impl;/**
 * Created by Administrator on 2018-05-23.
 */

import com.example.demo.mapper.SysUserRoleMapper;
import com.example.demo.pojo.SysUserRole;
import com.example.demo.service.SysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author xuzhiyong
 * @createDate 2018-05-23-9:43
 */
@Service("sysUserRoleServiceImpl")
public class SysUserRoleServiceImpl implements SysUserRoleService {
    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;
    @Override
    public List<SysUserRole> queryByUserId(Long userId) {
        return sysUserRoleMapper.queryByUserId(userId);
    }

    @Override
    public int addSysUserRole(SysUserRole sysUserRole) {
        return sysUserRoleMapper.addSysUserRole(sysUserRole);
    }

    @Override
    public List<SysUserRole> queryByUserIdAndRoleId(Map map) {
        return sysUserRoleMapper.queryByUserIdAndRoleId(map);
    }
}
