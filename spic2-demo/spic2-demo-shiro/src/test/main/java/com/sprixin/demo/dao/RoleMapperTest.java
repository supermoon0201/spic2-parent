/**
 * Project Name:spic2-demo-shiro
 * File Name:RoleMapperTest.java
 * Package Name:com.sprixin.demo.dao
 * Date:2018年10月15日下午7:14:49
 * Copyright (c) 2018, SPRIXIN.com All Rights Reserved.
 */
package com.sprixin.demo.dao;

import static org.junit.Assert.assertNotNull;

import com.sprixin.demo.ShiroApplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 角色DAO单元测试<br/>
 * <br/>
 * 创建时间： 2018年10月15日 下午7:14:49 <br/>
 * 
 * @author le.yang
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShiroApplication.class)
public class RoleMapperTest {
    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void testListRoleByUserId() {
        assertNotNull(roleMapper.listRoleByUserId((long) 6));
    }

}
