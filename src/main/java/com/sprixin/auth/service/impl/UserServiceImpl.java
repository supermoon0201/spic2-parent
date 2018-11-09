package com.sprixin.auth.service.impl;

import com.sprixin.auth.model.User;
import com.sprixin.auth.mapper.UserMapper;
import com.sprixin.auth.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author le.yang
 * @since 2018-10-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
