package com.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wang on 17-3-17.
 */
@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    public String addService() {
        return restTemplate.getForEntity("http://SAY-HELLO/sayHello?name=jackman", String.class).getBody();
    }
    public String addServiceFallback() {
        return "errorWithRibbon";
    }
}
