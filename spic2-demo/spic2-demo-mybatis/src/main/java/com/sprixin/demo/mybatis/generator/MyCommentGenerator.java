/**
 * Project Name:mybatis-generator-increace
 * File Name:MyCommentGenerator.java
 * Package Name:org.mybatis.generator
 * Date:2017年4月11日上午11:12:13
 * Copyright (c) 2017, SPRIXIN.com All Rights Reserved.
 */
package com.sprixin.demo.mybatis.generator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.internal.DefaultCommentGenerator;

/**
 * 自定义comment生成器，根据数据库的COMMENT来生成实体类的注释<br/>
 * <br/>
 * 创建时间： 2017年4月11日 上午11:12:13 <br/>
 * @author le.yang
 */
public class MyCommentGenerator extends DefaultCommentGenerator {

    /**
     * 重写类注释.
     * @see org.mybatis.generator.internal.DefaultCommentGenerator#addClassComment(org.mybatis.generator.api.dom.java.InnerClass, org.mybatis.generator.api.IntrospectedTable)
     */
    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
        StringBuilder sb = new StringBuilder();
        innerClass.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedTable.getFullyQualifiedTable());
        innerClass.addJavaDocLine(sb.toString());
        sb.setLength(0);
        sb.append(" * 创建时间： ");
        sb.append(getDateString());
        innerClass.addJavaDocLine(sb.toString());
        innerClass.addJavaDocLine(" ");
        innerClass.addJavaDocLine(" */");
    }
    
    /**
     * 重写类注释.
     * @see org.mybatis.generator.internal.DefaultCommentGenerator#addClassComment(org.mybatis.generator.api.dom.java.InnerClass, org.mybatis.generator.api.IntrospectedTable, boolean)
     */
    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
        StringBuilder sb = new StringBuilder();
        innerClass.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedTable.getFullyQualifiedTable());
        innerClass.addJavaDocLine(sb.toString());
        sb.setLength(0);
        sb.append(" * 创建时间： ");
        sb.append(getDateString());
        innerClass.addJavaDocLine(sb.toString());
        innerClass.addJavaDocLine(" ");
        innerClass.addJavaDocLine(" */");
    }
    
    /**
     * 重写日期字符串方法.
     * @see org.mybatis.generator.internal.DefaultCommentGenerator#getDateString()
     */
    @Override
    protected String getDateString() {
        Date d = new Date();
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 hh点mm分ss秒");  
        return df.format(d); 
    }
    
    /**
     * 重写字段注释.
     * @see org.mybatis.generator.internal.DefaultCommentGenerator#addFieldComment(org.mybatis.generator.api.dom.java.Field, org.mybatis.generator.api.IntrospectedTable, org.mybatis.generator.api.IntrospectedColumn)
     */
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable,
                                IntrospectedColumn introspectedColumn) {
        StringBuilder sb = new StringBuilder();

        field.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedColumn.getRemarks());
        field.addJavaDocLine(sb.toString());

        //      addJavadocTag(field, false);

        field.addJavaDocLine(" */");
    }
    
    /**
     * 重写setter方法注释.
     * @see org.mybatis.generator.internal.DefaultCommentGenerator#addSetterComment(org.mybatis.generator.api.dom.java.Method, org.mybatis.generator.api.IntrospectedTable, org.mybatis.generator.api.IntrospectedColumn)
     */
    @Override
    public void addSetterComment(Method method, IntrospectedTable introspectedTable,
                                 IntrospectedColumn introspectedColumn) {
        method.addJavaDocLine("/**");
        StringBuilder sb = new StringBuilder();
        sb.append(" * 设置");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString());

        Parameter parm = method.getParameters().get(0);
        sb.setLength(0);
        sb.append(" * @param ");
        sb.append(parm.getName());
        sb.append(" ");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString());

        //      addJavadocTag(method, false);

        method.addJavaDocLine(" */");
    }
    
    /**
     * 重写getter方法注释.
     * @see org.mybatis.generator.internal.DefaultCommentGenerator#addGetterComment(org.mybatis.generator.api.dom.java.Method, org.mybatis.generator.api.IntrospectedTable, org.mybatis.generator.api.IntrospectedColumn)
     */
    @Override
    public void addGetterComment(Method method, IntrospectedTable introspectedTable,
                                 IntrospectedColumn introspectedColumn) {
        method.addJavaDocLine("/**");

        StringBuilder sb = new StringBuilder();
        sb.append(" * 获取");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString());

        sb.setLength(0);
        sb.append(" * @return ");
        sb.append(introspectedColumn.getActualColumnName());
        sb.append(" ");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString());

        //      addJavadocTag(method, false);

        method.addJavaDocLine(" */");
    }
    
}
