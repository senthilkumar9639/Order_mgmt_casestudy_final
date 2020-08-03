package com.cognizant.AccessoryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.cognizant.AccessoryService")
@EnableDiscoveryClient

public class AccessoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessoryServiceApplication.class, args);
	}

}
