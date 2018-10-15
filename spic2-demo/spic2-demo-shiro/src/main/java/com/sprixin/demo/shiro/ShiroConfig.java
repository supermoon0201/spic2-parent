/**
 * Project Name:spic2-demo-shiro File Name:ShiroConfig.java Package Name:com.sprixin.demo.config
 * Date:2018年10月9日下午4:14:49 Copyright (c) 2018, SPRIXIN.com All Rights Reserved.
 */
package com.sprixin.demo.shiro;

import org.apache.shiro.realm.Realm;
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

    /**
     * 过滤规则<br/>
     * 
     * @return
     * @author le.yang
     */
    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
        chainDefinition.addPathDefinition("/", "anon");
        return chainDefinition;
    }
}
