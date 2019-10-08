package com.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: mySpringCloud
 * @description:
 * @author: 李晶敏
 * @create: 2019-09-30 16:19
 **/
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }

    @GetMapping(value = "/index")
    public String index(@RequestParam String name) {
        return helloService.hiService(name);
    }


}
