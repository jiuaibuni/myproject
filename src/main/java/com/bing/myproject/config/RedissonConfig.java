package com.bing.myproject.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gby_d
 * @date 2021-11-01
 */
@Configuration
public class RedissonConfig {

    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private String port;

    private static final String ADDRESS_PREFIX = "redis://";

    private static final String ADDRESS_SUFFIX = ":";

    @Bean
    RedissonClient redissonClient(){

        Config config = new Config();
        config.useSingleServer()
                .setAddress(ADDRESS_PREFIX + host + ADDRESS_SUFFIX + port)
                .setDatabase(0);

        return Redisson.create(config);
    }
}
