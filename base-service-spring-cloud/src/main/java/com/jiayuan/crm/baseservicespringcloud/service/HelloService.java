package com.jiayuan.crm.baseservicespringcloud.service;

import com.jiayuan.crm.basetoolsspringcloud.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/refactor")
public interface HelloService {
    @RequestMapping(value = "/hello4", method= RequestMethod.GET)
    String hello(@RequestParam("name") String name) ;

    @RequestMapping(value= "/hello5", method= RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer
            age);
}
