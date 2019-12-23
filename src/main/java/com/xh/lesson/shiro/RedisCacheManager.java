package com.xh.lesson.shiro;

import com.xh.lesson.service.RedisService;
import com.xh.lesson.utils.TokenSettings;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName: RedisCacheManager
 */
public class RedisCacheManager implements CacheManager {

    @Autowired
    private RedisService redisService;


    @Override
    public <K, V> Cache<K, V> getCache(String name) throws CacheException {
        return new RedisCache(name, redisService);
    }

}