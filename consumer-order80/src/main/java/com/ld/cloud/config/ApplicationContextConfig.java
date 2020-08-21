package com.ld.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 28415@hand-china.com 2020/08/16 12:01
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced//默认轮询
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
