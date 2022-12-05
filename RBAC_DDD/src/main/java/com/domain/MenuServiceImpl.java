package com.domain;

import com.adapter.DTO.MenuDTO;
import com.infrastructure.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl {

    @Autowired
    private MenuMapper menuMapper;

    public Integer insertMenu(MenuDTO menuDTO){
        return menuMapper.insertMenu(menuDTO);
    }

    public Boolean deleteMenu(Integer id){
        Integer result = menuMapper.deleteRoleMenuByMenuId(id);
        Integer result1 = menuMapper.deleteMenuById(id);
        return result > 0 && result1 > 0;
    }
}
