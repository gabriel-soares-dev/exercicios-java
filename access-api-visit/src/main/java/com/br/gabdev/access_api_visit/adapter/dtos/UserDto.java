package com.br.gabdev.access_api_visit.adapter.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
	
	private Long id;
	private String name;
	private String email;
	private String password;
	private Boolean isADM;

}
