/**
 * Project Name:spic2-demo-shiro
 * File Name:UserTokenServiceImpl.java
 * Package Name:com.sprixin.demo.service.impl
 * Date:2018年10月17日上午10:53:57
 * Copyright (c) 2018, SPRIXIN.com All Rights Reserved.
 */
package com.sprixin.demo.service.impl;

import com.sprixin.core.model.Result;
import com.sprixin.demo.dao.UserTokenMapper;
import com.sprixin.demo.service.UserTokenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * UserToken Service实现类<br/>
 * <br/>
 * 创建时间： 2018年10月17日 上午10:53:57 <br/>
 * 
 * @author le.yang
 */
@Service
@Transactional
public class UserTokenServiceImpl implements UserTokenService {
    @Autowired
    private UserTokenMapper userTokenMapper;

    @Override
    public Result createToken(Long userId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void logout(Long userId) {
        // TODO Auto-generated method stub
        
    }



}
