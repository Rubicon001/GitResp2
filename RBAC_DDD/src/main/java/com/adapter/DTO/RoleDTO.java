package com.adapter.DTO;

import com.infrastructure.DO.Menu;

import java.util.List;

public class RoleDTO {
    private String roleName;
    private List<Menu> menus;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

}
