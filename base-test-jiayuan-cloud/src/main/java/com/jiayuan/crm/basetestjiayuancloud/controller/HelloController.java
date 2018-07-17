package com.jiayuan.crm.basetestjiayuancloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
public class HelloController {
    private final Logger logger=LoggerFactory.getLogger(getClass());

    @Autowired
    private Registration registration;// 服务注册

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        List<ServiceInstance> instances=client.getInstances(registration.getServiceId());
        if (instances != null && instances.size() > 0) {
            logger.info("/hello,host:" + instances.get(0).getHost()+", service_id:"+instances.get(0).getServiceId());
        }
        return "hello world";
    }
}
