package com.example.demo.service;

import com.example.demo.pojo.SysUserRole;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018-05-23.
 */
public interface SysUserRoleService {
    public List<SysUserRole> queryByUserId(Long userId);
    public int addSysUserRole(SysUserRole sysUserRole);
    public List<SysUserRole> queryByUserIdAndRoleId(Map map);
}
