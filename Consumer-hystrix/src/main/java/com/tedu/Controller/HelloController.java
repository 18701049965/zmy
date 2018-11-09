package com.tedu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tedu.client.EurekaServiceFeign;

@RestController

public class HelloController {
	@Autowired
	private EurekaServiceFeign eurekaServiceFeign;
	@RequestMapping("/hello/{name}")
	@HystrixCommand(fallbackMethod="hystrixFollback")
	public String hello(@PathVariable String name){
		return eurekaServiceFeign.hello(name);
		
	}
	public String hystrixFollback(String name){
		return "123";
		
	}
}
