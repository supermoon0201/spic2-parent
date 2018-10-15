package com.sprixin.demo.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sprixin.demo.bootstrap.ShiroApplication;
import com.sprixin.demo.model.User;

/**
 * 单元测试UserService
 * 
 * @author le.yang
 * @date 2018年10月14日
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=ShiroApplication.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testGetUser() {
        User user = new User();
        user.setLoginname("wpfs");
        assertEquals("wpfs", userService.getUser(user).getLoginname());
    }

}
