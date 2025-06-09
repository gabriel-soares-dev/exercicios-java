package com.br.gabdev.access_api_visit.core.domain;

public class Visitor {
	
	private Long id;
	private String typeDoc;
	private String valueDoc;
	private Person person;
	
	
	public Visitor(Long id, String typeDoc, String valueDoc, Person person) {
		super();
		this.id = id;
		this.typeDoc = typeDoc;
		this.valueDoc = valueDoc;
		this.person = person;
	}
	
	public String getTypeDoc() {
		return typeDoc;
	}
	public void setTypeDoc(String typeDoc) {
		this.typeDoc = typeDoc;
	}
	public String getValueDoc() {
		return valueDoc;
	}
	public void setValueDoc(String valueDoc) {
		this.valueDoc = valueDoc;
	}
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Long getId() {
		return id;
	}

}
