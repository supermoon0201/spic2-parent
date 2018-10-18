package com.sprixin.demo.config.shiro;

import java.io.Serializable;
import java.util.List;

/**
 * 自定义Authentication对象，使得Subject除了携带用户的登录名外还可以携带更多信息<br/>
 * <br/>
 * 创建时间： 2016年10月12日 下午2:13:34 <br/>
 * 
 * @author yaonp
 */
public class ShiroUser implements Serializable {

    private static final long serialVersionUID = -1373760761780840081L;
    public Long id;
    public String loginName;
    public String name;
    public Byte usertype;
    public List<Long> roleList;
    public List<String> roleNameList;

    public ShiroUser() {
        super();
    }

    public ShiroUser(Long id, String loginName, String name, Byte usertype, List<Long> roleList,
            List<String> roleNameList) {
        this.id = id;
        this.loginName = loginName;
        this.name = name;
        this.usertype = usertype;
        this.roleList = roleList;
        this.roleNameList = roleNameList;
    }

    /**
     * 本函数输出将作为默认的<shiro:principal/>输出.
     */
    @Override
    public String toString() {
        return loginName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getUsertype() {
        return usertype;
    }

    public void setUsertype(Byte usertype) {
        this.usertype = usertype;
    }

    public List<Long> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Long> roleList) {
        this.roleList = roleList;
    }

    public List<String> getRoleNameList() {
        return roleNameList;
    }

    public void setRoleNameList(List<String> roleNameList) {
        this.roleNameList = roleNameList;
    }

    public static class Builder {
        private ShiroUser shiroUser;

        public Builder() {
            shiroUser = new ShiroUser();
        }

        public Builder setId(Long id) {
            shiroUser.setId(id);
            return this;
        }

        public Builder setLoginName(String loginName) {
            shiroUser.setLoginName(loginName);
            return this;
        }

        public Builder setName(String name) {
            shiroUser.setName(name);
            return this;
        }

        public Builder setUsertype(Byte usertype) {
            shiroUser.setUsertype(usertype);
            return this;
        }

        public Builder setRoleList(List<Long> roleList) {
            shiroUser.setRoleList(roleList);
            return this;
        }

        public Builder setRoleNameList(List<String> roleNameList) {
            shiroUser.setRoleNameList(roleNameList);
            return this;
        }

        public ShiroUser build() {
            return shiroUser;
        }
    }
}
