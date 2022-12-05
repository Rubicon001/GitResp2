package com.domain;

import com.adapter.DTO.UserDTO;
import com.infrastructure.DO.Menu;
import com.infrastructure.DO.Role;
import com.infrastructure.DO.User;
import com.infrastructure.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    private UserMapper userMapper;

    public Integer insertUser(UserDTO userDTO) {
        return userMapper.insertUser(userDTO);
    }

    public Integer deleteUser(Integer id){
        return userMapper.deleteUser(id);
    }

    public UserDTO userDetail(Integer id){
        User user = userMapper.selectUserById(id);
        List<Role> roles = userMapper.selectRolesByUserId(id);
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setRoles(roles);
        return userDTO;
    }

    public List<Menu> selectMenusByUserId(Integer userId){
        return userMapper.selectMenusByUserId(userId);
    }
}
