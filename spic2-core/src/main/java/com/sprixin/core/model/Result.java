package com.sprixin.core.model;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

/**
 * 操作结果集<br/>
 * <br/>
 * 创建时间： 2016年8月29日 下午4:58:05 <br/>
 * 
 * @author yaonp
 */
public class Result implements Serializable {
    private static final long serialVersionUID = 5576237395711742681L;

    /** 错误码. */
    private Integer code;

    /** 成功失败标志 */
    private boolean success = false;

    /** 消息内容 **/
    private String msg = "";

    /** 返回结果 */
    private Object obj;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Result [code=" + code + ", success=" + success + ", msg=" + msg + ", obj=" + obj + "]";
    }

    /**
     * 返回错误码和错误信息<br/>
     * 
     * @param code 错误码
     * @param msg 错误信息
     * @return Result
     * @author le.yang
     */
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    /**
     * 返回500错误码，和默认信息<br/>
     * 
     * @return Result
     * @author le.yang
     */
    public static Result error() {
        return error(HttpStatus.INTERNAL_SERVER_ERROR.value(), "未知异常，请联系管理员");
    }

    /**
     * 返回错误码500，和自定义错误信息<br/>
     * 
     * @param msg 自定义错误信息
     * @return Result
     * @author le.yang
     */
    public static Result error(String msg) {
        return error(HttpStatus.INTERNAL_SERVER_ERROR.value(), msg);
    }

    /**
     * 返回自定义成功信息和封装数据<br/>
     * 
     * @param msg 自定义成功信息
     * @param obj 封装结果
     * @return
     * @author le.yang
     */
    public static Result ok(String msg, Object obj) {
        Result result = new Result();
        result.setSuccess(true);
        result.setMsg(msg);
        result.setObj(obj);
        return result;
    }


    /**
     * 返回成功，并封装结果<br/>
     * 
     * @param obj 封装结果
     * @return
     * @author le.yang
     */
    public static Result ok(Object obj) {
        return ok("", obj);
    }


    /**
     * 返回成功<br/>
     * 
     * @return Result
     * @author le.yang
     */
    public static Result ok() {
        Result result = new Result();
        result.setSuccess(true);
        return result;
    }

}
