package com.tietoevry.teis.pe.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tietoevry.teis.pe.service.CacheService;
import org.springframework.beans.factory.annotation.Value;


@RestController
@RequestMapping("/cache")
public class CacheController {

    @Value("${infinispan.cache.name}") 
    private String cacheName;

    @Autowired
    private CacheService cacheService;

    @PostMapping("/add")
    public String addToCache(@RequestParam String key, @RequestParam String value) {
        cacheService.addToCache(key, value);
        return "Added to cache: " + cacheName;
    }

    @GetMapping("/get")
    public Object getFromCache(@RequestParam String key) {
        return cacheService.getFromCache(key);
    }

    @DeleteMapping("/remove")
    public String removeFromCache(@RequestParam String key) {
        cacheService.removeFromCache(key);
        return "Removed from cache: " + cacheName;
    }
}