package com.br.gabdev.access_api_visit.core.service;

import com.br.gabdev.access_api_visit.core.domain.Resident;
import com.br.gabdev.access_api_visit.core.ports.ResidentRepositoryPort;
import com.br.gabdev.access_api_visit.core.ports.ResidentServicePort;

public class ResidentService implements ResidentServicePort {
	
	private final ResidentRepositoryPort residentRepository;
	
	public ResidentService(ResidentRepositoryPort residentRepository) {
		this.residentRepository = residentRepository;
	}

	@Override
	public Resident createResident(Resident resident) {
		Resident isExist = residentRepository.findByCpf(resident.getCpf());
		if (isExist != null) {
			throw new IllegalArgumentException("Resident is exists!");
		}
		return residentRepository.create(resident);
	}


}
