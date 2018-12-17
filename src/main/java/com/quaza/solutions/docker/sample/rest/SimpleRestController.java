package com.quaza.solutions.docker.sample.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RefreshScope
public class SimpleRestController {


    @Value("${customer.message}")
    private String customerMessage;


    //@GetMapping("/message")
    @RequestMapping("/message-test")
    public String getCustomerGreeting() {
        System.out.println("customerMessage = " + customerMessage);
        return customerMessage;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("customerMessage = " + customerMessage);
    }
}
