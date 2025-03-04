package com.br.gabdev.access_api_visit.core.domain;

public class Visitor {
	
	private Long id;
	private Integer typeDoc;
	private String valueDoc;
	private Long idPerson;
	
	
	public Visitor(Integer typeDoc, String valueDoc, Long idPerson) {
		super();
		this.typeDoc = typeDoc;
		this.valueDoc = valueDoc;
		this.idPerson = idPerson;
	}
	
	public Integer getTypeDoc() {
		return typeDoc;
	}
	public void setTypeDoc(Integer typeDoc) {
		this.typeDoc = typeDoc;
	}
	public String getValueDoc() {
		return valueDoc;
	}
	public void setValueDoc(String valueDoc) {
		this.valueDoc = valueDoc;
	}
	public Long getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}
	public Long getId() {
		return id;
	}

}
