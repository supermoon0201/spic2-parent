 package com.sprixin.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprixin.demo.dao.UserMapper;
import com.sprixin.demo.model.User;
import com.sprixin.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    
    @Override
    public User getUser(User user) {
        return userMapper.getUser(user);
    }

}
