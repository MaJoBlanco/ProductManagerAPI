package com.product.ProductManagerAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductManagerApiApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ProductManagerApiApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ProductManagerApiApplication.class);
	}
}
