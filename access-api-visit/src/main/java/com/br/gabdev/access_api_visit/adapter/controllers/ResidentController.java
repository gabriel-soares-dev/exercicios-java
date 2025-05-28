package com.br.gabdev.access_api_visit.adapter.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.gabdev.access_api_visit.adapter.converters.ResidentConverter;
import com.br.gabdev.access_api_visit.adapter.dtos.ResidentDto;
import com.br.gabdev.access_api_visit.core.domain.Resident;
import com.br.gabdev.access_api_visit.core.ports.ResidentServicePort;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/residents")
@RequiredArgsConstructor
public class ResidentController {

	private final ResidentServicePort residentServicePort;
	private final ResidentConverter residentConverter;
	
	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED, reason = "Resident created with success!")
	public ResidentDto create(@RequestBody ResidentDto residentDto) {
		Resident newResident = residentServicePort.createResident(residentConverter.toDomain(residentDto));
		return residentConverter.toDto(newResident);
	}
	
}
