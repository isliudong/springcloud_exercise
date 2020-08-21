package com.ld.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 28415@hand-china.com 2020/08/19 09:12
 */
@SpringBootApplication
@EnableFeignClients
public class OderApplication81 {
    public static void main(String[] args) {
        SpringApplication.run(OderApplication81.class,args);
    }
}
