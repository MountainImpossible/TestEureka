package com.eureka.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("callHello")
    public String callHelloService() {
        System.out.println("call hello...");
        return restTemplate.getForObject("http://localhost:8080/hello", String.class);
    }
}
