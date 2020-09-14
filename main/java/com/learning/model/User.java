package com.learning.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
public class User {
	@Id
	@Generated(comments = "data", value = { "this is trial" })
	long id;
	
	@Column(name ="name")
	@NotNull(message = "Frist Name field can't be empty!!!")
	String name;
	
	@Column(name ="email")
    @NotBlank(message = "Email is mandatory")
	String email;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
	


}
