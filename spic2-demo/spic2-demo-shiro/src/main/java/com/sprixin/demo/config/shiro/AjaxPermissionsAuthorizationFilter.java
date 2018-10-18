/**
 * Project Name:spic2-demo-shiro
 * File Name:AjaxPermissionsAuthorizationFilter.java
 * Package Name:com.sprixin.demo.config.shiro
 * Date:2018年10月18日下午2:49:23
 * Copyright (c) 2018, SPRIXIN.com All Rights Reserved.
 */
package com.sprixin.demo.config.shiro;

import com.google.gson.Gson;
import com.sprixin.core.model.Result;

import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

/**
 * 对没有登录的请求进行拦截, 全部返回json信息. 覆盖掉shiro原本的跳转login.jsp的拦截方式<br/>
 * <br/>
 * 创建时间： 2018年10月18日 下午2:49:23 <br/>
 * 
 * @author le.yang
 */
public class AjaxPermissionsAuthorizationFilter extends FormAuthenticationFilter {
    private static final Logger logger = LoggerFactory.getLogger(AjaxPermissionsAuthorizationFilter.class);

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        PrintWriter out = null;
        HttpServletResponse res = (HttpServletResponse) response;
        try {
            res.setCharacterEncoding("UTF-8");
            res.setContentType("application/json");
            out = response.getWriter();
            Gson gson = new Gson();
            out.println(gson.toJson(Result.error(HttpStatus.UNAUTHORIZED.value(), "没有权限")));
        } catch (Exception e) {
            logger.error("Shiro自定义过滤器异常", e);
        } finally {
            if (null != out) {
                out.flush();
                out.close();
            }
        }
        return false;
    }
}
