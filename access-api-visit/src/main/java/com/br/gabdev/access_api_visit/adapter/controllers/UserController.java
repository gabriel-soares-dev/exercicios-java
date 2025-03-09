package com.br.gabdev.access_api_visit.adapter.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.gabdev.access_api_visit.adapter.converters.UserConverter;
import com.br.gabdev.access_api_visit.adapter.dtos.UserDto;
import com.br.gabdev.access_api_visit.core.domain.User;
import com.br.gabdev.access_api_visit.core.ports.UserServicePort;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
public class UserController {
	
	private final UserServicePort userServicePort;
	private final UserConverter userConverter;

	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED, reason = "User created with success!")
	public UserDto createUser(@RequestBody UserDto userDto) {
		User newUser = userServicePort.createUser(userConverter.toDomain(userDto));
		return userConverter.toDto(newUser);
	}
	
}
