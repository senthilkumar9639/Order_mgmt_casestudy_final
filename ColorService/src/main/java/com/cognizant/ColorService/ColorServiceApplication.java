package com.cognizant.ColorService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.cognizant.ColorService")
@EnableDiscoveryClient
public class ColorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColorServiceApplication.class, args);
	}

}
