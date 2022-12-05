package com.infrastructure.mapper;

import com.adapter.DTO.MenuDTO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.infrastructure.DO.Menu;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper extends BaseMapper<Menu> {
    Integer insertMenu(@Param("menuDTO") MenuDTO menuDTO);

    Integer deleteMenuById(@Param("id") Integer id);

    Integer deleteRoleMenuByMenuId(@Param("MenuId") Integer MenuId);
}
