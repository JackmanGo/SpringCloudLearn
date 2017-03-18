package com.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wang on 17-3-16.
 */
@RestController
public class FeignConsumerController {
    @Autowired
    public FeignConsumer feignConsumer;

    @RequestMapping(value = "/addInFeign", method = RequestMethod.GET)
    public Integer add() {
        return feignConsumer.add(10, 20);
    }

}
