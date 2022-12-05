package com.adapter.controller;

import com.adapter.DTO.UserDTO;
import com.application.UserService;
import com.infrastructure.DO.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 添加用户
     * @param userDTO 用户信息
     * @return 添加用户是否成功
     */
    @RequestMapping("/add")
    public Boolean addUser(UserDTO userDTO) {
        return userService.addUser(userDTO);
    }

    /**
     * 删除用户
     * @param id 用户id
     * @return 删除用户是否成功
     */
    @RequestMapping("/remove")
    public Boolean removeUser(Integer id){
        return userService.removeUser(id);
    }

    /**
     * 查询用户拥有的角色
     * @param id 用户id
     */
    @RequestMapping("/detail")
    public UserDTO userDetail(Integer id){
        return userService.userDetail(id);
    }

    /**
     * 查询某个用户有权限的菜单
     * @param id 用户id
     * @return
     */
    @RequestMapping("/menus")
    public List<Menu> menusByUser(Integer id){
        return userService.menusByUser(id);
    }

}
