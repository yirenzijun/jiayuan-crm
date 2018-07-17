package com.jiayuan.crm.basetestjiayuancloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//服务注册
@EnableEurekaClient
@SpringBootApplication
//禁用security验证
@EnableAutoConfiguration(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
public class BaseTestJiayuanCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseTestJiayuanCloudApplication.class, args);
    }
}
