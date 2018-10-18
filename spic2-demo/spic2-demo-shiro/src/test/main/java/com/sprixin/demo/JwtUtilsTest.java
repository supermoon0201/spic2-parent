/**
 * Project Name:spic2-demo-shiro
 * File Name:JwtUtilsTest.java
 * Package Name:com.sprixin.demo
 * Date:2018年10月17日上午11:40:44
 * Copyright (c) 2018, SPRIXIN.com All Rights Reserved.
 */
package com.sprixin.demo;

import static org.junit.Assert.assertNotNull;

import com.sprixin.core.util.JwtUtils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * JwtUtils工具类<br/>
 * <br/>
 * 创建时间： 2018年10月17日 上午11:40:44 <br/>
 * 
 * @author le.yang
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShiroApplication.class)
public class JwtUtilsTest {
    @Autowired
    private JwtUtils jwtUtils;

    @Test
    public void testGenerateToken() {
        assertNotNull(jwtUtils.generateToken(6));
        System.out.println(jwtUtils.generateToken(6));
    }

}
