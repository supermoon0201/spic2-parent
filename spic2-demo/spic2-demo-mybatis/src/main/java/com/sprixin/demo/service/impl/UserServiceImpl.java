package com.sprixin.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sprixin.demo.consumer.UserService;
import com.sprixin.demo.dao.UserMapper;
import com.sprixin.demo.model.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "${demo.service.version}", application = "${dubbo.application.id}", protocol = "${dubbo.protocol.id}", registry = "${dubbo.registry.id}", timeout = 30000)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(User user) {
        userMapper.insertSelective(user);
    }

    @Override
    public void deleteById(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> findAll(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = null;
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return pageInfo.getList();
    }

}
