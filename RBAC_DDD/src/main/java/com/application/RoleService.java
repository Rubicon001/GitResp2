package com.application;

import com.adapter.DTO.RoleDTO;
import com.domain.RoleServiceImpl;
import com.infrastructure.DO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class RoleService {
    @Autowired
    private RoleServiceImpl roleService;

    public Boolean addRole(RoleDTO roleDTO){
        return roleService.insertRole(roleDTO) > 0;
    }

    public Boolean removeRole(Integer id){
        return roleService.deleteRole(id);
    }

    public RoleDTO roleDetailById(Integer id){
        return roleService.roleDetailById(id);
    }

    public List<User> usersByRoleId(Integer id){
        return roleService.usersByRoleId(id);
    }
}
