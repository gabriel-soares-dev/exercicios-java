package com.br.gabdev.access_api_visit.adapter.converters;

import org.springframework.stereotype.Component;

import com.br.gabdev.access_api_visit.adapter.dtos.VisitorDto;
import com.br.gabdev.access_api_visit.core.domain.Person;
import com.br.gabdev.access_api_visit.core.domain.Visitor;

@Component
public class VisitorConverter {

	public Visitor toDomain(VisitorDto visitorDto) {
		return new Visitor(visitorDto.getId(), visitorDto.getTypeDoc(), visitorDto.getValueDoc(),
				new Person(null, visitorDto.getNamePerson()));
	}
	
	public VisitorDto toDto(Visitor visitor) {
		return new VisitorDto(visitor.getId(), visitor.getTypeDoc(), visitor.getValueDoc(), visitor.getPerson().getName());
	}

}
