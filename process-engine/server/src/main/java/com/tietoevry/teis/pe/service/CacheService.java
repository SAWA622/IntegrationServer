package com.tietoevry.teis.pe.service;

import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class CacheService {

    @Autowired
    private RemoteCacheManager remoteCacheManager;

    @Value("${infinispan.cache.name}") 
    private String cacheName;

    private RemoteCache<String, Object> cache;

    @PostConstruct
    public void init() {
        cache = remoteCacheManager.getCache(cacheName); 
    }

    public void addToCache(String key, Object value) {
        cache.put(key, value);
    }

    public Object getFromCache(String key) {
        return cache.get(key);
    }

    public void removeFromCache(String key) {
        cache.remove(key);
    }
}