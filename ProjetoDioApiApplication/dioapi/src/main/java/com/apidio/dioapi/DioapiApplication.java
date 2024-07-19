package com.apidio.dioapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DioapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioapiApplication.class, args);
	}

}
