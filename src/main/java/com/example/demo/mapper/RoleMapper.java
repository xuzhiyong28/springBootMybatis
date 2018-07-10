package com.example.demo.mapper;/**
 * Created by Administrator on 2018-05-16.
 */

import com.example.demo.pojo.SysRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author xuzhiyong
 * @createDate 2018-05-16-14:31
 */
@Mapper
public interface RoleMapper {
    public List<SysRole> selectRoleByUserId(Long userId);
}
