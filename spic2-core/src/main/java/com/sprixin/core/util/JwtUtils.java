/**
 * Project Name:spic2-core
 * File Name:JwtUtils.java
 * Package Name:com.sprixin.core.util
 * Date:2018年10月17日上午11:22:58
 * Copyright (c) 2018, SPRIXIN.com All Rights Reserved.
 */
package com.sprixin.core.util;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * jwt工具类<br/>
 * <br/>
 * 创建时间： 2018年10月17日 上午11:22:58 <br/>
 * 
 * @author le.yang
 */
@ConfigurationProperties(prefix = "sprixin.jwt")
@Component
public class JwtUtils {
    private static final Logger logger = LoggerFactory.getLogger(JwtUtils.class);

    private String secret;
    private long expire;
    private String header;

    /**
     * 生成jwt token <br/>
     * 
     * @param userId 用户id
     * @return token
     * @author le.yang
     */

    public String generateToken(long userId) {
        Date nowDate = new Date();
        // 过期时间
        Date expireDate = new Date(nowDate.getTime() + expire * 1000);

        return Jwts.builder().setHeaderParam("typ", "JWT").setSubject(userId + "").setIssuedAt(nowDate)
                .setExpiration(expireDate).signWith(SignatureAlgorithm.HS512, secret).compact();
    }

    public Claims getClaimByToken(String token) {
        try {
            return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        } catch (Exception e) {
            logger.debug("validate is token error ", e);
            return null;
        }
    }

    /**
     * token是否过期 <br/>
     * 
     * @param expiration 时间
     * @return boolean
     * @author le.yang
     */

    public boolean isTokenExpired(Date expiration) {
        return expiration.before(new Date());
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public long getExpire() {
        return expire;
    }

    public void setExpire(long expire) {
        this.expire = expire;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
}
