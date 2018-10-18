/**
 * Project Name:spic2-demo-shiro
 * File Name:UserTokenService.java
 * Package Name:com.sprixin.demo.service
 * Date:2018年10月17日上午10:49:21
 * Copyright (c) 2018, SPRIXIN.com All Rights Reserved.
 */
package com.sprixin.demo.service;

import com.sprixin.core.model.Result;

/**
 * UserToken Service接口<br/>
 * <br/>
 * 创建时间： 2018年10月17日 上午10:49:21 <br/>
 * 
 * @author le.yang
 */
public interface UserTokenService {
    /**
     * 生成token<br/>
     * 
     * @param userId 用户id
     * @return Result
     * @author le.yang
     */
    Result createToken(Long userId);

    /**
     * 退出，修改token值<br/>
     * 
     * @param userId 用户id
     * @author le.yang
     */
    void logout(Long userId);
}
