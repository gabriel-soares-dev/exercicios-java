package com.br.gabdev.access_api_visit.core.service;

import com.br.gabdev.access_api_visit.core.domain.User;
import com.br.gabdev.access_api_visit.core.ports.UserRepositoryPort;
import com.br.gabdev.access_api_visit.core.ports.UserServicePort;

public class UserService implements UserServicePort{

	private final UserRepositoryPort userRepositoryPort;
	
	public UserService(UserRepositoryPort userRepositoryPort) {
		this.userRepositoryPort = userRepositoryPort;
	}

	@Override
	public User createUser(User user) {
		return userRepositoryPort.create(user);
	}

}
