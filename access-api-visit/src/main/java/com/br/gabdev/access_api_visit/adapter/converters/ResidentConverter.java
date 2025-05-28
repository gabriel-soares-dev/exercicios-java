package com.br.gabdev.access_api_visit.adapter.converters;

import org.springframework.stereotype.Component;

import com.br.gabdev.access_api_visit.adapter.dtos.ResidentDto;
import com.br.gabdev.access_api_visit.core.domain.Person;
import com.br.gabdev.access_api_visit.core.domain.Resident;

@Component
public class ResidentConverter {

	public Resident toDomain(ResidentDto residentDto) {
		return new Resident(residentDto.getId(), residentDto.getCpf(), residentDto.getAddress(),
				residentDto.getCellphone(), new Person(null, residentDto.getNamePerson()));
	}
	
	public ResidentDto toDto(Resident resident) {
		return new ResidentDto(resident.getId(), resident.getCpf(), resident.getAddress(), resident.getCellphone(),
				resident.getPerson().getName());
	}

}
