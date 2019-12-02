package com.springboot.zzd.djh.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @author: zhendong.Z
 * @date: 2019-11-22 16:28
 */
public class RedisBean {

    private StringRedisTemplate redisTemplate;

    @Autowired
    public RedisBean(StringRedisTemplate template) {
        this.redisTemplate = template;
    }
}
