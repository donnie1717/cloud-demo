package com.dench.clouddemo.eurekaproducer2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String index(){
        List<ServiceInstance> instances = client.getInstances("eureka-producer");
        ServiceInstance instance = instances.get(1);
        System.out.print(instance.getHost()+", "+instance.getServiceId());
        return "hello world";
    }

}
