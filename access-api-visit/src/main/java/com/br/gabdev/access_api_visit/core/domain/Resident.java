package com.br.gabdev.access_api_visit.core.domain;

public class Resident {
	
	private Long id;
	private String cpf;
	private String address;
	private String cellphone;
	private Long idPerson;
	
	public Resident() {
		super();
	}

	public Resident(Long id, String cpf, String address, String cellphone, Long idPerson) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.address = address;
		this.cellphone = cellphone;
		this.idPerson = idPerson;
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
	public Long getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}
	
	

}
