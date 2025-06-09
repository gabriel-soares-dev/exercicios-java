package com.br.gabdev.access_api_visit.infra;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.br.gabdev.access_api_visit.core.ports.ResidentRepositoryPort;
import com.br.gabdev.access_api_visit.core.ports.ResidentServicePort;
import com.br.gabdev.access_api_visit.core.ports.UserRepositoryPort;
import com.br.gabdev.access_api_visit.core.ports.UserServicePort;
import com.br.gabdev.access_api_visit.core.ports.VisitorRepositoryPort;
import com.br.gabdev.access_api_visit.core.ports.VisitorServicePort;
import com.br.gabdev.access_api_visit.core.service.ResidentService;
import com.br.gabdev.access_api_visit.core.service.UserService;
import com.br.gabdev.access_api_visit.core.service.VisitorService;

@Configuration
public class BeansConfig {

	@Bean
	public UserServicePort userServicePortImpl(UserRepositoryPort userRepositoryPort) {
		return new UserService(userRepositoryPort);
	}
	
	@Bean
	public ResidentServicePort residentServicePortImpl(ResidentRepositoryPort residentRepositoryPort) {
		return new ResidentService(residentRepositoryPort);
	}
	
	@Bean
	public VisitorServicePort visitorServicePort(VisitorRepositoryPort visitorRepositoryPort) {
		return new VisitorService(visitorRepositoryPort);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
}
