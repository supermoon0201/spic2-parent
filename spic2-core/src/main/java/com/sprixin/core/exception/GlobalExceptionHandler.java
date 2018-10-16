/**
 * Project Name:spic2-core
 * File Name:GlobalExceptionHandler.java
 * Package Name:com.sprixin.core.exception
 * Date:2018年10月16日下午3:58:38
 * Copyright (c) 2018, SPRIXIN.com All Rights Reserved.
 */
package com.sprixin.core.exception;

import com.sprixin.core.model.Result;

import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * 统一异常处理<br/>
 * <br/>
 * 创建时间： 2018年10月16日 下午3:58:38 <br/>
 * 
 * @author le.yang
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理自定义异常<br/>
     * 
     * @param e SprixinException
     * @return Result
     * @author le.yang
     */
    @ExceptionHandler(SprixinException.class)
    public Result handleRRException(SprixinException e) {
        logger.error(e.getMsg(), e);
        return Result.error(e.getCode(), e.getMsg());
    }

    /**
     * 404异常处理<br/>
     * 
     * @param e NoHandlerFoundException
     * @return Result
     * @author le.yang
     */
    @ExceptionHandler(NoHandlerFoundException.class)
    public Result handlerNoFoundExResulteption(Exception e) {
        String msg = "路径不存在，请检查路径是否正确";
        logger.error(msg, e);
        return Result.error(404, msg);
    }

    /**
     * 没有权限异常处理<br/>
     * 
     * @param e AuthorizationException
     * @return Result
     * @author le.yang
     */
    @ExceptionHandler(AuthorizationException.class)
    public Result handleAuthorizationException(AuthorizationException e) {
        String msg = "没有权限，请联系管理员授权";
        logger.error(msg, e);
        return Result.error(msg);
    }

    /**
     * 未知异常处理<br/>
     * 
     * @param e Exception
     * @return Result
     * @author le.yang
     */
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e) {
        logger.error(e.getMessage(), e);
        return Result.error();
    }
}
