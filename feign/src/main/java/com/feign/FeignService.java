package com.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi", fallback = FeignServiceHystrix.class)
public interface FeignService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name")String name);

}
