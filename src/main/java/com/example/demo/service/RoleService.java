package com.example.demo.service;

import com.example.demo.pojo.SysRole;

import java.util.List;

/**
 * Created by Administrator on 2018-05-23.
 */
public interface RoleService {
    public List<SysRole> selectRoleByUserId(Long userId);
}
