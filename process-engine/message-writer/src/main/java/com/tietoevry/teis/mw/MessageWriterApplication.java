package com.tietoevry.teis.mw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication()
@ComponentScan({"com.tietoevry.teis.mw","com.tietoevry.teis.pe.model","com.tietoevry.teis"})
public class MessageWriterApplication {
	public static void main(String[] args) {
		SpringApplication.run(MessageWriterApplication.class, args);
	} 
	
	
	@Autowired 
	ObjectMapper ojectMapper;
	
	
	
	@Bean
	public OpenAPI customOpenAPI(@Value("${application-description}") String appDesciption, @Value("${application-version}") String appVersion) {
	
		return new OpenAPI()
	      .info(new Info()
	      .title("Message Writer application API")
	      .version(appVersion)
	      .description(appDesciption)
	      .termsOfService("http://swagger.io/terms/")
	      .license(new License().name("TietoEvry 4.0").url("http://springdoc.org")));
	}
}