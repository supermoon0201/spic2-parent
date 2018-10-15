/**
 * Project Name:spic2-demo-shiro
 * File Name:RoleServiceImpl.java
 * Package Name:com.sprixin.demo.service.impl
 * Date:2018年10月15日下午2:07:11
 * Copyright (c) 2018, SPRIXIN.com All Rights Reserved.
 */
package com.sprixin.demo.service.impl;

import com.sprixin.demo.dao.RoleMapper;
import com.sprixin.demo.service.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 角色service实现类<br/>
 * <br/>
 * 创建时间： 2018年10月15日 下午2:07:11 <br/>
 * 
 * @author le.yang
 */
@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

}
