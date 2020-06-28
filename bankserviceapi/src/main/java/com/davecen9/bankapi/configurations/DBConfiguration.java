package com.davecen9.bankapi.configurations;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Configuration
@EnableConfigurationProperties(VaultConfiguration.class)
@Data
public class DBConfiguration {

	
	private static final Logger logger = LoggerFactory.getLogger(DBConfiguration.class);
	
	@Value("${db_url}")
	private String url;
	
	@Value("${db_username}")
	private String username;

	@Value("${db_password}")
	private String password;
	
	@Value("${db_driver}")
	private String driverClassName;


	private final VaultConfiguration vaultConfiguration;
	
	public DBConfiguration(VaultConfiguration configuration) {
		this.vaultConfiguration=configuration;
	}
	
	
	
	@Profile("prod")
	@Bean
	public DataSource prodDataSource() {
		DataSourceBuilder builder = DataSourceBuilder.create();
	    logger.info("----------------------------------------");
	    logger.info("Configuration properties");
	    logger.info("   mysql.username is {}", vaultConfiguration.getUsername());
	    logger.info("   mysql.password is {}", vaultConfiguration.getPassword());
	    logger.info("----------------------------------------");
	    
		builder.url(url);
		
		
//		builder.username(vaultConfiguration.getUsername());
//
//		System.out.println(vaultConfiguration.getUsername()+" "+vaultConfiguration.getPassword());
//		
//		
//		builder.password(vaultConfiguration.getPassword());
		
		
		builder.username(username);
		
		
		builder.password(password);
		
		builder.driverClassName(driverClassName);
		
		
		
		System.out.println("Production...");
		
		return builder.build();
		
	}
	
}
