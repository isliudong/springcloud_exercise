package com.ld.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


/**
 * 订单服务
 * 通过@RibbonClient(name = "cloud-payment-service",configuration = MyRules.class)使用自定义Ribbon负载均衡配置
 * @author 28415@hand-china.com 2020/08/16 11:39
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenter3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenter3344.class,args);
    }

}
