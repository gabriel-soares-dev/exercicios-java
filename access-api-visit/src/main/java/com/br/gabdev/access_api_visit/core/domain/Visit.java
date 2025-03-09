package com.br.gabdev.access_api_visit.core.domain;

import java.time.LocalDateTime;

public class Visit {
	
	private Long id;
	private LocalDateTime dataHora;
	private Long idResident;
	private Long idVisitor;
	
	
	public Visit() {
		super();
	}

	public Visit(Long id, LocalDateTime dataHora, Long idResident, Long idVisitor) {
		super();
		this.id = id;
		this.dataHora = dataHora;
		this.idResident = idResident;
		this.idVisitor = idVisitor;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public Long getIdResident() {
		return idResident;
	}
	public void setIdResident(Long idResident) {
		this.idResident = idResident;
	}
	public Long getIdVisitor() {
		return idVisitor;
	}
	public void setIdVisitor(Long idVisitor) {
		this.idVisitor = idVisitor;
	}
	
	

}
