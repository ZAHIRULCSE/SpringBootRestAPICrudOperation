package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.PersonRepository;
import com.example.demo.model.PersonModel;

@Service
public class PersonServices {
	
	@Autowired
	PersonRepository personRepository;

	public PersonModel savePerson(PersonModel personModel) {
		// TODO Auto-generated method stub
		return personRepository.save(personModel);
	}

	public List<PersonModel> getAllPersonModel() {
		return (List<PersonModel>)personRepository.findAll();
		// TODO Auto-generated method stub
		
	}



	public PersonModel getPersonModelById(int id) {
		// TODO Auto-generated method stub
		return personRepository.findById(id);
	}
	

	public PersonModel updatePerson(PersonModel personModel) {
		// TODO Auto-generated method stub
		return personRepository.save(personModel);
	}



	public void deletePersonById(int id) {
		// TODO Auto-generated method stub
		personRepository.deleteById(id);
	}

	

	public void deleteAllPersons() {
		// TODO Auto-generated method stub
		personRepository.deleteAll();
	}

	

}
