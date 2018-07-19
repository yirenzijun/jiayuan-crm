package com.jiayuan.crm.ribbonconsumerspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//让该应用注册为 Eureka 客户端应用， 以获得服务发现的能力
@EnableDiscoveryClient
@SpringBootApplication
//禁用security验证
@EnableAutoConfiguration(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
//开启断路器
@EnableCircuitBreaker
public class RibbonConsumerSpringCloudApplication {

    @Bean
    @LoadBalanced //开启客户端负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(RibbonConsumerSpringCloudApplication.class, args);
    }
}
