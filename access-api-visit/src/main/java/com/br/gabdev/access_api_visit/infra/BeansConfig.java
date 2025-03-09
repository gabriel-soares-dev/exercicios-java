package com.br.gabdev.access_api_visit.infra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.br.gabdev.access_api_visit.core.ports.UserServicePort;
import com.br.gabdev.access_api_visit.core.service.UserService;

@Configuration
public class BeansConfig {

	@Bean
	public UserServicePort userServicePortImpl() {
		return new UserService();
	}
	
}
