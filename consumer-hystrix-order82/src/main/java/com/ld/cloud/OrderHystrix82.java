package com.ld.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 28415@hand-china.com 2020/08/19 15:26
 */

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrix82 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrix82.class,args);
    }
}
