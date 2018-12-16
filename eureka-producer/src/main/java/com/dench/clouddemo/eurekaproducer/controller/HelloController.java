package com.dench.clouddemo.eurekaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String index() throws Exception{
        List<ServiceInstance> instances = client.getInstances("eureka-producer");
        ServiceInstance instance = instances.get(0);

        //让处理线程等待几秒钟
        int sleepTime = new Random().nextInt(2000);
        System.out.println("sleepTime: "+sleepTime);
        Thread.sleep(sleepTime);

        System.out.println(instance.getHost()+", "+instance.getServiceId());
        return "hello world";
    }


}
