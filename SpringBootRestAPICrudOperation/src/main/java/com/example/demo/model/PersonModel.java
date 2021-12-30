package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persontbl")
public class PersonModel {
	
	@Id
	@GeneratedValue
	private int Id;

	private String firstname;
	
	private String lastname;
	
	private String address;

	public PersonModel(int id, String firstname, String lastname, String address) {
		super();
		Id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}

	public PersonModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
