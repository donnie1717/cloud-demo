package com.dench.clouddemo.ribbonconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService(){

        long start = System.currentTimeMillis();

        String result = restTemplate.getForEntity("http://eureka-producer/hello", String.class).getBody();

        long end = System.currentTimeMillis();
        System.out.println("Spend time : "+(end-start));

        return result;
    }

    public String helloFallback(){
        return "error";
    }

}
