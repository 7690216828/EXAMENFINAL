package com.example.pruebaCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PruebaCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaCrudApplication.class, args);
	}


	@Bean
	public WebMvcConfigurer corsConfigurer(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry){
				registry.addMapping("/CRUDRepo/ConsultarProducto").allowedOrigins("http://localhost/8080").allowedMethods("*").allowedHeaders("*");
			}
		};
	}


}
