package com.br.gabdev.access_api_visit.core.ports;

import java.util.Optional;

import com.br.gabdev.access_api_visit.core.domain.Visitor;

public interface VisitorRepositoryPort {
	
	public Visitor create(Visitor visitor);
	
	public Optional<Visitor> findByCpf(String cpf);
	
	public Optional<Visitor> findByRg(String rg);

}
