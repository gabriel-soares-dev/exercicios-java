package com.br.gabdev.access_api_visit.core.ports;

import com.br.gabdev.access_api_visit.core.domain.User;

public interface UserServicePort {
	
	User createUser(User user);
}
