package com.gavaskar.emoApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;


@OpenAPIDefinition
@Configuration

public class SwaggerConfig {
    
    @Bean
    public OpenAPI basicopOpenAPI() {
		return new OpenAPI().info(new Info()
				.title("Employee Management H2 Database")
				.version("2.0.3")
				.description("Employee App")
				
				);
				
	}
   
}
