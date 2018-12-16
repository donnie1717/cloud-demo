package com.dench.clouddemo.feignconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-producer")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();

}
