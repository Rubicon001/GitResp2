package com.infrastructure.mapper;

import com.adapter.DTO.UserDTO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.infrastructure.DO.Menu;
import com.infrastructure.DO.Role;
import com.infrastructure.DO.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    Integer insertUser(@Param("userDTO")UserDTO userDTO);

    Integer deleteUser(@Param("id") Integer id);

    User selectUserById(@Param("id") Integer id);

    List<Role> selectRolesByUserId(@Param("userId") Integer roleId);

    List<Menu> selectMenusByUserId(@Param("userId") Integer userId);
}
