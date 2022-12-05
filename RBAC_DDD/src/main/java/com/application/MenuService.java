package com.application;

import com.adapter.DTO.MenuDTO;
import com.domain.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MenuService {
    @Autowired
    private MenuServiceImpl menuService;

    public Boolean addMenu(MenuDTO menuDTO){
        return menuService.insertMenu(menuDTO) > 0;
    }

    public Boolean removeMenu(Integer id){
        return menuService.deleteMenu(id);
    }
}
