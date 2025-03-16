package com.br.gabdev.access_api_visit.core.ports;

import com.br.gabdev.access_api_visit.core.domain.User;

public interface UserRepositoryPort {

	public User create(User user);
	
	public User findByEmail(String email);
	
}
