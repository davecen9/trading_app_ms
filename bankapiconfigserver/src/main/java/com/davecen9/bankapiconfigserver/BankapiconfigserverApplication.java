package com.davecen9.bankapiconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BankapiconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankapiconfigserverApplication.class, args);
	}

}
