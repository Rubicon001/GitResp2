package com.domain;

import com.adapter.DTO.RoleDTO;
import com.infrastructure.DO.Menu;
import com.infrastructure.DO.Role;
import com.infrastructure.DO.User;
import com.infrastructure.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl {

    @Autowired
    private RoleMapper roleMapper;

    public Integer insertRole(RoleDTO roleDTO){
        return roleMapper.insertRole(roleDTO);
    }

    public Boolean deleteRole(Integer id){

        Integer result = roleMapper.deleteRoleById(id);
        Integer result1 = roleMapper.deleteUserRoleById(id);
        Integer result2 = roleMapper.deleteRoleMenuById(id);
        return result > 0 && result1 > 0 && result2 > 0;
    }

    public RoleDTO roleDetailById(Integer id){
        List<Menu> menus = roleMapper.selectMenusByRoleId(id);
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setMenus(menus);
        Role role = roleMapper.selectRoleById(id);
        roleDTO.setRoleName(role.getRoleName());
        return roleDTO;
    }

    public List<User> usersByRoleId(Integer id){
        return roleMapper.selectUsersByRoleId(id);
    }
}
