package com.br.gabdev.access_api_visit.core.domain;

public class Person {
	
	private Long id;
	private String nome;
	 
	public Person() {
		super();
	}

	public Person(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
