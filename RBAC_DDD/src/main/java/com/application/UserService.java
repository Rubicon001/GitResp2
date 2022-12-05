package com.application;

import com.adapter.DTO.UserDTO;
import com.domain.UserServiceImpl;
import com.infrastructure.DO.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    @Autowired
    private UserServiceImpl userService;

    public Boolean addUser(UserDTO userDTO) {
        return userService.insertUser(userDTO) > 0;
    }

    public Boolean removeUser(Integer id){
        return userService.deleteUser(id) > 0;
    }

    public UserDTO userDetail(Integer id){
        return userService.userDetail(id);
    }

    public List<Menu> menusByUser(Integer id){
        return userService.selectMenusByUserId(id);
    }
}
