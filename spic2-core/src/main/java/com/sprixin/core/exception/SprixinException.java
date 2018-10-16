/**
 * Project Name:spic2-core
 * File Name:SprixinException.java
 * Package Name:com.sprixin.core.exception
 * Date:2018年10月16日下午5:59:51
 * Copyright (c) 2018, SPRIXIN.com All Rights Reserved.
 */
package com.sprixin.core.exception;

/**
 * 自定义异常<br/>
 * <br/>
 * 创建时间： 2018年10月16日 下午5:59:51 <br/>
 * 
 * @author le.yang
 */
public class SprixinException extends RuntimeException {
    private static final long serialVersionUID = -1661690309452674771L;

    private String msg;
    private int code = 500;

    public SprixinException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public SprixinException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public SprixinException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public SprixinException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
