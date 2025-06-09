package com.br.gabdev.access_api_visit.adapter.repositories;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.br.gabdev.access_api_visit.adapter.entities.VisitorEntity;
import com.br.gabdev.access_api_visit.core.domain.Visitor;
import com.br.gabdev.access_api_visit.core.ports.VisitorRepositoryPort;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class VisitorRepositoryImpl implements VisitorRepositoryPort{
	
	private VisitorRepository visitorRepository;
	private PersonRepositoryImpl personRepository;
	private ModelMapper modelMapper;

	@Override
	public Visitor create(Visitor visitor) {
		
		VisitorEntity newVisitor = modelMapper.map(visitor, VisitorEntity.class);
		newVisitor.setPerson(personRepository.createPerson(visitor.getPerson()));
		VisitorEntity visitorSave = visitorRepository.save(newVisitor);
		
		return modelMapper.map(visitorSave, Visitor.class);
	}

	@Override
	public Optional<Visitor> findByCpf(String cpf) {
		return visitorRepository.findByCpf(cpf).map(visitEntity -> modelMapper.map(visitEntity, Visitor.class));
	}

	@Override
	public Optional<Visitor> findByRg(String rg) {
		return visitorRepository.findByRg(rg).map(visitEntity -> modelMapper.map(visitEntity, Visitor.class));
	}

}
