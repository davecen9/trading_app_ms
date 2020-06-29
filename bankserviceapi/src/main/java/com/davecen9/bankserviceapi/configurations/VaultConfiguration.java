package com.davecen9.bankserviceapi.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("tradingapp-config")
public class VaultConfiguration {

	private String username;
	
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
