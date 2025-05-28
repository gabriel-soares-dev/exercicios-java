package com.br.gabdev.access_api_visit.core.ports;

import com.br.gabdev.access_api_visit.core.domain.Resident;

public interface ResidentRepositoryPort {

	public Resident create(Resident resident);
	
	public Resident findByCpf(String cpf);
	
}
