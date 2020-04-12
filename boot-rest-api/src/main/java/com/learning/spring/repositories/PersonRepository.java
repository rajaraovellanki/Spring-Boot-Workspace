package com.learning.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.spring.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>
{
	
}
