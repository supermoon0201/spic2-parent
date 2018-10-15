 package com.sprixin.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprixin.core.model.Result;
import com.sprixin.demo.model.User;
import com.sprixin.demo.service.LoginService;

/**登录Controller
 * @author le.yang
 * @date 2018年10月14日
 */
@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;
    
    @PostMapping("/login")
    public Result<?> login(User user) {
        return loginService.login(user);
    }
}
