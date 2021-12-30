package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PersonModel;
import com.example.demo.services.PersonServices;

@RestController
@RequestMapping("/api")
public class Controller {

//	@RequestMapping(value="/name",method = RequestMethod.GET)
//	public String getName() {
//		return "Hi Zahir";

	@Autowired
	PersonServices personServices;

	@PostMapping("/save/persons")
	public PersonModel savePerson(@RequestBody PersonModel personModel) {
		PersonModel pm = personServices.savePerson(personModel);
		return pm;

	}

	@GetMapping("/getAllPerson")
	public List<PersonModel> getAllPersonModel() {
		List<PersonModel> personModel = personServices.getAllPersonModel();
		return personModel;

	}

	@GetMapping("/GetPersonById/{id}")
	public PersonModel getPersonModelById(@PathVariable int id) {
		PersonModel personModelById = personServices.getPersonModelById(id);
		return personModelById;
	}

	@PutMapping(value = "/update")
	public PersonModel updatePerson(@RequestBody PersonModel personModel) {
		PersonModel persondetails = personServices.updatePerson(personModel);
		persondetails.setFirstname(persondetails.getFirstname());
		persondetails.setLastname(persondetails.getLastname());
		persondetails.setAddress(persondetails.getAddress());
		return persondetails;

	}
	@DeleteMapping(value="/deletePerson/{id}")
	public void deletePersonById(@PathVariable int id) 
	{
		personServices.deletePersonById(id);
		
	}
	
	@DeleteMapping(value="/deleteAll")
	public void deleteAllPersons() 
	{
		personServices.deleteAllPersons();
	}

}
