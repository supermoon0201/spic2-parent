/**
 * Project Name:spic2-demo-shiro File Name:ShiroRealm.java Package Name:com.sprixin.demo.shiro Date:2018年10月11日下午7:03:33
 * Copyright (c) 2018, SPRIXIN.com All Rights Reserved.
 */
package com.sprixin.demo.config.shiro;

import com.sprixin.demo.dao.ResourceMapper;
import com.sprixin.demo.dao.RoleMapper;
import com.sprixin.demo.model.Role;
import com.sprixin.demo.model.User;
import com.sprixin.demo.service.UserService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 自定义Realm<br/>
 * <br/>
 * 创建时间： 2018年10月11日 下午7:03:33 <br/>
 * 
 * @author le.yang
 */
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private ResourceMapper resourceMapper;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        ShiroUser shiroUser = (ShiroUser) principals.getPrimaryPrincipal();
        List<Long> roleList = shiroUser.roleList;

        Set<String> permissionSet = new HashSet<>();
        // 遍历循环用户权限
        for (Long roleId : roleList) {
            Set<String> urlSet = resourceMapper.listResourceUrlByRoleId(roleId);
            if (CollectionUtils.isNotEmpty(urlSet)) {
                permissionSet.addAll(urlSet);
            }
        }
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(permissionSet);
        info.addRoles(shiroUser.roleNameList);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken)
            throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;

        // 查询用户信息
        User user = new User();
        user.setLoginname(token.getUsername());
        user = userService.getUser(user);
        // 查询用户对应的角色列表
        List<Role> roleList = roleMapper.listRoleByUserId(user.getId());
        // 封装角色id列表和角色名称列表
        List<String> roleNameList = new ArrayList<>();
        List<Long> roleIdList = new ArrayList<>();
        for (Role role : roleList) {
            roleNameList.add(role.getName());
            roleIdList.add(role.getId());
        }
        ShiroUser shiroUser =
                new ShiroUser.Builder().setId(user.getId()).setLoginName(user.getLoginname()).setName(user.getName())
                        .setUsertype(user.getUsertype()).setRoleList(roleIdList).setRoleNameList(roleNameList).build();
        return new SimpleAuthenticationInfo(shiroUser, user.getPassword(), getName());
    }
}
