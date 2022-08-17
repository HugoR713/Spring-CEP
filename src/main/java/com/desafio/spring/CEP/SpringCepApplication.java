package com.desafio.spring.CEP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCepApplication.class, args);
	}

}
