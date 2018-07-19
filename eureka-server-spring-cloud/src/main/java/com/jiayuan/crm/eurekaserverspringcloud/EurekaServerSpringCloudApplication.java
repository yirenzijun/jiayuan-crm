package com.jiayuan.crm.eurekaserverspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerSpringCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerSpringCloudApplication.class, args);
    }
}
