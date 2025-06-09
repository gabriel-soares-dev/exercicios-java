package com.br.gabdev.access_api_visit.core.ports;


import com.br.gabdev.access_api_visit.core.domain.Visitor;

public interface VisitorServicePort {
	
	Visitor createVisitor(Visitor visitor);

	Visitor obtainVisitor(String typeDoc);
}
