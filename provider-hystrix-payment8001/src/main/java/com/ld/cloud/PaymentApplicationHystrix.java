package com.ld.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author 28415@hand-china.com 2020/08/14 11:19
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class PaymentApplicationHystrix {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplicationHystrix.class,args);
    }
}
