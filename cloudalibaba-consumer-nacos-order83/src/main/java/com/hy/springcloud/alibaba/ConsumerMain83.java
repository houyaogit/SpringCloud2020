package com.hy.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：hy
 * @description：TODO
 * @date ：2020/11/18 22:50
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerMain83 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain83.class,args);
    }
}
