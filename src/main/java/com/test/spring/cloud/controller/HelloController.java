package com.test.spring.cloud.controller;

import com.test.spring.cloud.Hystrix.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JINRUN.XIE
 * @since 2018/7/10
 */
@RestController
public class HelloController {

    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping(value = "/hello/{name}")
    public String hello(@PathVariable(name = "name") String name) {
        return helloRemote.hello(name);
    }
}
