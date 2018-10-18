/**
 * Project Name:spic2-demo-shiro File Name:ShiroConfig.java Package Name:com.sprixin.demo.config
 * Date:2018年10月9日下午4:14:49 Copyright (c) 2018, SPRIXIN.com All Rights Reserved.
 */
package com.sprixin.demo.config.shiro;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * shiro配置文件<br/>
 * <br/>
 * 创建时间： 2018年10月9日 下午4:14:49 <br/>
 * 
 * @author le.yang
 */
@Configuration
public class ShiroConfig {
    /**
     * 自定义Realm<br/>
     * 
     * @return Realm
     * @author le.yang
     */
    @Bean
    public Realm realm() {
        return new ShiroRealm();
    }

    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
        return new DefaultShiroFilterChainDefinition();
    }

    @Bean(name = "shiroFilter")
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        // 添加自定义过滤器
        Map<String, Filter> filterMap = new LinkedHashMap<>();
        filterMap.put("authc", new AjaxPermissionsAuthorizationFilter());
        shiroFilterFactoryBean.setFilters(filterMap);
        // 配置shiro拦截器链
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
        filterChainDefinitionMap.put("/", "anon");
        filterChainDefinitionMap.put("/static/**", "anon");
        filterChainDefinitionMap.put("/login", "anon");
        filterChainDefinitionMap.put("/logout", "anon");
        filterChainDefinitionMap.put("/**", "authc");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }


}
