package com.test.spring.cloud.Hystrix.impl;

import com.test.spring.cloud.Hystrix.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author JINRUN.XIE
 * @since 2018/7/10
 */
@Component
public class HelloRemoteImpl implements HelloRemote {

    @Override
    public String hello(@RequestParam(name = "name") String name) {
        return "hello " + name + ", this is message send failed";
    }
}
