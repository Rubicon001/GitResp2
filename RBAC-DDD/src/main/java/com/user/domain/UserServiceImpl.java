package com.user.domain;

import com.user.infrastructure.DO.UserDO;
import com.user.infrastructure.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    private UserMapper userMapper;

    public UserDO selectById(Long id) {
        return userMapper.selectById(id);
    }
}
