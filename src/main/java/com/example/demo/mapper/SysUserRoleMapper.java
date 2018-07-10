package com.example.demo.mapper;/**
 * Created by Administrator on 2018-05-23.
 */

import com.example.demo.pojo.SysUserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author xuzhiyong
 * @createDate 2018-05-23-9:35
 */
@Mapper
public interface SysUserRoleMapper {
    public List<SysUserRole> queryByUserId(Long userId);
    public int addSysUserRole(SysUserRole sysUserRole);
    public List<SysUserRole> queryByUserIdAndRoleId(Map map);
}
