package com.user.application;

import com.user.domain.UserServiceImpl;
import com.user.infrastructure.DO.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserServiceImpl userService;

    public UserDO selectById(Long id) {
        return userService.selectById(id);
    }
}
