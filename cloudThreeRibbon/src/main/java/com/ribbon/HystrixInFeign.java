package com.ribbon;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wang on 17-3-17.
 */
@Component
public class HystrixInFeign implements FeignConsumer {
    @Override
    public Integer add(@RequestParam(value = "a") Integer g, @RequestParam(value = "b") Integer h) {
        return -9999;
    }
}
