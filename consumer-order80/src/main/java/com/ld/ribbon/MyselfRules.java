package com.ld.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 该配置不能放在@ComponentScan能扫描到的包下，否则将成为全局共享配置，达不到定制规则的目的
 * @author 28415@hand-china.com 2020/08/18 19:51
 */
@Configuration
public class MyselfRules {

    /**
     * 随机负载均衡算法
     */
    @Bean
    public IRule myRules(){
        return new RandomRule();
    }
}
