package com.adapter.controller;

import com.adapter.DTO.MenuDTO;
import com.application.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    /**
     * 添加菜单
     * @param menuDTO 菜单
     * @return 菜单是否添加成功
     */
    @RequestMapping("/add")
    public boolean addMenu(MenuDTO menuDTO) {
        return menuService.addMenu(menuDTO);
    }

    /**
     * 删除菜单
     * @param id 菜单id
     * @return 删除菜单是否成功
     */
    @RequestMapping("/remove")
    public Boolean removeUser(Integer id){
        return menuService.removeMenu(id);
    }
}
