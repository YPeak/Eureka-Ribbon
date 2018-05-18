package com.example.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * Created by shuwei.yu.
 * on 2018/5/17.
 */
@RestController
public class clientController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("didi/{id}")
    public String findOrderByClient(@PathVariable String id){
//        客户端负载均衡Ribbon下 http求情中可以用配置文件中的name属性代替ip+端口号- "orderName"
        return this.restTemplate.getForObject("http://orderName/order"+id,String.class);
//        return this.restTemplate.getForObject("http://localhost:7900/order/"+id,String.class);
    }

}
