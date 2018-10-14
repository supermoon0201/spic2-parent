/**
 * Project Name:spic2-demo-shiro File Name:ShiroRealm.java Package Name:com.sprixin.demo.shiro Date:2018年10月11日下午7:03:33
 * Copyright (c) 2018, SPRIXIN.com All Rights Reserved.
 */
package com.sprixin.demo.shiro;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.sprixin.demo.model.User;
import com.sprixin.demo.service.UserService;

/**
 * 自定义Realm<br/>
 * <br/>
 * 创建时间： 2018年10月11日 下午7:03:33 <br/>
 * 
 * @author le.yang
 */
public class ShiroRealm extends AuthorizingRealm {
    private static Logger logger = LoggerFactory.getLogger(ShiroRealm.class);

    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken)authcToken;

        //查询用户信息
        User user = new User();
        user.setLoginname(token.getUsername());
        user = userService.getUser(user);
        return new SimpleAuthenticationInfo(user, user.getPassword(), getName());
    }

}
