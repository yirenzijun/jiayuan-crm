package com.jiayuan.crm.feignconsumerspringcloud.service;

import com.jiayuan.crm.feignconsumerspringcloud.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

//指定服务名来绑定服务
@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping(value = "/hello")
    String hello();

    @RequestMapping(value = "hello1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "hello2", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "hello3", method = RequestMethod.GET)
    String hello(@RequestBody User user);
}
