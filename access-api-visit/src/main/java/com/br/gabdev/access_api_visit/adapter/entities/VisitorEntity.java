package com.br.gabdev.access_api_visit.adapter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tbl_visitor")
public class VisitorEntity {
	
	@Id
	@GeneratedValue
	private Long id;
	private String typeDoc;
	private String valueDoc;
	@OneToOne
	@JoinColumn(name = "person_id")
	private PersonEntity person;

}
