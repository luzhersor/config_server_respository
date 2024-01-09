package com.todocodeacademy.citiesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients  //Cities va a consumir a hotels
public class CitiesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitiesServiceApplication.class, args);
	}

}
