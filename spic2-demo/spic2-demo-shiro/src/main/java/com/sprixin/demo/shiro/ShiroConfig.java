/**
 * Project Name:spic2-demo-shiro
 * File Name:ShiroConfig.java
 * Package Name:com.sprixin.demo.config
 * Date:2018年10月9日下午4:14:49
 * Copyright (c) 2018, SPRIXIN.com All Rights Reserved.
 */
package com.sprixin.demo.shiro;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
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
    @Bean
    public ShiroFilterFactoryBean ShiroFilter(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        return shiroFilterFactoryBean;
    }

    /**
     * Shiro生命周期处理器
     */
    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }


}
