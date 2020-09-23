package com.mobilidade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MobilidadeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilidadeServiceApplication.class, args);
	}

}
