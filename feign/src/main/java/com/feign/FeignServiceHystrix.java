package com.feign;

import org.springframework.stereotype.Component;

/**
 * @program: MySpringCloud
 * @description:
 * @author: 李晶敏
 * @create: 2019-10-08 11:30
 **/
@Component
public class FeignServiceHystrix implements FeignService{
    @Override
    public String sayHello(String name) {
        return "say error：" + name;
    }
}
