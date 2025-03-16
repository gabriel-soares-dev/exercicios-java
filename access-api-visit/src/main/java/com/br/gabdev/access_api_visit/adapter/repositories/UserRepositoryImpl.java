package com.br.gabdev.access_api_visit.adapter.repositories;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.br.gabdev.access_api_visit.adapter.entities.PersonEntity;
import com.br.gabdev.access_api_visit.adapter.entities.UserEntity;
import com.br.gabdev.access_api_visit.core.domain.Person;
import com.br.gabdev.access_api_visit.core.domain.User;
import com.br.gabdev.access_api_visit.core.ports.UserRepositoryPort;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryPort{
	
	private UserRepository userRepository;
	private PersonRepository personRepository;
	private ModelMapper modelMapper;

	@Override
	public User create(User user) {
		
		UserEntity newUser = modelMapper.map(user, UserEntity.class);
		newUser.setPerson(createPerson(user.getPerson()));
		
		UserEntity userSave = userRepository.save(newUser);
 		
		return modelMapper.map(userSave, User.class);
	}
	

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		UserEntity userFind = userRepository.findByEmail(email);
		if (userFind == null) {
			return null;
		}
		return modelMapper.map(userFind, User.class);
	}
	
	private PersonEntity createPerson(Person person) {
		PersonEntity newPerson= personRepository.save(modelMapper.map(person, PersonEntity.class));
		return newPerson;
	}

}
