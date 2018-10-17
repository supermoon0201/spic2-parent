package com.sprixin.demo.service.impl;

import com.sprixin.core.model.Result;
import com.sprixin.core.util.JwtUtils;
import com.sprixin.demo.model.User;
import com.sprixin.demo.service.LoginService;
import com.sprixin.demo.shiro.ShiroUser;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 登录service实现类
 * 
 * @author le.yang
 * @date 2018年10月14日
 */
@Service
public class LoginServiceImpl implements LoginService {
    private static Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

    @Autowired
    private JwtUtils jwtUtils;

    @Override
    public Result login(User user) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token =
                new UsernamePasswordToken(user.getLoginname(), DigestUtils.md5Hex(user.getPassword()));
        subject.login(token);
        ShiroUser currentUser = (ShiroUser) subject.getPrincipal();
        return Result.ok(jwtUtils.generateToken(currentUser.getId()));
    }

}
