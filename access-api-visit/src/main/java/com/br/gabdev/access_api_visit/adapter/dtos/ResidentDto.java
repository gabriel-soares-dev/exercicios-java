package com.br.gabdev.access_api_visit.adapter.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResidentDto {
	
	private Long id;
	private String cpf;
	private String address;
	private String cellphone;
	private String namePerson;
	
}
