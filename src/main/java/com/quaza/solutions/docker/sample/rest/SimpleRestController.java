package com.quaza.solutions.docker.sample.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class SimpleRestController {


    @Value("${message}")
    private String customerMessage;

    //@GetMapping("/message")
    @RequestMapping("/message")
    private String getCustomerGreeting() {
        System.out.println("customerMessage = " + customerMessage);
        return customerMessage;
    }

}
