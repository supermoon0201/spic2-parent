package com.sprixin.demo.dao;

import com.sprixin.demo.model.Resource;

import java.util.Set;

public interface ResourceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);

    /**
     * 根据角色id查询资源url集合<br/>
     * 
     * @param roleId 角色id
     * @return url集合
     * @author le.yang
     */
    Set<String> listResourceUrlByRoleId(Long roleId);
}
