package com.adapter.controller;

import com.adapter.DTO.RoleDTO;
import com.application.RoleService;
import com.infrastructure.DO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * 添加角色
     * @param roleDTO 角色
     * @return 添加角色是否成功
     */
    @RequestMapping("/add")
    public Boolean addRole(RoleDTO roleDTO){
        return roleService.addRole(roleDTO);
    }

    /**
     * 删除角色，角色删除后用户自动失去该角色下的菜单权限
     * @param id 角色id
     * @return 删除角色是否成功
     */
    @RequestMapping("/remove")
    public Boolean removeRole(Integer id){
        return roleService.removeRole(id);
    }

    /**
     *  查询角色有权限的菜单
     * @param id 角色id
     */
    @RequestMapping("/menus")
    public RoleDTO roleDetail(Integer id){
        return roleService.roleDetailById(id);
    }

    /**
     * 查询某个用户有权限的菜单
     * @param id 用户id
     */
    @RequestMapping("/users")
    public List<User> UsersByRole(Integer id){
        return roleService.usersByRoleId(id);
    }

}
