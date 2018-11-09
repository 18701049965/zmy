package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class hystrixRunApp {
public static void main(String[] args) {
	SpringApplication.run(hystrixRunApp.class, args);
}
}
