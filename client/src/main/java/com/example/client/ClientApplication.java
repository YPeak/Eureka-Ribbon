package com.example.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientApplication {

	@Bean
	@LoadBalanced //客户端实例负载均衡
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	@RequestMapping("hello")
	public String home(){
		return "test Eureka-client!";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
}
