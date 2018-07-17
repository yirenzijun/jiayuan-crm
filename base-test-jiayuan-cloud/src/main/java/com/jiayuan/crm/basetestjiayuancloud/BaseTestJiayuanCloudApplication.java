package com.jiayuan.crm.basetestjiayuancloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//服务注册
@EnableEurekaClient
@SpringBootApplication
public class BaseTestJiayuanCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseTestJiayuanCloudApplication.class, args);
    }
}
