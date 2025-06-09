package com.br.gabdev.access_api_visit.adapter.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.gabdev.access_api_visit.adapter.converters.VisitorConverter;
import com.br.gabdev.access_api_visit.adapter.dtos.VisitorDto;
import com.br.gabdev.access_api_visit.core.domain.Visitor;
import com.br.gabdev.access_api_visit.core.ports.VisitorServicePort;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/visitor")
@RequiredArgsConstructor
public class VisitorController {
	
	private final VisitorServicePort visitorServicePort;
	private final VisitorConverter visitorConverter;
	
	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED, reason = "Visitor created with success!")
	public VisitorDto create(@RequestBody VisitorDto visitorDto) {
		Visitor newVisitor = visitorServicePort.createVisitor(visitorConverter.toDomain(visitorDto));
		return visitorConverter.toDto(newVisitor);
	}
	
	@GetMapping("/{typeDoc}")
	public VisitorDto visitorByTypeDoc(@PathVariable String typeDoc){
		return visitorConverter.toDto(visitorServicePort.obtainVisitor(typeDoc));
	}
	
}
