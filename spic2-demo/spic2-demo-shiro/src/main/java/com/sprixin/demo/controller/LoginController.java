package com.sprixin.demo.controller;

import com.sprixin.core.model.Result;
import com.sprixin.demo.model.User;
import com.sprixin.demo.service.LoginService;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录Controller
 * 
 * @author le.yang
 * @date 2018年10月14日
 */
@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public Result login(User user) {
        return loginService.login(user);
    }

    @GetMapping("/forecast/forecast")
    // @RequiresPermissions中的值要和resource中的url完全一致，否则无法匹配
    @RequiresPermissions("123/forecast")
    public Result testPermission() {
        return Result.ok("有权限");
    }
}
