package com.dench.clouddemo.eurekaproducer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProducer2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProducer2Application.class, args);
    }

}

