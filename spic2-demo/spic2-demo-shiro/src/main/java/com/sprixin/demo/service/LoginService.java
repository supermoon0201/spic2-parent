package com.sprixin.demo.service;

import com.sprixin.core.model.Result;
import com.sprixin.demo.model.User;

/**
 * 登录Service接口
 * 
 * @author le.yang
 * @date 2018年10月14日
 */
public interface LoginService {
    Result login(User user);
}
