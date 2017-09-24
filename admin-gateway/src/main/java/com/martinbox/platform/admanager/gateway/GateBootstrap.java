package com.martinbox.platform.admanager.gateway;


import com.martinbox.platform.admanager.gateway.utils.DBLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.session.data.redis.RedisFlushMode;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by Ace on 2017/6/2.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableZuulProxy
@EnableRedisHttpSession(redisFlushMode = RedisFlushMode.IMMEDIATE)
public class GateBootstrap {
    public static void main(String[] args) {
        DBLog.getInstance().start();
        SpringApplication.run(GateBootstrap.class, args);
    }
}
