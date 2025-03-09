package com.br.gabdev.access_api_visit.core.domain;


public class User {

	private Long id;
	private String name;
	private String email;
	private String password;
	private Boolean isADM;
	private Long idPerson;
	
	
	public User() {
		super();
	}

	public User(Long id, String name, String email, String password, Boolean isADM) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.isADM = isADM;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getIsADM() {
		return isADM;
	}
	public void setIsADM(Boolean isADM) {
		this.isADM = isADM;
	}
	public Long getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}
	
}
