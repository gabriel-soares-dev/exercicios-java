package com.br.gabdev.access_api_visit.core.service;

import java.util.Optional;

import com.br.gabdev.access_api_visit.core.domain.Visitor;
import com.br.gabdev.access_api_visit.core.exception.BusinessException;
import com.br.gabdev.access_api_visit.core.ports.VisitorRepositoryPort;
import com.br.gabdev.access_api_visit.core.ports.VisitorServicePort;

public class VisitorService implements VisitorServicePort{

	private final VisitorRepositoryPort visitorRepositoryPort;
	
	public VisitorService(VisitorRepositoryPort visitorRepositoryPort) {
		this.visitorRepositoryPort = visitorRepositoryPort;
	}
	
	@Override
	public Visitor createVisitor(Visitor visitor) {
		Optional<Visitor> isExist = null;
		
		if ("RG".equalsIgnoreCase(visitor.getTypeDoc()) || "CPF".equalsIgnoreCase(visitor.getTypeDoc())) {
			if ("RG".equalsIgnoreCase(visitor.getTypeDoc())) {
				isExist = visitorRepositoryPort.findByRg(visitor.getValueDoc());
			}else if("CPF".equalsIgnoreCase(visitor.getTypeDoc())) {
				isExist = visitorRepositoryPort.findByCpf(visitor.getValueDoc());
			}
			
			isExist.ifPresent( exist -> {
				throw new BusinessException("Visitor is exists!");
			});
			
		}else {
			throw new BusinessException("Field 'typeDoc' is required!");
		}
		
		
		return visitorRepositoryPort.create(visitor);
	}

	@Override
	public Visitor obtainVisitor(String typeDoc) {
		Optional<Visitor> isExist = null;
		
		if ("RG".equalsIgnoreCase(typeDoc) || "CPF".equalsIgnoreCase(typeDoc)) {
			if ("RG".equalsIgnoreCase(typeDoc)) {
				isExist = visitorRepositoryPort.findByRg(typeDoc);
			}else if("CPF".equalsIgnoreCase(typeDoc)) {
				isExist = visitorRepositoryPort.findByCpf(typeDoc);
			}
		}else {
			throw new BusinessException("Field 'typeDoc' is required!");
		}
		
		return isExist.isPresent() ? isExist.get() : null;
	}

}
