package com.example.order.controller;


import com.example.order.Listener.ServiceInfoUtil;
import com.example.order.po.Order;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shuwei.yu.
 * on 2018/5/17.
 */
@RestController
public class orderController {

    @RequestMapping("order/{id}")
    public String findOderById(@PathVariable String id){
        Order order = new Order(1,"asdf","asdf","asdf","asdf");
        System.out.println(ServiceInfoUtil.port()+"添加完负载均衡后监听到的端口");
        return order.toString()+"id:"+id;
    }
    @RequestMapping("{id}")
    public String findOderById1(@PathVariable String id){
        Order order = new Order(1,"asdf","asdf","asdf","asdf");
        System.out.println(ServiceInfoUtil.port()+"添加完负载均衡后监听到的端口");
        return order.toString()+"id:"+id;
    }
}
