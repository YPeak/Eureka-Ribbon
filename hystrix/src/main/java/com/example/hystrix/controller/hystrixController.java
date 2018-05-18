package com.example.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by shuwei.yu.
 * on 2018/5/18.
 */
@RestController
public class hystrixController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("didiHystrix/{id}")
    @HystrixCommand(fallbackMethod = "fallBack")//断路器 打开时 调用方法‘fallBack’
    public String hystrixFindOrder(@PathVariable String id){
        return this.restTemplate.getForObject("http://orderName/order"+id,String.class);
    }

    public String fallBack(@PathVariable String id){ //断路时调用的方法
        return "测试断路器,参数："+id;
    }

}
