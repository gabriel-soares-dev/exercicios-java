package com.br.gabdev.access_api_visit.adapter.repositories;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.br.gabdev.access_api_visit.adapter.entities.UserEntity;
import com.br.gabdev.access_api_visit.core.domain.User;
import com.br.gabdev.access_api_visit.core.ports.UserRepositoryPort;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryPort{
	
	private final UserRepository userRepository;
	private final ModelMapper modelMapper;

	@Override
	public User create(User user) {
		UserEntity newUser = userRepository.save(modelMapper.map(user, UserEntity.class));
		return modelMapper.map(newUser, User.class);
	}

}
