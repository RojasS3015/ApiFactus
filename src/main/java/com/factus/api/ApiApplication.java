package com.factus.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Le dice a Java: “Esto es un programa Spring Boot, y tiene todo lo necesario para arrancar
public class ApiApplication {

	public static void main(String[] args) {//main() ➜ Es como apretar el botón “ON”. Le dice a Spring: “¡Comienza el show!”.
		SpringApplication.run(ApiApplication.class, args);
	}

}
