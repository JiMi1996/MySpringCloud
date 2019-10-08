package com.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: MySpringCloud
 * @description:
 * @author: 李晶敏
 * @create: 2019-10-08 11:10
 **/
@RestController
public class FeignController {

    @Autowired
    FeignService service;

    @GetMapping(value = "/feignhi")
    public String sayHi(@RequestParam String name) {
        return service.sayHello( name );
    }

}
