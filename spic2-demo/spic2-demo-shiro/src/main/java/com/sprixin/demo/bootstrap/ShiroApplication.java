/**
 * Project Name:spic2-demo-shiro
 * File Name:ShiroAPP.java
 * Package Name:com.sprixin.demo.bootstrap
 * Date:2018年10月9日下午7:20:47
 * Copyright (c) 2018, SPRIXIN.com All Rights Reserved.
 */
package com.sprixin.demo.bootstrap;

import org.apache.shiro.realm.Realm;
import org.apache.shiro.realm.text.TextConfigurationRealm;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * 启动类<br/>
 * <br/>
 * 创建时间： 2018年10月9日 下午7:20:47 <br/>
 * 
 * @author le.yang
 */
@SpringBootApplication(scanBasePackages = {"com.sprixin.demo"})
@MapperScan("com.sprixin.demo.dao")
public class ShiroApplication {
    /**
     * main方法<br/>
     * 
     * @param args 参数
     * @author le.yang
     */
    public static void main(String[] args) {
        SpringApplication.run(ShiroApplication.class, args);
    }
}
