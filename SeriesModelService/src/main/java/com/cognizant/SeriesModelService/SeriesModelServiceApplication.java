package com.cognizant.SeriesModelService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.cognizant.SeriesModelService")
@EnableDiscoveryClient
public class SeriesModelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeriesModelServiceApplication.class, args);
	}

}
