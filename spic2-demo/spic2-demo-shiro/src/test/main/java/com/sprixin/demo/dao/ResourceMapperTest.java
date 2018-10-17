/**
 * Project Name:spic2-demo-shiro
 * File Name:ResourceMapperTest.java
 * Package Name:com.sprixin.demo.dao
 * Date:2018年10月15日下午6:51:51
 * Copyright (c) 2018, SPRIXIN.com All Rights Reserved.
 */
package com.sprixin.demo.dao;

import static org.junit.Assert.assertNotNull;

import com.sprixin.demo.ShiroApplication;

import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 单元测试<br/>
 * <br/>
 * 创建时间： 2018年10月15日 下午6:51:51 <br/>
 * 
 * @author le.yang
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShiroApplication.class)
public class ResourceMapperTest {
    @Autowired
    private ResourceMapper resourceMapper;

    @Test
    public void testListResourceUrlByRoleId() {
        Set<String> urlSet = resourceMapper.listResourceUrlByRoleId((long) 5);
        assertNotNull(urlSet);
    }

}
