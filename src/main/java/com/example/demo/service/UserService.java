package com.example.demo.service;

import com.example.demo.pojo.SysUser;

import java.util.List;

/**
 * Created by Administrator on 2018-05-23.
 */
public interface UserService {
    public SysUser selectByid(Long id);
    public List<SysUser> selectAll();
    public List<SysUser> selectByIds(List<Long> ids);
    public SysUser selectUserAndRoleById(Long id);
    public int addSysUser(SysUser sysUser);
    public int updateSysUser(SysUser sysUser);
    public int deleteByUserId(Long id);
    public int updateSysUserInfoAndName(Long id , String userInfo,String userName);

    public int addSysUserAndSetRole(SysUser sysUser,Long roleId);
}
