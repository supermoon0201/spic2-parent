package com.sprixin.demo.dao;

import com.sprixin.demo.model.Role;

import java.util.List;

/**
 * 角色DAO<br/>
 * <br/>
 * 创建时间： 2018年10月15日 下午2:13:45 <br/>
 * 
 * @author le.yang
 */
public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    /**
     * 根据用户id查询角色列表<br/>
     * 
     * @param userId 用户id
     * @return 角色列表
     * @author le.yang
     */
    List<Role> listRoleByUserId(Long userId);
}
