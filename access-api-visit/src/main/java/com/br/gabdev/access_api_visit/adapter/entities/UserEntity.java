package com.br.gabdev.access_api_visit.adapter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserEntity {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String email;
	private String password;
	private Boolean isADM;
	
}
