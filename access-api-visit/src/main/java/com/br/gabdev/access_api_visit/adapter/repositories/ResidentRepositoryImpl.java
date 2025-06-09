package com.br.gabdev.access_api_visit.adapter.repositories;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.br.gabdev.access_api_visit.adapter.entities.ResidentEntity;
import com.br.gabdev.access_api_visit.core.domain.Resident;
import com.br.gabdev.access_api_visit.core.ports.ResidentRepositoryPort;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ResidentRepositoryImpl implements ResidentRepositoryPort{
	
	private ResidentRepository residentRepository;
	private PersonRepositoryImpl personRepository;
	private ModelMapper modelMapper;
	
	@Override
	public Resident create(Resident resident) {
		
		ResidentEntity newResident = modelMapper.map(resident, ResidentEntity.class);
		newResident.setPerson(personRepository.createPerson(resident.getPerson()));
		ResidentEntity saveResident = residentRepository.save(newResident);
		
		return modelMapper.map(saveResident, Resident.class) ;
	}

	@Override
	public Resident findByCpf(String cpf) {
		ResidentEntity byCpf = residentRepository.findByCpf(cpf);
		return byCpf == null ? null : modelMapper.map(byCpf, Resident.class);
	}

}
