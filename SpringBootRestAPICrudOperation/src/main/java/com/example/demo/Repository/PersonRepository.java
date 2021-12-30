package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PersonModel;

public interface PersonRepository extends JpaRepository<PersonModel, Integer>{
	
	PersonModel findById(int id);
}
