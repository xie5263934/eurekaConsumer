package com.test.spring.cloud.Hystrix;

import com.test.spring.cloud.Hystrix.impl.HelloRemoteImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author JINRUN.XIE
 * @since 2018/7/10
 */
@FeignClient(name = "spring-cloud-producer", fallback = HelloRemoteImpl.class)
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(name = "name") String name);
}
