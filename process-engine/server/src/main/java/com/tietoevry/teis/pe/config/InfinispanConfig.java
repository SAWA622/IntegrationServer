package com.tietoevry.teis.pe.config;

import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.client.hotrod.configuration.ConfigurationBuilder;
import org.infinispan.client.hotrod.exceptions.HotRodClientException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InfinispanConfig {


    @Value("${infinispan.host}")
    private String host;

    @Value("${infinispan.port}")
    private int port;

    @Value("${infinispan.username}")
    private String username;

    @Value("${infinispan.password}")
    private String password;

    @Value("${infinispan.cache.name:TaskCache}") 
    private String cacheName;

    @Bean
    public RemoteCacheManager remoteCacheManager() {
        ConfigurationBuilder builder = new ConfigurationBuilder();
        builder.addServer()
               .host(host)
               .port(port)
               .security()
               .authentication()
               .username(username)
               .password(password)
               .maxRetries(10)
               .connectionTimeout(5000)
               .socketTimeout(5000);

        return new RemoteCacheManager(builder.build());
    }
}