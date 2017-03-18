package com.ribbon;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wang on 17-3-16.
 */
@FeignClient(value = "compute-service",fallback = HystrixInFeign.class)
public interface FeignConsumer {
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer g, @RequestParam(value = "b") Integer h);
}
