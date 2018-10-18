package com.sprixin.demo.service.impl;

import com.sprixin.core.model.Result;
import com.sprixin.demo.model.User;
import com.sprixin.demo.service.LoginService;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

/**
 * 登录service实现类
 * 
 * @author le.yang
 * @date 2018年10月14日
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public Result login(User user) {
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token =
                new UsernamePasswordToken(user.getLoginname(), DigestUtils.md5Hex(user.getPassword()));
        currentUser.login(token);
        return Result.ok();
    }

    @Override
    public Result logout() {
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
        return Result.ok();
    }

}
