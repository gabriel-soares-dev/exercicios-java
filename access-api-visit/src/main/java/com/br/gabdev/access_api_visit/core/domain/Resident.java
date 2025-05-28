package com.br.gabdev.access_api_visit.core.domain;

public class Resident {
	
	private Long id;
	private String cpf;
	private String address;
	private String cellphone;
	private Person person;
	
	public Resident() {
		super();
	}

	
	
	public Resident(Long id, String cpf, String address, String cellphone, Person person) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.address = address;
		this.cellphone = cellphone;
		this.person = person;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}

	
	

}
