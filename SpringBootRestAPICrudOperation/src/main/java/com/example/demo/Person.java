package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Person {
	
	int personId;
	String personName="zahir";
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Person Object is running....");
	}
	public int getPersonId() {
		return 1;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String name) {
		this.personName = name;
	}
	
	public void message() {
		System.out.println("Hi...i'm from person class");
	}
}
