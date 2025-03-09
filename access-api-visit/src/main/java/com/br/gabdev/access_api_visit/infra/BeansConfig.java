package com.br.gabdev.access_api_visit.infra;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.br.gabdev.access_api_visit.core.ports.UserRepositoryPort;
import com.br.gabdev.access_api_visit.core.ports.UserServicePort;
import com.br.gabdev.access_api_visit.core.service.UserService;

@Configuration
public class BeansConfig {

	@Bean
	public UserServicePort userServicePortImpl(UserRepositoryPort userRepositoryPort) {
		return new UserService(userRepositoryPort);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
}
