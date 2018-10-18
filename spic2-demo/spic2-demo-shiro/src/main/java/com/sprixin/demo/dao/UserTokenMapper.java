package com.sprixin.demo.dao;

import com.sprixin.demo.model.UserToken;

public interface UserTokenMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(UserToken record);

    int insertSelective(UserToken record);

    UserToken selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(UserToken record);

    int updateByPrimaryKey(UserToken record);
}