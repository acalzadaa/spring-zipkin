package com.alex.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Microservice3Config {
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
