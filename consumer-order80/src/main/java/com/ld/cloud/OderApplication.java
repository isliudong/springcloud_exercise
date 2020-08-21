package com.ld.cloud;

import com.ld.ribbon.MyselfRules;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 订单服务
 * 通过@RibbonClient(name = "cloud-payment-service",configuration = MyRules.class)使用自定义Ribbon负载均衡配置
 * @author 28415@hand-china.com 2020/08/16 11:39
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "cloud-payment-service",configuration = MyselfRules.class)
public class OderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OderApplication.class,args);
    }

}
