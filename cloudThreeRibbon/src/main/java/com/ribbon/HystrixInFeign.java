package com.ribbon;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wang on 17-3-17.
 */
@Component
public class HystrixInFeign implements FeignConsumer {
    @Override
    String add(@RequestParam(value = "name") String g) {
        return null;
    }
}
