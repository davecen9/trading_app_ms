package com.davecen9.bankapi.configurations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration
@EnableSwagger2WebMvc
public class Swagger2Configuration {
	
	
	  public static final Contact DEFAULT_CONTACT = new Contact("dave", "davecen9", "davecen9@gmail.com");
	  public static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
			  "Bank Service API Title", 
			  "Bank Service API Description", 
			  "1.0", 
			  "urn:tos",
	          DEFAULT_CONTACT, 
	          "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>());
	
	  private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = 
			  new HashSet<String>(Arrays.asList("application/json","application/xml"));



	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.davecen9.bankapi.controllers"))
				.build()
				.apiInfo(DEFAULT_API_INFO)
				.consumes(DEFAULT_PRODUCES_AND_CONSUMES)
				.produces(DEFAULT_PRODUCES_AND_CONSUMES)
				;
	}
	
}
