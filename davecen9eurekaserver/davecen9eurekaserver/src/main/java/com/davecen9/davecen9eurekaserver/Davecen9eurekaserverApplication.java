package com.davecen9.davecen9eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Davecen9eurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Davecen9eurekaserverApplication.class, args);
	}

}
