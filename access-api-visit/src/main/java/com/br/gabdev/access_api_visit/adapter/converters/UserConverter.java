package com.br.gabdev.access_api_visit.adapter.converters;

import org.springframework.stereotype.Component;

import com.br.gabdev.access_api_visit.adapter.dtos.UserDto;
import com.br.gabdev.access_api_visit.core.domain.Person;
import com.br.gabdev.access_api_visit.core.domain.User;

@Component
public class UserConverter {

	public User toDomain(UserDto userDto) {
		return new User(userDto.getId(), userDto.getName(), userDto.getEmail(), 
				userDto.getPassword(), userDto.getIsADM(),
				new Person(null, userDto.getName()));
	}
	
	public UserDto toDto(User user) {
		return new UserDto(user.getId(), user.getPerson().getName(), user.getEmail(), 
				user.getPassword(), user.getIsADM());
	}
	
}
