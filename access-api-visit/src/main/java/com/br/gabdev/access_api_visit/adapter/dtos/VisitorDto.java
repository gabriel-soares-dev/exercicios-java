package com.br.gabdev.access_api_visit.adapter.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VisitorDto {
	
	private Long id;
	private String typeDoc;
	private String valueDoc;
	private String namePerson;
	
}
