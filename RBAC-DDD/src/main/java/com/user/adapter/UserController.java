package com.user.adapter;

import com.user.adapter.queryVo.AddUser;
import com.user.application.UserService;
import com.user.infrastructure.DO.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/add")
    public String addUser(AddUser addUser) {
        System.out.println(addUser);
//        UserDO userDO = userService.selectById((long) 2);
//        System.out.println(userDO);
        return "addUser";
    }

    @RequestMapping("/aaa")
    public String aaa() {
        return "addUser";
    }
}
