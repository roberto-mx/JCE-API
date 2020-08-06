package com.amdocs.jceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableJpaRepositories
public class JseDataLayerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JseDataLayerApiApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurer() {
	                @Override
	                public void addCorsMappings(CorsRegistry registry) {
	                        registry.addMapping("/**")
	                                .allowedOrigins("https://jaliscoempleo.herokuapp.com/")
	                                .allowedMethods("GET", "POST", "PUT", "DELETE")
	                                .maxAge(3600);
	                }

	        };
	}
}
