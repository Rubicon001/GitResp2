package com.infrastructure.mapper;

import com.adapter.DTO.RoleDTO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.infrastructure.DO.Menu;
import com.infrastructure.DO.Role;
import com.infrastructure.DO.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper extends BaseMapper<Role> {
    Integer insertRole(@Param("roleDTO")RoleDTO roleDTO);

    Integer deleteRoleById(@Param("id") Integer id);
    Integer deleteRoleMenuById(@Param("id") Integer id);
    Integer deleteUserRoleById(@Param("id") Integer id);

    Role selectRoleById(@Param("id") Integer id);

    List<Menu> selectMenusByRoleId(@Param("roleId") Integer roleId);

    List<User> selectUsersByRoleId(@Param("roleId") Integer roleId);
}
