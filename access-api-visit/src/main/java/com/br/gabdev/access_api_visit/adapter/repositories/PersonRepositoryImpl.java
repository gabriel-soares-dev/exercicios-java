package com.br.gabdev.access_api_visit.adapter.repositories;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.br.gabdev.access_api_visit.adapter.entities.PersonEntity;
import com.br.gabdev.access_api_visit.core.domain.Person;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PersonRepositoryImpl {
	
	private PersonRepository personRepository;
	private ModelMapper modelMapper;
	
	public PersonEntity createPerson(Person person) {
		PersonEntity newPerson = personRepository.save(modelMapper.map(person, PersonEntity.class));
		return newPerson;
	}

}
