package com.davecen9.bankserviceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableAutoConfiguration(exclude=DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
public class BankapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankapiApplication.class, args);
	}

}
