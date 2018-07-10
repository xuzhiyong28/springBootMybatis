package com.example.demo.service.impl;/**
 * Created by Administrator on 2018-05-23.
 */

import com.example.demo.mapper.RoleMapper;
import com.example.demo.pojo.SysRole;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author xuzhiyong
 * @createDate 2018-05-23-9:18
 */
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public List<SysRole> selectRoleByUserId(Long userId) {
        return roleMapper.selectRoleByUserId(userId);
    }
}
