package com.infrastructure.DO;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("menu")
public class Menu {
    private Integer id;
    private String menuName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
}
