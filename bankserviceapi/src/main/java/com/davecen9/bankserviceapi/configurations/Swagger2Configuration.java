package com.davecen9.bankserviceapi.configurations;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;




@Configuration
//@EnableSwagger2
@EnableSwagger2WebMvc
public class Swagger2Configuration {
	
//	
//	  public static final Contact DEFAULT_CONTACT = new Contact("dave", "davecen9", "davecen9@gmail.com");
//	  public static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
//			  "Bank Service API Title", 
//			  "Bank Service API Description", 
//			  "1.0", 
//			  "urn:tos",
//	          DEFAULT_CONTACT, 
//	          "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>());
//	
//	  private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = 
//			  new HashSet<String>(Arrays.asList("application/json","application/xml"));
//
//
//
//	
//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("com.davecen9.bankserviceapi.controllers"))
//				.build()
//				.apiInfo(DEFAULT_API_INFO)
//				.consumes(DEFAULT_PRODUCES_AND_CONSUMES)
//				.produces(DEFAULT_PRODUCES_AND_CONSUMES)
//				;
//	}
	
    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.davecen9.bankserviceapi.controllers"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "BankService API",
                "BankService API Documentation",
                "0.0.1-SNAPSHOT",
                "Terms of Service",
                new Contact("Fanliang Cen",
                        "https://davecen9.com",
                        "davecen9@gmail.com"),
                "",
                "",
                Collections.emptyList());
    }
}
